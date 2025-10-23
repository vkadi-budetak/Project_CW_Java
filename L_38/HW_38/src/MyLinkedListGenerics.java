public class MyLinkedListGenerics<T> implements MyListGenerics<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    @Override
    public void add(T element) {  // добавления елемента
        Node<T> node = new Node<T>(null, element, null); // создание нового узла
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
    public T get(int index) { // хочу получить значения по индексу
        if (index >=0 && index < size)
            return getNodeByIndex(index).getValue();
        else return null;
    }

    // метод который возвращает целый узел по индексу
    private Node<T> getNodeByIndex(int index) {
        int counter = 0;
        if (index < 0 || index >=size) return null;
        Node<T> currentNode = head;
        while (currentNode != null && counter < index) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode;
    }

    @Override
    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    @Override
    public T remove(int index) {
        Node<T> node = getNodeByIndex(index); // Находим в листк удаляемую ноду
        if (node == null) return null;

        Node<T> prev = node.getPrev(); // узел перед удаляемым
        Node<T> next = node.getNext(); // узел после удаляемого

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
        T deleteValue = node.getValue(); // сохраняем удаляемое значение для последующего возврата
        node.setValue(null); // чистим в удаляемой ноде собственно значение

        size --; // уменьшаем размер листа на 1
        return deleteValue;

    }
}
