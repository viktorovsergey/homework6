import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача 2");
        task2();
        System.out.println("Задача 3");
        task3();
        System.out.println("Задача 4");
        task4();
        System.out.println("Задача 5");
        task5();
        System.out.println();
    }

    public static void task1() {
     /*
     Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
      и выдает соответствующее сообщение:
      Для iOS — «Установите версию приложения для iOS по ссылке».
      Для Android — «Установите версию приложения для Android по ссылке».
    Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
     * */
        int clientOS = 0;
        int osAndroid = 1;
        int osIos = 0;
        if (clientOS == osAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == osIos) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("введена неверная комбинация клавиш");
        }
        System.out.println();
    }

    /*
     * */
    public static void task2() {
    /*
    *Если год выпуска ранее 2015 года, то к сообщению об установке
    * нужно добавить информацию об облегченной версии:
    Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
    Для Android: «Установите облегченную версию приложения для Android по ссылке».
    Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
        * */

        int clientOS = 0;
        int osAndroid = 1;
        int osIos = 0;
        int clientDeviceYear = 2015;
        int newVersionOS = 2010;
        if (clientOS == osAndroid) {
            if (newVersionOS >= clientDeviceYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылкее");
            }
        }
        if (clientOS == osIos) {
            if (newVersionOS >= clientDeviceYear) {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }
            System.out.println();
        }
    }

    public static void task3() {
     /*
     * Напишите программу, которая определяет, является ли год високосным или нет.
      Переменную года назовите year, в которую можно подставить значение
      интересующего нас года. Например, 2021.
      Программа должна определять, високосный год или нет, и выводить
      соответствующее сообщение: « …. год является високосным» или «... год не является високосным».
      Небольшая справка: високосным является каждый четвертый год,
       но не является каждый сотый. Также високосным является каждый четырехсотый год.
     */
        int year = 800;
        int forYears = 4;
        int onehandredYears = 100;
        int fourHundredYaers = 400;
        if ((year % forYears == 0 && year % onehandredYears != 0) || year % fourHundredYaers == 0) {
            System.out.println(year + " являеться високостным");
        } else {
            System.out.println(year + " не являеться високостным");
        }

        System.out.println();
    }


    public static void task4() {
    /*
    *Правила доставки такие:
    Доставка в пределах 20 км занимает сутки.
    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    Свыше 100 км доставки нет.
    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
    Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
    Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента. */
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int distanceOne = 20;
        int distanceTwo = 60;
        int distanceTree = 100;
        if (deliveryDistance > distanceTree) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            if (deliveryDistance > distanceOne) {
                deliveryDays++;
            }
            if (deliveryDistance > distanceTwo) {
                deliveryDays++;
            }
            System.out.println("Потребуется " + deliveryDays+" дня(ей)");
            System.out.println();
        }
    }
        public static void task5 () {
        /*
        Напишите программу, которая определяет по номеру месяца в году,
        к какому сезону этот месяц принадлежит.
        Для написания программы используйте оператор switch.
        Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        * */
            int monthNmber = 10;
            switch (monthNmber) {
                case 12:
                case 1:
                case 2:
                    System.out.printf("Это зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.printf("Это весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.printf("Это летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.printf("Это осенний месяц");
                    break;
                default:
                    System.out.println("Вы ввели неправильный номер месяца");
            }
        }

    }