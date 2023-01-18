public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int operatingSystem = 0;
        switch (operatingSystem) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Операционная система не распознана");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int operatingSystem = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            switch (operatingSystem) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Операционная система не распознана");
            }
        } else switch (operatingSystem) {
            case 0:
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Операционная система не распознана");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int currentYear = 2021;
        int remainderFourYears = currentYear % 4;
        int remainderHundredYears = currentYear % 100;
        int remainderFourHundredYears = currentYear % 400;
        if (remainderFourYears > 0) {
            System.out.println(currentYear + " год не является високосным");
        } else if (remainderFourHundredYears == 0) {
            System.out.println(currentYear + " год является високосным");
        } else if (remainderHundredYears == 0) {
            System.out.println(currentYear + " год не является високосным");
        } else {
            System.out.println(currentYear + " год является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
            System.out.println("Потребуется дней " + deliveryDays);
        }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }

}