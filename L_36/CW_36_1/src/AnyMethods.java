/* Методы должны возвращать верное значения вычеслений.
Если это не возможно то верни 0
 */

public class AnyMethods {
    public static int parseAndSum(String s1, String s2) {
        // ЛОВИМ ошибки на пробелы на null...
        if (s1 == null || s2 == null || s1.isBlank() || s2.isBlank() ||
                s1.length() != s1.trim().length() || s2.length() != s2.trim().length()) return 0; // Первая - часть проверок на негативный сценарий

        // ЛОВИМ посторонние символы
        if (s1.length() > 11 || s2.length() > 11)
            return 0; // если строка больше 11 символов то мы возвращаем 0(максимальное количетсво 7, потому что 1000000)
        if (isNotValidInt(s1) || isNotValidInt(s2)) return 0; // Вторая - часть проверок на негативный сценарий

        int n1 = Integer.parseInt(s1); // - ПОЗИТИВНЫЕ СЦЕНАРИИ
        int n2 = Integer.parseInt(s2); // - ПОЗИТИВНЫЕ СЦЕНАРИИ

        // Третья - часть проверок на негативный сценарий
        long res=(long)n1 + (long)n2;
        if(res<Integer.MIN_VALUE || res> Integer.MAX_VALUE) return 0;

        return n1 + n2; // - // ПОЗИТИВНЫЕ СЦЕНАРИИ
        // "1234" и "-34" -> (Должны получить) 1234 + (-34) = 1200і
    }


    //метод проверки строки на допустимость
    // Вторая - часть проверок на негативный сценарий
    private static boolean isNotValidInt(String s) {
        if (s == null || s.isBlank()) return true;
        s = s.trim();
        int start = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0; // проверяем ли начинается строка с + или -
        if (start == 1 && s.length() == 1) return true; // проверяем наличии '-' '+' тут
        for (int i = start; i < s.length(); i++)
            if (!Character.isDigit((s.charAt(i)))) return true; // я защищиаюсь от (программа ловит) "123w45" "-23a45"
        // Character.isDigit - проверяет цифра или не цифра

        if (s.length() > 11) return true; // проверяю вместимость(переполннения) - 111111///1111111 50 шт едениц
        long res = Long.parseLong(s); // Проверяем на допустимость 2_500_000_000
        if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE) return true;

        return false;
    }

    public static int parseAndSumElementInArray(String s, int[] ar, int i) {
        int n1 = ar[i];
        int n2 = Integer.parseInt(s);
        return n1 + n2;
    }

    // "123" и {4,3,7,0} 1 -> (Должны получить) 1213 + 3 = 126
}

