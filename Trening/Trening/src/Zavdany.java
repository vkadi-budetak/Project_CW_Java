public class Zavdany {
    public static void main(String[] args) {

    }
}
/*
/// Рівень 1 — розігрів (цикли, if, повернення значень)

printRangeIncl(int a, int b)
Надрукуй усі числа від a до b включно. Якщо a>b — друкуй у зворотному порядку.
Підказка: два варіанти циклу або один з умовним кроком.

sumEvenInRange(int a, int b) → int
Поверни суму парних чисел на відрізку [a;b] включно.
Порада: стартуй з першого парного і крокуй i += 2.

factorial(int n) → long
Поверни n! для n>=0. Для n<0 — кидай IllegalArgumentException.
Порада: 0! = 1; цикл від 2 до n.

countTrue(boolean[] ar) → int
Поверни кількість true в масиві.
Порада: звичайний індексний for.

isLeapYear(int year) → boolean
Високосний рік: ділиться на 400, або ділиться на 4 і не ділиться на 100.

/// Рівень 2 — масиви (індекси, підрахунки, розворот)

sumOddIndex(int[] ar) → int
Сума елементів із непарними індексами (1,3,5,…).

countOccurrences(int[] ar, int value) → int
Поверни, скільки разів value зустрічається в ar.

firstIndexOf(int[] ar, int value) → int
Поверни індекс першого входження value або -1, якщо нема.

indexLastMin(int[] ar) → int
Поверни індекс останнього мінімального елемента.
Порада: тримай minIdx; оновлюй на <=.

reverseInPlace(int[] ar) → void
Розверни масив «на місці».
Порада: два вказівники: i зліва, j справа.

/// Рівень 3 — рядки, switch, рандом

joinReverseNoTrailingComma(String[] ar) → String
Побудуй рядок у зворотному порядку, елементи розділяй комою без коми в кінці.
Порада: додавай кому, якщо i>0.

calc(double a, double b, char op) → double
Використай стрілочний switch (+ - * /). Для невідомого оператора поверни Double.NaN.

sumNOddRandoms(int l, int r, int n) → int
Поверни суму n випадкових непарних чисел у [l;r].
Порада: у циклі генеруй x у [l;r], якщо x непарне — додавай і зменшуй лічильник.

avgOfEven(int[] ar) → double
Середнє значення парних елементів. Якщо парних нема — поверни 0.0.
Порада: тримай sum і count.

rotateRight(int[] ar, int k) → void
Поверни масив праворуч на k (in-place).
Підказка-лайфхак: зроби три розвороти: весь масив, перші k%len, решта.
 */