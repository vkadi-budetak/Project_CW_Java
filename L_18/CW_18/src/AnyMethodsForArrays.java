public class AnyMethodsForArrays {
    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + "  ");
        System.out.println();
    }

    public static void printArray(double[] ar) {
        for (double element : ar)
            System.out.print(element + "  ");
        System.out.println();
    }

    public static int[] mergeIntArrays(int[] ar1, int[] ar2) {
        // создаем итоговый пока пустой массив нужной длины
        int[] mergeArr = new int[ar1.length + ar2.length];
        // заливаем все элементы из первого массива
        for (int i = 0; i < ar1.length; i++) {
            mergeArr[i] = ar1[i];
        }
        // заливаем все элементы из второго массива после уже залитых
        for (int i = 0; i < ar2.length; i++) {
            mergeArr[ar1.length + i] = ar2[i];
        }
        return mergeArr;
    }

    public static int[] mergeIntArrays2( // учебный код
                                         int[] ar1, int[] ar2) {
        int[] arMerge = new int[ar1.length + ar2.length];
        int indexMerge = 0;

        for (int i = 0; i < ar1.length; i++, indexMerge++)
            arMerge[indexMerge] = ar1[i];

        for (int i = 0; i < ar2.length; i++, indexMerge++)
            arMerge[indexMerge] = ar2[i];

        return arMerge;
    }

    public static void reverseArray(int[] ar) {                     // 10 15 17 13
        for (int i = 0, j = ar.length - 1; i < j; i++, j--){        // i>>     <<j
            int temp = ar[i]; //SWAP step1
            ar[i] = ar[j]; //SWAP step2
            ar[j] = temp; //SWAP step3
        }
    }

    public static double minInArray(double[] ar) {
        double min = ar[0];
        for (double a: ar){
            if (a <min)
                min=a;
        }
        return min;
    }

    public static int indexMaxInArrayFirst(double[] ar) {
        int index = 0;
        for(int i = 0; i<ar.length; i++){
            if (ar[i]>ar[index])
                index = i;
        }
        return index;
    }

    public static int countValueInArray(String[] ar, String st) {
        int counter = 0;
        for (String s: ar){
            if (s.equals(st))counter++;
        }
        return counter;
    }

    public static double avgLenghtNamesInArray(String[] names) {
        double avgRes = 0.0, sumLength = 0.0;
        for (String s: names){
            sumLength = sumLength + s.length();

        }
        avgRes = sumLength/names.length; // double/int = double;
        return avgRes;
    }
}


/*
Adv extra task
На сегодня-завтра
{1,7,3,9,5}  {2,8,6,0,4,10}
объедините два исходных массива так, чтобы итоговый новый массив
сразу был отсортирован (сортировки нельзя применять ни к одному массиву}
{0,1,2,3,4,5,6,7,8,9,10,22,22,22}
HINT
как разложит на стол по порядку монетки 7 летний ребенок разбивший свои две копилки?
 */

