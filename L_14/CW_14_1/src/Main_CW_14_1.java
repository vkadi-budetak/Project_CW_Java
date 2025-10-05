public class Main_CW_14_1 {
    public static void main(String[] args) {
        //  byte short int long float double char boolean
        // + - * / %                           +   == != > < >= <= && ||

        int i1=5, i2=35, iRes;
        iRes=i1*i2;
        System.out.println(iRes);
        iRes=(int)Math.pow(i1,2);
        System.out.println(iRes);
        Integer myInt=i2;
        System.out.println(myInt+i1);
        System.out.println(myInt.doubleValue());

        Double myDouble=3.14159;
        System.out.println(myDouble*myDouble);
        System.out.println(myDouble.intValue());

        i1=100;
        char ch1='A'; //65
        iRes=i1+ch1;
        System.out.println(iRes);
        String str1="_";
        str1=str1+ch1;
        System.out.println(str1);
        System.out.println(ch1);

        boolean resBl;
        i1=5;
        i2=35;
        resBl= (i1==i2);
        System.out.println(resBl);
        resBl= (i1!=i2);
        System.out.println(resBl);
        resBl= !(i1==i2);   // NOT !
        System.out.println(resBl);
        resBl= Boolean.parseBoolean("qwert");
        System.out.println(resBl);
        resBl= i1==i2 || i1>0  || i1/i2<=0;
        System.out.println(resBl);
        resBl= !(i1!=i2 && i1>i2  && i1<i2);
        System.out.println(resBl);

        String myStr="35";
        iRes=Integer.parseInt(myStr);
        System.out.println(iRes+100);
        myStr="3.14";
        double myDbl=Double.parseDouble(myStr);
        System.out.println(Math.pow(myDbl,2));
        i1=5;
        i2=7;
        myStr=String.valueOf(i1)+i2;  // int -> String
        System.out.println(myStr);
        myStr=myInt.toString(); //  Integer -> String
        System.out.println(myStr+i2);

    }
}
