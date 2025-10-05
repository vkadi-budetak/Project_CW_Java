import java.util.Arrays;

public class Main_HW_19_TEST {
    public static void main(String[] args) {
        System.out.println("============ 1 ==============");
        double[] radius={1.1,3.3,2.2};
        double[] resultS=sCircles(radius);
        System.out.println(Arrays.toString(radius));
        System.out.println(Arrays.toString(resultS));

        System.out.println("=================== 2 ================");
        int[] ar1={1,6,2,8,1,6};
        System.out.println(Arrays.toString(ar1));
        System.out.println(indexLastMinElemInArray(ar1));

        System.out.println("================ 3 ================");
        int value=1;
        System.out.println(Arrays.toString(ar1) + "  "+value);
        System.out.println(countContValueInArray(ar1,value));

        System.out.println("============= 4 =====================");
        value=88;
        System.out.println(Arrays.toString(ar1) + "  "+value);
        System.out.println(valueInArrayIndexFirst(ar1,value));

        System.out.println("=============== 5 ===============");
        System.out.println(Arrays.toString(ar1));
        reversArray(ar1);
        System.out.println(Arrays.toString(ar1));

        System.out.println("============= 6 adv =============");
        int[] arr1={10,30,80,20,90};
        int[] arr2={40,90,50,70,60};
        //  10 20 30 40 50 60 70 80 90 90

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int[] mergeArr=mergeArray2(arr1,arr2);
        System.out.println(Arrays.toString(mergeArr));





    }

    private static int[] mergeArray2(int[] ar1, int[] ar2) {
        int size=ar1.length+ar2.length;
        int[] arRes=new int[size];
        int max=Integer.MAX_VALUE;

        for (int i=0; i<size; i++){
            int min1= searchMinIndex(ar1);
            int min2= searchMinIndex(ar2);

            if (ar1[min1]<=ar2[min2]){
                arRes[i]=ar1[min1];
                ar1[min1]=max;
            }
            else{
                arRes[i]=ar2[min2];
                ar2[min2]=max;
            }
        }
        return arRes;
    }

    private static int searchMinIndex(int[] ar) {
        int minInd=0;
        for (int i=0; i<ar.length;i++)
            if (ar[i]<ar[minInd])minInd=i;
        return minInd;
    }

    private static void reversArray(int[] ar) {
//        int[] copyArray=Arrays.copyOf(ar,ar.length); если надо работать с копией массива
        for (int i=0; i<ar.length/2; i++){
            int temp=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=temp;
        }
    }

    private static int valueInArrayIndexFirst(int[] ar, int value) {
        int res=-1;
        for (int i=0; i<ar.length;i++)
            if (ar[i]==value){
                // return i;
                res=i;
                break;
            }
        return res;
    }

    private static int countContValueInArray(int[] ar, int value) {
        int res=0;
        for ( int element: ar)
            if (element==value) res++;
        return res;
    }

    private static int indexLastMinElemInArray(int[] ar) {
        int indMin=0;
        for (int i=0; i<ar.length; i++){
            if (ar[i]<=ar[indMin]) indMin=i;
        }
        return indMin;
    }

    private static double[] sCircles(double[] r) {
        double[] resultS=new double[r.length];
        for (int i=0; i<r.length;i++)
            resultS[i]=Math.PI*r[i]*r[i];
        return resultS;
    }


}
/*
1(22)
        # Методы: площади кругов по массиву радиусов

## 🧩 Задание
Реализуйте метод `sCircles(double[] r)`, который возвращает
массив площадей кругов `s=π*r^2` для каждого радиуса.
Покажите работу метода в `main`.

 2(23)
 # Методы: индекс последнего минимального элемента массива

## 🧩 Задание
Реализуйте метод `indexLastMinElemInArray(int[] ar)`,
который возвращает индекс **последнего** минимального элемента массива.
Покажите работу метода в `main`.

3(24)
# Методы: количество вхождений значения в массиве

## 🧩 Задание
Реализуйте метод `countContValueInArray(int[] ar,int value)`,
возвращающий количество вхождений `value` в массиве. Покажите работу
в `main`.

4(25)
# Методы: индекс первого вхождения значения

## 🧩 Задание
Реализуйте метод `valueInArrayIndexFirst(int[] ar,int value)`, который
возвращает индекс первого вхождения `value` или `-1`, если нет совпадений.
Покажите работу в `main`.

5(26)
# Методы: разворот массива на месте

## 🧩 Задание
Реализуйте метод `reversArray(int[] ar)`, который разворачивает массив
на месте. Покажите работу в `main`.

 */

/*
1(29)
# StringBuilder/Strings: countSubString без циклов/рекурсии (2 способа)

## 🔤 Задание
Реализуйте два метода для `countSubString(String text, String sub)` **без циклов и без рекурсии** (например, через `split`, `replace` и т.п.).
Покажите работу обоих подходов в `main`.

2(30)

# StringBuilder/Strings: разворот строки без циклов/рекурсии

## 🔤 Задание
Реализуйте метод `stringReverse(String text)` **без циклов и без рекурсии**. Покажите работу в `main`.


Adv extra task
На сегодня-завтра
{1,7,3,9,5,22}  {2,8,6,22,0,4,22,10}
объедините два исходных массива так, чтобы итоговый новый массив
сразу был отсортирован (сортировки нельзя применять ни к одному массиву}
{0,1,2,3,4,5,6,7,8,9,10,22,22,22}
HINT
как разложит на столе по порядку монетки 7-летний
ребенок разбивший свои две копилки?

 */
