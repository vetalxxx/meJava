import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow()  {
        setLocation(300,100);
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton Knopka = new JButton("Жми");
        add(Knopka,BorderLayout.SOUTH);
        JButton Knopka2 = new JButton("Я ухожу");
        ActionListener buttonListener = new Close();
        Knopka2.addActionListener(buttonListener);
        ActionListener buttonList = new Tap();
        Knopka.addActionListener(buttonList);
        JPanel Panel = new JPanel(new GridLayout(2,1));
        Panel.add(Knopka2);
        add(Panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
