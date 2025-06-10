package pertemuan14.latihan2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;

    public HelloWorldForm2(){
        label = new JLabel();
        label.setText("halo dunia");

        add(label);
        setTitle("program utama");

        setSize(600, 300);
    }
}
