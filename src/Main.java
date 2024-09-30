import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Задача №1");
        int yaer = 2024;
        checkLeepAndPrint(yaer);
        checkLeepAndPrint(2000);
        checkLeepAndPrint(2100);
//Task 2
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        checkOS(clientOS, clientDeviceYear);
//Task 3
        System.out.println("Задача №3");
        int deliveryDistance =50;
        System.out.println(checkDeliveryDistance(deliveryDistance));
    }

    //Method for task 1
    private static void checkLeepAndPrint(int yaer) {
        if (yaer > 1584 & yaer % 4 == 0 & yaer % 100 != 0 || yaer % 400 == 0) {
            System.out.println(yaer + " год является високосным");
            //   } else if (yaer > 1584 & yaer % 4 == 0 & yaer % 400 != 0 & yaer % 100 != 0) {
            //      System.out.println(yaer + " год является високосным");
        } else {
            System.out.println(yaer + " год не является високосным");
        }

    }

    //Method for task 2
    private static void checkOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 & clientDeviceYear <= currentYear & clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else if (clientOS == 0 & clientDeviceYear <= 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        } else if (clientOS == 1 & clientDeviceYear <= currentYear & clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else if (clientOS == 1 & clientDeviceYear <= 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");

        }
    }


    //Method for task 3
    public static int checkDeliveryDistance(int deliveryDistance) {

        int result = 0;
        if (deliveryDistance>0&deliveryDistance <= 20) {
            result = 1;
        }
        else if (deliveryDistance > 20 & deliveryDistance <= 60) {
            result = 2;

        } else if (deliveryDistance > 60 & deliveryDistance <= 100) {
            result = 3;
        } else {
            System.out.println("Доставки нет");
        }
        return result;
    }


}




