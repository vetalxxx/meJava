import java.util.ArrayList;

public class Phone {
    private ArrayList<String> Name;
    private ArrayList<Integer> Phone;

    public Phone() {
        Name = new ArrayList<>();
        Phone = new ArrayList<>();
    }

    public void add(String name, Integer phone) {
        Name.add(name);
        Phone.add(phone);
    }

    public ArrayList<Integer> get(String lastName) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < Name.size(); i++) {
            if (Name.get(i).equals(lastName)) result.add(Phone.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.add("Саймон", 800);
        phone.add("Люис", 900);
        phone.add("Кларк", 600);
        phone.add("Люис", 100);

        System.out.println("Поиск телефона \"Люис\": " + phone.get("Люис"));
    }
}
