public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (amount(appetite)) {
            System.out.println("Мало еды");
        } else food = food - appetite;
    }

    public boolean amount(int appetite) {
        if (appetite > food) {
            return true;
        } else {
            return false;
        }
    }

    public void additive(int i) {
        food += i;
    }
}


//    public void info () {
//        System.out.println("еды осталось" + " " + food);

