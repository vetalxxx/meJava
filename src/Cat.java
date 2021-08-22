public class Cat {
    private String name;
    private int appetite;
    private boolean ate;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        ate = false;
    }
    public void Eat(Plate plate) {
        {
            if (!plate.amount(appetite) && !ate) {
                System.out.println(name + " ест");
                plate.decreaseFood(appetite);
                ate = true;
            } else if (plate.amount(appetite)) {
                System.out.println(name + " нет еды");
            } else if (ate) {
                System.out.println(name + " уже поел");
            }
        }
    }



}

