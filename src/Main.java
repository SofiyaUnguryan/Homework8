import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] gifts = new int[12];
        gifts[0] = 1;
        gifts[1] = 2;
        gifts[2] = 3;
        double[] numbers = {1.57, 7.654, 9.986};
        int[] squirrelsWeight = {450, 370, 567, 398};

    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Первый массив");
        int[] gifts = {1, 2, 3};
        for (int i = 0; i < gifts.length; i++) {
            if (i == gifts.length - 1) {
                System.out.print(gifts[i]);
                break;
            }
            System.out.print(gifts[i] + ", ");
        }
        System.out.println();
        System.out.println("Второй массив");
        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        System.out.println("Третий массив");
        int[] squirrelsWeight = {450, 370, 567, 398};
        for (int i = 0; i < squirrelsWeight.length; i++) {
            if (i == squirrelsWeight.length - 1) {
                System.out.print(squirrelsWeight[i]);
                break;
            }
            System.out.print(squirrelsWeight[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Первый массив");
        int[] gifts = {1, 2, 3};
        for (int i = 2; i <= gifts.length; i -= 1) {
            if (i == 0) {
                System.out.print(gifts[i]);
                break;
            }
            System.out.print(gifts[i] + ", ");
        }
        System.out.println();
        System.out.println("Второй массив");
        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 2; i <= numbers.length; i -= 1) {
            if (i == 0) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        System.out.println("Третий массив");
        int[] squirrelsWeight = {450, 370, 567, 398};
        for (int i = 3; i <= squirrelsWeight.length; i -= 1) {
            if (i == 0) {
                System.out.print(squirrelsWeight[i]);
                break;
            }
            System.out.print(squirrelsWeight[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] gifts = {1, 2, 3};
        int index = 0;
        while (index != gifts.length) {
            if (gifts[index] % 2 != 0) {
                gifts[index] += 1;
            }
            index = index + 1;
        }
        System.out.println(Arrays.toString(gifts));
    }
}