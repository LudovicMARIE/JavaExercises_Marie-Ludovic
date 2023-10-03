public class P3_exo1_2 {
    public static void main(String[] args) {
        //Exercice 1 & 2
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int i;
        for (i=min;i<=max;i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz ");
            }else if(i % 3 == 0){
                System.out.print("Fizz ");
            }else if(i % 5 == 0){
                System.out.print("Buzz ");
            }else{
                System.out.print(i+" ");
            }

        }
    }
}
