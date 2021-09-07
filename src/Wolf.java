

public class Wolf extends Animal implements CanSwim {
    private int swimmingSpeed;

    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {   // тут тотже вопрос тут есть оверрайд а в коте нету но и там и тут работает
        System.out.println("Волк воет!");
    }

    public double swim(Pool pool) {
        System.out.println("Я волк, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}
