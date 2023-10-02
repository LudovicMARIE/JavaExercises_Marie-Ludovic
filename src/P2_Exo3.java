import java.util.ArrayList;
import java.util.Objects;

public class P2_Exo3 {
    private static void countVowels(ArrayList<String> str){
        String vowels = "aeiouAEIOU";
        for (String s : str) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.indexOf(s.charAt(i)) != -1) {
                    count++;
                }
            }
            System.out.println(s + " : " + count);
        }

    }
    public static void main(String[] args) {
        ArrayList<String> quotation = new ArrayList<String>();
        quotation.add("Quand Paris s’enrhume, l’Europe a froid");
        quotation.add("S'il y a un diamant dans la poitrine, il brille sur le visage");
        quotation.add(" La joie de vivre n'est pas un but, mais un devoir");

        countVowels(quotation);
    }
}
