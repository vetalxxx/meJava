import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow2 extends JFrame {
    public MyWindow2()  {
        setLocation(200,200);
        setSize(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton Knopka = new JButton("Вот те раз");
        add(Knopka,BorderLayout.SOUTH);
        JButton Knopka2 = new JButton("Я ухожу");
        ActionListener buttonListener = new Close();
        Knopka2.addActionListener(buttonListener);
        ActionListener buttonListene = new Tap2();
        Knopka.addActionListener(buttonListene);
        JPanel Panel = new JPanel(new GridLayout(2,1));
        Panel.add(Knopka2);
        add(Panel, BorderLayout.CENTER);
        setVisible(true);
    }
}