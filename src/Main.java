import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("Задача №1");
       int yaer= 2025;
        checkLeep(yaer);
//Task 2
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2024;
        checkOS(clientOS,clientDeviceYear);
//Task 3
        System.out.println("Задача №3");
        int deliveryDistance = 50;
                checkDeliveryDistance(deliveryDistance);
    }
//Method for task 1
    private static void checkLeep(int yaer) {
        if(yaer>1584&yaer%4==0&yaer%100==0&yaer%400==0) {
            System.out.println(yaer+" год является високосным");}
        else if (yaer>1584&yaer%4==0&yaer%400!=0 & yaer%100!=0) {
            System.out.println(yaer+" год является високосным");
        } else {
            System.out.println(yaer+" год не является високосным");
        }
    }
//Method for task 2
    private static void checkOS(int clientOS,int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 & clientDeviceYear >= currentYear) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }else if (clientOS == 0 & clientDeviceYear < currentYear) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        }else if (clientOS ==1 & clientDeviceYear >= currentYear){
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }else if (clientOS ==1 & clientDeviceYear < currentYear) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        }
    }
//Method for task 3
    private static void checkDeliveryDistance(int deliveryDistance) {
        if(deliveryDistance<=20){
            System.out.println("Потребуется дней +1");
        } else if(deliveryDistance>20&deliveryDistance<=60){System.out.println("Потребуется дней  +2");

        }else if (deliveryDistance>60&deliveryDistance<=100){
            System.out.println("Потребуется дней +3");
        }else{
            System.out.println("Доставки нет");
        }
    }


}




