public class Node<T> {
    private Node<T> prev; // ссылка на предедущий элемент
    private T value; // само значение
    private Node<T> next; // ссылка на след элемент


    // Конструткор
    public Node(Node<T> prev, T value, Node<T> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    // Геттеры и Сеттеры
    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
