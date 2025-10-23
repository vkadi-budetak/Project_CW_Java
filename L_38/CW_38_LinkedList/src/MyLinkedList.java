public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;


    @Override
    public void add(String element) {  // добавления елемента
        Node node = new Node(null, element, null); // создание нового узла
        if (head == null) { // если лист пустой то новоя нода это его голова и хвост
            head = node;
            tail = node;
        } else {
            tail.setNext(node); // старый хвост знает что за ним новый узел
            node.setPrev(tail); // новый узел знает что перед ним старый хвост
            tail = node; //  теперь хвост это новый узел
        }
        size++; // после добавления узла увеличиваем на 1 размер листа
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) { // хочу получить значения по индексу
        if (index >=0 && index < size)
            return getNodeByIndex(index).getValue();
        else return null;
    }

    // метод который возвращает целый узел по индексу
    private Node getNodeByIndex(int index) {
      int counter = 0;
      if (index < 0 || index >=size) return null;
      Node currentNode = head;
      while (currentNode != null && counter < index) {
          currentNode = currentNode.getNext();
          counter++;
      }
      return currentNode;
    }

    @Override
    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    @Override
    public String remove(int index) {
        Node node = getNodeByIndex(index); // Находим в листк удаляемую ноду
        if (node == null) return null;

        Node prev = node.getPrev(); // узел перед удаляемым
        Node next = node.getNext(); // узел после удаляемого

        if (prev == null) { // если удаляемая нода была головой
            head = next; // тогда головой будет следующая нода
        }
        else {
            prev.setNext(next); // тот кто до удаляемого узла смотрит на следующий после удаляемого
        }

        if (next == null){ // если удаляемая нода была хвостом
            tail = prev; // переназначаем хвост
        }
        else {
            next.setPrev(prev); // узел после удаляемого теперь смотрит на предедущий до удаляемого
        }

        node.setPrev(null); // чистим в удаляемой ноде ссылку на предидущую
        node.setNext(null); // чистим в удаляемой ноде ссылку на следующую
        String deleteValue = node.getValue(); // сохраняем удаляемое значение для последующего возврата
        node.setValue(null); // чистим в удаляемой ноде собственно значение

        size --; // уменьшаем размер листа на 1
        return deleteValue;
    }
}
