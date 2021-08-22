public class hw7 {
    public static void main(String[] args) {

        Plate plate = new Plate(50);
        Cat[] cats = {
                new Cat("Олег", 15),
                new Cat("Иван", 20),
                new Cat("Зульфия", 50)
        };


        for (Cat cat : cats) {
            cat.Eat(plate);
        }
        plate.additive(40);

        for (Cat cat : cats) {
            cat.Eat(plate);
        }

    }
}
