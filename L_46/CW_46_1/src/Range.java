public class Range {
    private int min, max; // принимаю 2 параметры

    // Конструктор
    public Range(int min, int max) {
        if (min >= max)
            throw new RuntimeException(">>>>>>>>>>>>>>>>>>>>>> min >=max"); // стандартный Exception и говрим что min >=max
        this.min = min;
        this.max = max;
    }

    // создаю метод проверки числа (определяем был перелет или недолет)
    public void checkNumber(int number) throws RuntimeException {
        if (number < min)
            throw new NumberLessMinException(number + "<min"); // недолет бросаю Exception - NumberLessMinException
        if (number > max)
            throw new NumberGreaterMaxException(number + ">max"); // перелет бросаю Exception - NumberGreaterMaxException
    }
}