
import java.util.Objects;

public class Cat extends Animal implements CanSwim {
    private boolean isWild;
    private double swimmingSpeed; // почему тут double а в остальных животных int, зачем тут дабл?

    public Cat() {
        super("asdf", "asdgf", 4);  // эти имя фимилия и возраст нигде не фигирируют почему??
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.name = name;
        this.color = color;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat setColorBuild(String color) {
        this.color = color;
        return this;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Некорректное значение!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) { // этот метот нужно мне пояснить
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() { // и этот метод нужно мне пояснить
        return Objects.hash(name, color, age);
    }

    public void voice() {
        System.out.println("Кот мяукает!"); // почему в коте у этого метода нет @Override а в черепахе есть??? в чем разница??
    }

    public double swim(Pool pool) {
        System.out.println("Я кот, я плыву!");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        System.out.println(timeToOvercome);
        return timeToOvercome;
    }

    public static void main(String[] args) { // и этот
        Cat cat1 = new Cat();
        cat1.setAge(1);
        cat1.setWild(true);
        cat1.setSwimmingSpeed(4);

        cat1.setColorBuild("white").setWild(true);
    }
}