import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class CW_19_1 {
    public static void main(String[] args) {
        int[] ar1={10,20,30,40};
        System.out.println("1. "+Arrays.toString(ar1));

        int[] res=Arrays.copyOf(  ar1,        ar1.length-1);
        //     создай копию     Исх.Массив     на сколько элементов
        System.out.println("2. "+Arrays.toString(res));

        // создай копию  и увиличую на 2 элемента
        int[] res1 = Arrays.copyOf(ar1, ar1.length * 2);
        System.out.println("создай копию  и увиличую на 2 элемента. " + Arrays.toString(res1));
       // создай копию  и минусую элемент
        int[] res2 = Arrays.copyOf(ar1, ar1.length - 1);
        System.out.println("создай копию  и минусую элемент. " +Arrays.toString(res2));

        //меняет имеющиеся массивы
        int[] ar3=new int [ar1.length*3];
        System.out.println("3. "+Arrays.toString(ar3));
        System.arraycopy(             ar1,         0,             ar3,       5,             ar1.length-1);
        // меняет имеющиеся массивы  откуда   с какого индекса   куда   с какого индекса   сколько элементов
        System.out.println("4. "+Arrays.toString(ar3));

        int[] ar4={10,20,30,40,50,60,70,80};
        int index=3;
        System.out.println("5. "+Arrays.toString(ar4)+ " remove element with index= "+index);
        int[] ar4New=remove(ar4,index);
        System.out.println("6. "+Arrays.toString(ar4New));

        index=4;
        int value=555;
        System.out.println("7. "+Arrays.toString(ar4)+ " add element with index= "+index);
        int[] ar4NewNew=add(ar4,index,value);
        System.out.println("8. "+Arrays.toString(ar4NewNew));
    }

    private static int[] add(int[] ar, int index, int value) {     /// ДОБАВЛЯЄМО ЗНАЧЕННЯ В МАСИВ
        int[] result=new  int[ar.length+1];
        System.arraycopy(ar,0, result,0, index);
        // скопировал элементы до добавляемого
        result[index]=value;
        // добавил новый элемент под требуемым номером
        System.arraycopy(ar, index, result,index+1,ar.length-index);
        // Добавляєм все оставшийся элементы
        return result;
    }

    //                                               10 20 30 40 50 60 70 80
    private static int[] remove(int[] ar, int index) { // index=3
        int[] result = new int[ar.length-1];                       /// ВИДАЛЯЄМО ЗНАЧЕННЯ З МАСИВУ
        System.arraycopy(ar,0, result,0, index);  // 10 20 30
        // скопировал элементы до удаляемого
        System.arraycopy(ar, index+1, result,index,ar.length-index-1);  // 50 50 70 80
        // скопировал все элементы после удаляемого
        return result;
    }
}


/*
1(22)
        # Методы: площади кругов по массиву радиусов

## 🧩 Задание
Реализуйте метод sCircles(double[] r), который возвращает
массив площадей кругов s=π*r^2 для каждого радиуса.
Покажите работу метода в main.

 2(23)
 # Методы: индекс последнего минимального элемента массива

## 🧩 Задание
Реализуйте метод indexLastMinElemInArray(int[] ar),
который возвращает индекс последнего минимального элемента массива.
Покажите работу метода в main.

3(24)
# Методы: количество вхождений значения в массиве

## 🧩 Задание
Реализуйте метод countContValueInArray(int[] ar,int value),
возвращающий количество вхождений value в массиве. Покажите работу
в main.

4(25)
# Методы: индекс первого вхождения значения

## 🧩 Задание
Реализуйте метод valueInArrayIndexFirst(int[] ar,int value), который
возвращает индекс первого вхождения value или -1, если нет совпадений.
Покажите работу в main.

5(26)
# Методы: разворот массива на месте

## 🧩 Задание
Реализуйте метод reversArray(int[] ar), который разворачивает массив
на месте. Покажите работу в main.
 */