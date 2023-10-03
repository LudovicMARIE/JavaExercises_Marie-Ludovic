import java.sql.Array;
import java.util.ArrayList;


public class P3_exo5 {
    private static Integer averageCalc(ArrayList<Integer> array){
        int sum=0;
        int nbElement=0;

        for(int nb : array){
            sum = sum+nb;
            nbElement++;
        }

        return sum/nbElement;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Array= new ArrayList<Integer>();
        Array.add(75);
        Array.add(80);
        Array.add(90);
        Array.add(95);
        Array.add(85);

        System.out.println(averageCalc(Array));
    }
}
