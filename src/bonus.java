import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        //String arg = args[0];
        //int h = Integer.parseInt(arg);
        int h = 5;

        int height = 1;
        for(int a = 0;a<h;a++){
            for (int i = 0; i < height+3; i++) {
                for (int j = 0; j < height + 3 - i - a + (h*3) - (a*2) - (a/2); j++) {
                    System.out.print(" ");

                }

                for (int k = 0; k < (2 * i + 1 - (k%2) + (a*5)); k++){

                    System.out.print("*");
                }

                System.out.println();
            }
            height=height+1;
        }
        for(int tronc = 0;tronc<h;tronc++){
            for (int spacetronc = 0; spacetronc<(h*3);spacetronc++){
                System.out.print(" ");
            }
            for(int tronc2 = 0;tronc2<h;tronc2++){
                System.out.print("|");
            }
            System.out.println(" ");
        }

        //int h = 3;
        //for(int i = 1;i <= h;i++)
        //{
        //    for(int j = h-i;j > 0;j--)
        //    {
        //        System.out.print(" ");
        //    }
        //    for(int k = 1;k <= i;k++)
        //    {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}
    }
}
