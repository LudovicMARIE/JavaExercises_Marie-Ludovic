public class Main {
    public static void main(String[] args) {
        //exercice 1
        System.out.println("Exercice 1");
        int age = 25;
        String name = "Alex";
        System.out.println(name+age);

        System.out.println(" ");

        //exercice 2
        System.out.println("Exercice 2");
        double price = 19.99;
        int quantity = 12;
        double total = price*quantity;

        System.out.println(total);

        System.out.println(" ");

        //exercice 3
        System.out.println("Exercice 3");
        String name2 = "Halil";
        int age2 = 27;
        String job = "développeur";
        System.out.println("Je m'appelle "+name2+", j'ai "+age2+" ans et je suis "+job);

        System.out.println(" ");

        //exercice 4
        System.out.println("Exercice 4");
        String str = "Hello World!";
        int i = 0;
        while (i<str.length()){
            System.out.print(str.charAt(i));
            if (i != str.length() - 1) {
                System.out.print(" ");
            }
            i++;
        }

        System.out.println(" ");
        System.out.println(" ");

        //exercice 5
        System.out.println("Exercice 5");
        String str2 = "abcdefghijklmnopqrstuvwxyz";
        int i2 = 0;

        while (i2 < str2.length()) {
            if(i2 % 2 == 1){
                System.out.print(str2.charAt(i2));
            }

            i2++;
        }

        System.out.println(" ");
        System.out.println(" ");

        //exercice 6
        System.out.println("Exercice 6");
        String str3 = "abcdefghijklmnopqrstuvwxyz";
        int i3 = str3.length();

        while (i3 > 0) {
            System.out.print(str3.charAt(i3 - 1));
            i3--;
        }

        System.out.println(" ");
        System.out.println(" ");

        //exercice 7
        System.out.println("Exercice 7");
        int i4 = 0;
        int temp = 0;
        for (i4=0;i4<=10;i4++){
            temp = i4 * 5;
            System.out.println(i4+" x 5 = "+temp);
        }
    }
}