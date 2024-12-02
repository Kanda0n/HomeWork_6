public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task 5");
        for (int i = 1904; i < 2097; i++) {
            boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if (isLeapYear) {
                System.out.println(i + " год является високосным.");
            }
        }

        System.out.println("Task 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Task 7");
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Task 8");
        int sum = 0;
        for (int i = 1; i < 13; i++) {
            sum = sum + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("Task 9");
        sum = 0;
        for (int i = 1; i < 13; i++) {
            sum = sum + 29000 + sum * 1 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + "*" + i + "=" + i * 2);
        }
    }
}