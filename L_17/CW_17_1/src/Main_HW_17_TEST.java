public class Main_HW_17_TEST {
    public static void main(String[] args) {
        System.out.println("================== 1 =============");
        int n=5;
        printDollarsInCol(n);
        System.out.println("==================== 2 ============");
        n=7;
        System.out.println(n + " -> " +factorial(n));
        System.out.println("=============== 3 ===============");
        int min=3,max=7, summa=0;
        summa=sumEvenNumbersInRange(min,max);
        System.out.println(summa);
        System.out.println("================ 4 =============");
        int l=1,r=7,quantity=5;
        summa=sumOddRandomNumbersInRange(l,r,quantity);
        System.out.println(summa);
        System.out.println("============ 5 ==================");
        min=2;
        max=9;
        printEvenNumbersInRangeReversInCol(min,max);
    }

    private static void printEvenNumbersInRangeReversInCol(
            int min, int max) {
        for (int i=max; i>=min;i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    private static int sumOddRandomNumbersInRange(
            int l, int r, int quantity) {
        int sum=0;
        while (quantity>0){
            int randInt=(int)(l + Math.random()*(r-l+1));
            if (randInt%2!=0){
                sum+=randInt;
//                System.out.println(randInt);
                quantity--;
            }
        }
        return sum;
    }

    public static int sumEvenNumbersInRange(int min, int max) {
        if (min>max){
            System.out.println("min>max ERROR");
            return 0;
        }
        int res=0;
        for (int i=min; i<=max; i++){
            if (i%2==0)
                res+=i;
        }
        return res;
    }

    private static int factorial(int n) {
        if(n<0){
            System.out.println("Error, number not positive " + n);
            return 0;
        }

        if (n==0){
            return 1;
        }
        int res=1;
        for (int i=1; i<=n; i++){  // 1*2*3... *n
            res=res*i;
        }
        return res;
    }

    static void printDollarsInCol(int n) {
        for (int i=1; i<=n; i++){
            System.out.println("$");
        }

    }
}

/*
1(10)

# Циклы: вывести $ в столбик N раз
## 🔁 Задание
Реализуйте метод `printDollarsInCol(int dollars)`,
который печатает `$` в столбик указанное число раз.
Проверьте метод в `main`.

2(11)
# Циклы: факториал числа

## 🔁 Задание
Реализуйте метод `factorial(int number)`, возвращающий факториал числа.
Проверьте работу метода в `main`.

3(12)
# Циклы: сумма чётных чисел в диапазоне

## 🔁 Задание
Реализуйте метод `sumEvenNumbersInRange(int min,int max)`,
возвращающий сумму всех чётных чисел между `min` и `max` включительно.
Проверьте в `main`.

4(13)
# Циклы: сумма N случайных нечётных чисел

## 🔁 Задание
Реализуйте метод `sumOddRandomNumbersInRange(int l,int r,int quantity)`,
 который возвращает сумму `quantity` случайных нечётных чисел
 в диапазоне `[l;r]`.
Проверьте работу в `main`.

5(14)

# Циклы: чётные числа в обратном порядке

## 🔁 Задание
Реализуйте метод `printEvenNumbersInRangeReversInCol(int min,int max)`,
который печатает все чётные числа от `max`
до `min` в столбик. Проверьте работу метода в `main`.


 */
