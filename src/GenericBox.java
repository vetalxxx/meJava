import java.util.Arrays;

public class GenericBox<T> {
    private T[] members;

    public GenericBox(T... members) {

        this.members = members;
    }

    public String toString() {
        return Arrays.toString(members);
    }

    public void changeMembers(int a, int b) {
        T temp;
        temp = this.members[a];
        this.members[a] = this.members[b];
        this.members[b] = temp;
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>(1, 2, 3);
        System.out.println(intBox);

        intBox.changeMembers(0, 2);
        System.out.println(intBox);
    }
}
