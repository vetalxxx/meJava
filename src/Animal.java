
public abstract class Animal {
    protected String name;      // тут в принципе вопрос почему protected в чем отличие от private???
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;  // тут все понятно
        this.age = age;
    }

    public String getName() {   // что конкретно делает этот гетер??
        return name;            // тот же вопрос к сетеру??
    }                           // вроде я понимаю что они нужны для того чтобы потомки моги обращаться к родителю
                                // Animal, но если можно то поподробнее хотелось бы понять

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void voice();
}