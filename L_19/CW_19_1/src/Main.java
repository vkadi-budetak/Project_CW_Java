import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] radiusArray={1.1,3.3,2.2};
        double[] resultS=calculateCircleAreas(radiusArray);
        System.out.println(Arrays.toString(radiusArray));
        System.out.println(Arrays.toString(resultS));

    }

    private static double[] calculateCircleAreas(double[] r) {
        double[] resultS=new double[r.length];
        for (int i=0; i<r.length;i++)
            resultS[i]=Math.PI*r[i]*r[i];
        return resultS;
    }
}

