
public class Turtle extends Animal implements CanSwim {
    private int swimmingSpeed; // параметр скорости черепахи, пусть

    public Turtle(String name, String color, int age, int swimmingSpeed) {  // зачем тут в коде этот конструктор???
        super(name, color, age);                                            // я не увидел что он где-то используется
        this.swimmingSpeed = swimmingSpeed;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звук!");
    }

    public double swim(Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}