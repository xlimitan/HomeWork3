public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte one = 1;
        short two = 2;
        int three = 3;
        long four = 4;
        float five = 5F;
        double six = 6D;
        System.out.println("Значение переменной one с типом byte равно " + one);
        System.out.println("Значение переменной two с типом byte равно " + two);
        System.out.println("Значение переменной three с типом byte равно " + three);
        System.out.println("Значение переменной four с типом byte равно " + four);
        System.out.println("Значение переменной five с типом byte равно " + five);
        System.out.println("Значение переменной six с типом byte равно " + six);
        }
    public static void task2 () {
        System.out.println("Задача 2");
        float one = 27.12F;
        long two = 987_678_965_549L;
        float three = 2.786F;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        byte allStudent = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        short paperOneStudent = (short) (paper / allStudent);
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");

        }
    public static void task4 () {
        System.out.println("Задача 4");
        byte efficiency = 16;
        byte twoMinutes = 2;
        byte twentyMinutes = 20;
        short day = 1440;
        short threeDay = (short) (day * 3);
        int year = (int) (day * 365);
        System.out.println("За 20 минут машина произвела " + (twentyMinutes / twoMinutes * efficiency) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (day / twoMinutes * efficiency) + " штук бутылок");
        System.out.println("За три дня машина произвела " + (threeDay / twoMinutes * efficiency) + " штук бутылок");
        System.out.println("За год машина произвела " + (year / twoMinutes * efficiency) + " штук бутылок");
    }
    }