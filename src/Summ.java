public class Summ {
    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        int s;

        if (arr.length != 4) throw new MyArraySizeException("Массив не 4х4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Массив не 4х4");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    s = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент в строке " + (i + 1) + " столбце " + (j + 1) + " не число");
                }
                sum += s;
            }
        }
        return sum;
    }
}

