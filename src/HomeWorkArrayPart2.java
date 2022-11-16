import java.util.Random;

public class HomeWorkArrayPart2 {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        System.out.println();
        int paymentsSum = 0;
        int[] arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            paymentsSum += arr[i];
        }

        System.out.println("Сумма всех выплат за месяц: " + paymentsSum);
        //Задание 2
        System.out.println();
        System.out.println("Задание 2");

        int maximumAmount = 0;
        int minimumAmount = arr[0];

        for (int j : arr) {
            if (maximumAmount < j) {
                maximumAmount = j;
            }
            if (minimumAmount > j) {
                minimumAmount = j;

            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximumAmount + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minimumAmount + " рублей");
        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int paymentAmounts = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            paymentAmounts++;

        }

        double average = (double) paymentsSum / paymentAmounts;
        System.out.println("Средняя сумма трат за месяц составила " +
                (int) average + " рублей");
        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}