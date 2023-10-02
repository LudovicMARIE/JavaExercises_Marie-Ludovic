import java.util.ArrayList;

public class P2 {
    private static Integer sum(ArrayList<Integer> stock) {
        Integer total = 0;
        for (Integer number : stock) {
            total += number;
        }
        return total;
    }
    private static int findFruit(ArrayList<String> tab, String str) {
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //Exercice 1
        ArrayList<Integer> stock = new ArrayList<Integer>();
        stock.add(14);
        stock.add(887);
        stock.add(58);
        stock.add(713);
        stock.add(179);
        stock.add(512);
        stock.add(786);
        stock.add(29);

        System.out.println("Contenu du stock : "+sum(stock));



        //Exercice 2
        ArrayList<String> tab = new ArrayList<String>();
        tab.add("kiwi");
        tab.add("pomme");
        tab.add("poire");
        tab.add("litchi");
        tab.add("rhubarbe");

        int findIndex = findFruit(tab, args[0]);
        if (findIndex == -1) {
            System.out.println("Le fruit " + args[0] + " n'est pas dans la liste.");
        } else {
            System.out.println("Le fruit " + args[0] + " est à l'index " + findIndex + " dans la liste.");
        }
    }
}