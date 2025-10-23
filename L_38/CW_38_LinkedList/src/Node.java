public class Node {
    private Node prev; // ссылка на предедущий элемент
    private String value; // само значение
    private  Node next; // ссылка на след элемент


    // Конструткор
    public Node(Node prev, String value, Node next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    // Геттеры и Сеттеры
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
