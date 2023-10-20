import javax.swing.*;

public class morpionSwing {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setText("test");
        label1.setVisible(true);


        JFrame frame = new JFrame("Mon application");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(label1);


    }
}
