package pertemuan14.latihan3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public HelloWorldForm3(){
        label = new JLabel();
        label.setText("Hello World");
        button = new JButton("Klik me!");
        button.addActionListener(this);

        setLayout (new GridLayout(2, 1));
        add(label);
        add(button);
        setTitle("My First Program");
        setVisible(true);
        setSize(300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        label.setText("halo dunia");
    }
}
