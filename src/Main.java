
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1);
        System.out.println(cat2);

        Cat cat3 = new Cat("Морис", "black", 1);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор", "Серый", 6);

        Animal cat4 = new Cat("Морис", "red", 10);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;  // тут тоже поподробнее написать что тут конкретно происходит на этом шаге
        } else {
            System.out.println("Не является волком!");
        }

        Animal cat6 = new Cat("Морис", "red", 10);
        cat6.voice();


        //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв

        Cat catCompetitor1 = new Cat("Морис", "red", 10);
        catCompetitor1.setSwimmingSpeed(10);
        Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12);
        wolfCompetitor1.setSwimmingSpeed(12);
        Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100);
        turtleCompetitor.setSwimmingSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) { // цикл фореч
            pool.getTimeToOvercomePool(catCompetitor1); //
            pool.getTimeToOvercomePool(wolfCompetitor1); //
            pool.getTimeToOvercomePool(turtleCompetitor);
        }

        Utils.makeAnimalOlder(cat2); // не знаю что за строка такая????
                                    // напишите пож пояснение для этой строки
    }
}