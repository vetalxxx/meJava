package lesson5;

public class Employee {
    String name;
    String surname;
    String patronymic;
    int age;


    Employee(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;

    }
    void people() {
        System.out.println(name+ " " + surname + " " + patronymic + " " + age + " ");
    }
}

