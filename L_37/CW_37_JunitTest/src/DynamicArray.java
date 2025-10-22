import java.util.Arrays;

public class DynamicArray implements IDynamicArray{
    private Object[] array; // декларирую обеет но не создаю
    private int size=0;
    private static final int INITIAL_SIZE = 16;

    // КОНСТРУКТОР - метод збільшення масива
    public DynamicArray(int initialSize){
        if (initialSize>INITIAL_SIZE) array = new Object[initialSize];
        else array=new Object[INITIAL_SIZE];
    }

    // КОНСТРУКТОР
    public DynamicArray(){
        this(INITIAL_SIZE);
    }

    @Override
    public boolean add(Object obj) {  // добавляем элемент в конец массива
        if (obj==null) return false;

        if(array.length == size) allocateArray(); // eсли места нет в массиве вызываю allocateArray
        array[size++]=obj;
        return true;
    }

    private void allocateArray() { // создает новый массив двойной длины и
        // копирует в него элементы из старого массива
        array= Arrays.copyOf(array,array.length*2);
        System.out.println("Allocated");
    }

    @Override
    public boolean add(Object obj, int index) {
        if (index<0 || index>size || obj==null) return false;
        if(index==size) return add(obj); // добавление элемента в конец массива
        if (size==array.length) allocateArray();// если место кончилось то
        //  надо перевыделить место под массив
        System.arraycopy(array,index,array,index+1, size-index); // раздвинуть
        // массив под последующую вставку элемента по требуемому индексу
        //  1 3 5 7 9 , i=2     1 3 3 5 7 9      1 3 new 5 7 9
        array[index]=obj;  // собственно вставка нового значения поверх старого ненужного
        size++;    // увеличиваем число элементов на 1 так как вставили один новый элемент
        return true;
    }

    @Override
    public Object get(int index) {
        Object res=null;
        if (index>=0 && index<size) res=array[index];// проверка индекса на корректность
        return res;
    }

    @Override
    public int size() { // гетер на поле "количество элементов в массиве"
        return size;
    }

    @Override
    public int indexOf(Object obj) { // верни индекс первого
        // попавшегося совпадающего элемента
        if (obj==null) return -1;
        for (int i=0; i<size; i++)
            if (array[i].equals(obj))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {// верни индекс
        // последнего совпадающего элемента
        if (obj==null) return -1;
        for (int i=size-1; i>=0; i--)
            if(array[i].equals(obj))
                return i;
        return -1;
    }

    @Override
    public Object remove(int index) {
        if (index<0 || index>=size) return null;
        Object res=array[index];
        if(index<size-1) // если удаляемый  элемент не последний в массиве
            System.arraycopy(array,index+1,array, index, size-index-1);
        size--;
        return res;
    }

    @Override
    public boolean remove(Object obj) {
        int index=indexOf(obj); // находим первый совпадающий
        // элемент и получаем его индекс
        return remove(index) != null; // если по этому индексу смогли удалить
        // то возвращаем true а если индекс -1 то удаление не пройдет
        // и возвращаем false
        // если надо удалить все такие элементы то можно например так
        // while(true) { if (remove(obj)==false) break;}
    }

    @Override
    public boolean contains(Object obj) { // проверяем на наличие элемента
        return indexOf(obj)>=0;
    }

    @Override
    public Object[] toArray() { // вернуть обычный массив не динамический
        // на заполненные элементы
        return Arrays.copyOf(array,size);
    }
}

