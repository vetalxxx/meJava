import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lesson8 {
    public static void main(String[] args) {
        new MyWindow();
    }
    // создал action Tap и Tap2 для кнопки который создает другое окно
    // а можно ли реализовать action который будет менять параметры в конструкторе public MyWindow()
    // например жму кнопку и меняется размер окна или его положение
    //  например как то так
}
//public class Tap2 implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        new MyWindow.setLocation(300,100);   Я ПОНИМАЮ ЧТО ЭТО НЕ РАБОТАЕТ ТАК, А ВОТ ПОЧЕМУ ТАК НЕЛЬЗЯ НЕ ЗНАЮ
//
//    }
//}
