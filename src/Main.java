import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //2 задание

        byte clientOs = 0;
        int clientDeviceYear = 2013;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}

        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //3 задание

        int year = 1881;
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year != 0){
            System.out.println(year + " год не является високосным");
        }

        //4 задание

        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("На доставку карты потребуется " + day + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = day + 1;
            System.out.println("На доставку карты потребуется " + day + " дня");
        }
        else if (deliveryDistance >= 6 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("На доставку карты потребуется " + day + " дня");
        }
        else {
            System.out.println("Доставки карты нет");
        }

        //5 задание

        int monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("Такого месяца нет");
        }
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Ферваль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;

        }











    }
}