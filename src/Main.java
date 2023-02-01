public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1.1.");
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
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        byte totalClasses = (byte) (totalCans/ (whitePaintForOneClass + brownPaintForOneClass));
        byte totalCansWhitePaint = (byte) (totalClasses * whitePaintForOneClass);
        byte totalCansBrawnPaint = (byte) (totalClasses * brownPaintForOneClass);
        System.out.println("В школе, где " + totalClasses + (" классов, нужно ") + totalCansWhitePaint + (" банок белой краски и ") + totalCansBrawnPaint + (" банок коричневой краски."));
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte totalBananas = 5;
        byte weightOfOneBanana = 80;
        byte totalMilk = 2;
        byte oneServingOfMilk = 105;
        byte iceCream = 2;
        byte onePackIceCream = 100;
        byte eggs = 4;
        byte egg = 70;
        short totalWeightGrams = (short) ((totalBananas * weightOfOneBanana) + (totalMilk * oneServingOfMilk) + (iceCream * onePackIceCream) + (eggs * egg) + 0.0000001);
        System.out.println("Вес завтрака - " + totalWeightGrams + " грамм");
        float totalWeightKilogram = (float) (totalWeightGrams) / 1000;
        System.out.println("Вес завтрака - " + totalWeightKilogram + " килограмм");


    }
    public static void task7 () {
        System.out.println("Задача 7");
        short excessWeight = 7000;
        short theFirstOption = 250;
        short theSecondOption = 500;
        short dayFirstOption = (short) (excessWeight / theFirstOption);
        System.out.println("Первый вариант - " + dayFirstOption + " дней");
        short daySecondOption = (short) (excessWeight / theSecondOption);
        System.out.println("Второй вариант - " + daySecondOption + " дней");
        short averageDays = (short) ((dayFirstOption + daySecondOption) / 2);
        System.out.println("В среднем понадобиться - " + averageDays + " день");


    }
    public static void task8 () {
        System.out.println("Задача 8");
        int monthlySalaryMasha = 67_760;
        int monthlySalaryDenis = 83_690;
        int monthlysalaryKrisina = 76_230;
        int newSalaryCalculationMasha = monthlySalaryMasha / 100 * 110;
        int oldYearSalaryMasha = monthlySalaryMasha * 12;
        int newYearSalaryMasha = newSalaryCalculationMasha * 12;
        int differenceMasha = newYearSalaryMasha - oldYearSalaryMasha;
        System.out.println("Маша теперь получает " + newSalaryCalculationMasha + (" рублей. Годовой доход вырос на ") + differenceMasha + (" рублей"));
        int newSalaryCalculationDenis = monthlySalaryDenis / 100 * 110;
        int oldYearSalaryDenis = monthlySalaryDenis * 12;
        int newYearSalaryDenis = newSalaryCalculationDenis * 12;
        int differenceDenis = newYearSalaryDenis - oldYearSalaryDenis;
        System.out.println("Денис теперь получает " + newSalaryCalculationDenis + (" рублей. Годовой доход вырос на ") + differenceDenis + (" рублей"));
        int newSalaryCalculationKristina = monthlysalaryKrisina / 100 * 110;
        int oldYearSalaryKristina = monthlysalaryKrisina * 12;
        int newYearSalaryKristina = newSalaryCalculationKristina * 12;
        int differenceKristina = newYearSalaryKristina - oldYearSalaryKristina;
        System.out.println("Кристина теперь получает " + newSalaryCalculationKristina + (" рублей. Годовой доход вырос на ") + differenceKristina + (" рублей"));
    }
}