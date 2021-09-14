public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        try {
            System.out.println("Сумма = " + Summ.sumArray(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
