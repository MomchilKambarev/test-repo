package Lecture4;

public class ReverseList {
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
