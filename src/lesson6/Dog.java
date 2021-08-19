package lesson6;

public class Dog extends Animals {
    public Dog(String name, int swim, int run) {
        super (name, swim,run);
    }
    public void move() {
        if (swim <= 10) {
            System.out.println(name + " " + "проплыл" + " " + swim + " " + "метров");
        }
        else {
            System.out.println(name + " " + "не проплывет" + " " + swim + " " + "метров");
        }
        if (run <= 500) {
            System.out.println(name + " " + "пробежал" + " " + run + " " + "метров");
        }
        else {
            System.out.println(name + " " + "не пробежит" + " " + run + " " + "метров");
        }
    }
}
