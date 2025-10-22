// создаем интерфейс динамического массива

import java.util.Objects;

public interface IDynamicArray {
    boolean add(Object obj);
    boolean add(Object obj, int index); // добавлять в массив по индексу
    Object get(int index); // получить елемент с массива
    int size();
    int indexOf(Object obj);
    int lastIndexOf(Object obj); // получить последний елемент с массива
    Object remove(int index); // удалять по индексу и возврат удаленный
    boolean remove(Object obj); // удаляю по обьекту
    boolean contains(Object obj); // есть елемент или нет
    Object[] toArray(); // переводим в массив
}