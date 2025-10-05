import java.util.Arrays;

public class Main_HW_20_TEST {
    public static void main(String[] args) {
        String str1="JAVA1234JAVA6789JAVAJAVAJAVA";
        String subStr="JAVA";
        System.out.println(countSubString1(str1,subStr));
        System.out.println(Arrays.toString(str1.split(subStr))+ "  "+ str1.split(subStr).length);
        System.out.println(countSubString2(str1,subStr));
        System.out.println("================== adv ====================");
        str1="aabbacdddd";
        System.out.println(str1);
        printCountOfChars(str1);




    }

    private static void printCountOfChars(String str1) {
        if (str1==null || str1.isEmpty()) return;
        int[] res=new int[255];
        for (char c:str1.toCharArray()) res[c]++; // A 65 res[65]++  B 66 res[66]++
        //  K 75 res[75]++
        for (int i=0; i< res.length;i++)
            if(res[i]!=0) System.out.printf("'%c'->%d  ",i,res[i]);

    }

    private static int countSubString1(String text, String sub){
        String newStr=text.trim().replace(sub,"");
        return (text.length()-newStr.length())/sub.length();
    }

    private static int countSubString2(String text, String sub){
        char ch=127;
        String newStr=text+ch;
        return newStr.split(sub).length-1;
    }
}

/*
1(29)
# Strings: количество вхождений подстроки в строку countSubString без циклов/рекурсии (2 способа)

## 🔤 Задание
Реализуйте два метода для `countSubString(String text, String sub)`
**без циклов и без рекурсии** (например, через `split`, `replace` и т.п.).
Покажите работу обоих подходов в `main`.

"qwert-JAVA,k;l;l-JAVA_12344llk_JAVA_lllUU"    "JAVA"  ответ 3
 */

// adv***  только по желанию
//  "aabbacdddd" распечатать частоту встречи букв в строке
//  a->3  b->2 c->1 d->4
