import java.util.Arrays;

/**
 * Нештатные ситуации - Exception
 */
public class MainExceptionsIntro {
    public static void main(String[] args) {
        System.out.println("Start program");
        System.out.println(Arrays.toString(args)); // - получу пустой масиив

        //Обработка нештатно ситуации
        try {
            Integer res = getNumber(args[0]); // и на этой строке я получу ошибку(нештатная ситуация)
            System.out.println(1000 / res);
        }
//        catch (Exception e) { // обработка на все Exception
//            System.out.println("Не понятно что случилось");
//        } // ERRORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

        catch (ArrayIndexOutOfBoundsException e) { // обработка на ArrayIndexOutOfBoundsException
            System.out.println("Integer number must be entered");
            System.out.println(1000 / 2);
        } catch (NumberFormatException |
                 NullPointerException e) { // обработка на NumberFormatException и NullPointerException
            System.out.println(args[0] + " is not a number");
            Integer res = 1;
            System.out.println(1000 / (res + 1));
        } catch (Exception e) { // обработка на все Exception
            System.out.println("Не понятно что случилось");
        }

        System.out.println("=====================================");
        int x = 10;
        int y = 0;
        try {
            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println("Alarm!!!!!");
            System.out.println(e.getMessage()); // выведу Message
//            System.out.println(e.getLocalizedMessage()); // выведу LocalMessage
//            System.out.println(e.getStackTrace()); // выведу
            System.out.println(e.getClass()); // показывает клас к которому относится Exception
        }

        System.out.println("=====================================");
        // является числом то что я передаю?
        System.out.println(isNumber("1")); // true
        System.out.println(isNumber("1.1")); // true
        System.out.println(isNumber("null")); // false
        System.out.println(isNumber("qqq")); // false
        System.out.println(isNumber("1,1")); // false


        System.out.println("Finish program");


    }

    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s); // попробует распарсить
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        } finally {
            System.out.println("finally - Закрываю все соединения");
        }


    }

    private static Integer getNumber(String s) {
        return Integer.parseInt(s);


    }
}
/**
 * КОНСТРУКЦИИ
 */
// try - catch
// try - catch - catch ...
// try - catch(...|... |...) - catch ...
// try - catch... - finally(выполниться в любом случаи в независимо у нас отработал try или catch)
// try - finally(выполниться в любом случаи в независимо у нас отработал try или catch)