import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tap implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new MyWindow2();
    }
}
