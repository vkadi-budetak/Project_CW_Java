public class Main_HW_20_1 {
    public static void main(String[] args) {
        String text = "qwert-JAVA,k;l;l-JAVA_12344llk_JAVA_lllUU";
        String sub = "JAVA";

        int printSplit = MethodSplit(text, sub);
        int printReplace = MethodReplace(text, sub);
        System.out.println("Quantity " + sub + " in method split: " + printSplit);
        System.out.println("Quantity " + sub + " in method replace: " + printReplace);
    }

    public static int MethodSplit(String text, String sub) {
        if (text == null || sub == null || sub.isEmpty()) return 0;
        return text.split(sub, -1).length - 1;
    }

    public static int MethodReplace(String text, String sub) {
        if (text == null || sub == null || sub.isEmpty()) return 0;
        return (text.length() - text.replace(sub, "").length()) / sub.length();
    }


}


/*
1(29)
# Strings: количество вхождений подстроки в строку countSubString
без циклов/рекурсии (2 способа)

## 🔤 Задание
Реализуйте два метода для `countSubString(String text, String sub)`
**без циклов и без рекурсии** (например, через `split`, `replace` и т.п.).
Покажите работу обоих подходов в `main`.

"qwert-JAVA,k;l;l-JAVA_12344llk_JAVA_lllUU"    "JAVA"  ответ 3
 */

// adv***  только по желанию
//  "aabbacdddd" распечатать частоту встречи букв в строке
//  a->3  b->2 c->1 d->4
