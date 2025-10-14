// создаю generic-клас
public class Container<T> {
    private T item; // приватное поле

    // Создаю конструктор
    public Container(T item) {
        this.item = item;
    }

    // Создаю Геттеры и сеттеры
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    // Создаем метод isEmpty и проверяем ли пуст он?
    public boolean isEmpty() {
        return item != null;
    }
    // clear() очищает контейнер.
    public void clear() {
        this.item = null;
    }

    //Переопредеялем toString для удобного вывода
    @Override
    public String toString() {
        return isEmpty() ? "Wrapper[" + item + "]" : "Wrapper[empty]";
    }

}
