
import java.util.Objects;

public class Cat extends Animal implements CanSwim {
    private boolean isWild;
    private double swimmingSpeed;

    public Cat() {
        super("asdf", "asdgf", 4);  // эти имя фимилия и возраст нигде не фигирируют почему??
    }                                                  // тут мы передаем эти параметры через родителя, но куда они записываются?

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

    public void setName(String name) {  // эти гетер и сетеры есть в энимал тут не нужно их
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

    public void setAge(int age) { // проверку нужно было делать для всех животных
        if (age < 0) {             // хотя написано с сетером но в классе Cat
            System.out.println("Некорректное значение!");
        } else {
            this.age = age;
        }
    }

    @Override   // этот метод переопределен только для кота, а должен быть для всех животных
    public String toString() {
        return " Кот " +
                "имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", возраст=" + age +
                ' ';
    }

    @Override
    public boolean equals(Object o) { // этот метод нужно мне пояснить
        if (this == o) return true; // сравниваем ссылки
        if (o == null || getClass() != o.getClass()) return false; // сравниваем классы
        Cat cat = (Cat) o; // тут что?
        return age == cat.age && // сравниваем каждое поле
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() { // и этот метод нужно мне пояснить
        return Objects.hash(name, color, age);
    }

    public void voice() {
        System.out.println("Кот мяукает!"); // этот метод есть в анимал тут он не нужен!
    }

    public double swim(Pool pool) {
        System.out.println("Я кот, я плыву!");
        double timeToOvercome = pool.getLength() / swimmingSpeed; // таким оборазом мы рассмотрим только данный скорость кошки
        System.out.println(timeToOvercome);
        return timeToOvercome;
    }

    public static void main(String[] args) { // и этот метод не понял зачем он нужен
        Cat cat1 = new Cat();   // создаем кота с параметрами
        cat1.setAge(1);
        cat1.setWild(true);
        cat1.setSwimmingSpeed(4);

        cat1.setColorBuild("white").setWild(true); // что мы тут делаем??
    }
}