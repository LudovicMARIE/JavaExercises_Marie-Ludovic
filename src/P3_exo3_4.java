public class P3_exo3_4 {
    public static void main(String[] args) {
        int count=0;
        int start=1;
        int end=10;

        //Exercice 3
        for (int i = start;i <=end;i++){
            if(i%2 == 0){
                count = count+i;
            }
        }
        System.out.println("La somme des nombres pairs entre "+start+" et "+end+" est: "+count);


        count=0;
        //exercice 4
        for (int i = start;i <=end;i++){
            count=count + (i*i);
        }
        System.out.println("La somme des carrés entre "+start+" et "+end+" est: "+count);
    }
}
