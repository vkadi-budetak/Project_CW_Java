import java.util.Arrays;

public class CW_19_2 {
    public static void main(String[] args) {
        int[] ar1={10,60,20,40,30,80,90,50,70};
        System.out.println(Arrays.toString(ar1));
        selectionSort(ar1);
        System.out.println(Arrays.toString(ar1));
        int[] ar2={10,60,20,40,30,80,90,50,70};
        System.out.println(Arrays.toString(ar2));
        bubbleSort(ar2);
        System.out.println(Arrays.toString(ar2));
    }

    ///  Перебираэмо МАСИВ
    private static void bubbleSort(int[] ar) {
        int n= ar.length;
        boolean swapped;
        for (int i=0; i<n-1;i++){
            swapped=false;
            for (int j=0; j<n-i-1; j++){
                if (ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) break;
        }
    }

    ///  Перебираэмо МАСИВ
    private static void selectionSort(int[] ar) {
        for (int i=0; i<ar.length-1;i++){
            int minIndex=i;
            for (int j=i+1; j< ar.length;j++){
                if (ar[j]<ar[minIndex])
                    minIndex=j;
            }
            int temp=ar[i];
            ar[i]=ar[minIndex];
            ar[minIndex]=temp;
        }
    }
}

/*
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
