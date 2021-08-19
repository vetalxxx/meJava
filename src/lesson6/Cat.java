package lesson6;

public class Cat extends Animals {

    public Cat(String name, int swim, int run) {
        super (name, swim, run);
    }
    public void move() {
        if (swim < 0 || swim >= 0 ) {
        System.out.println(name + " " + "не умеет плавать");
        }
        if (run <= 200) {
            System.out.println(name + " " + "пробежал" + " " + run + " " + "метров");
        }
        else {
            System.out.println(name + " " + "не пробежит" + " " + run + " " + "метров");
        }

    }
}
