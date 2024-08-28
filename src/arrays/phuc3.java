package arrays;

public class phuc3 {

    public static void main(String[] args) {
        int[] number = {1, 42, -5, 27, 0, 89};

        for (int i = 0; i < number.length / 2; i++) {
            int temp = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length - 1 - i] = temp;
        }

        System.out.print("Mang dao nguoc: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
