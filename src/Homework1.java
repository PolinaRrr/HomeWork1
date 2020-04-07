/*
* Домашнее задание урок 1
*1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
*2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
*4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
*5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
*6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
*8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Homework1 {
    // ДЗ п.1
    public static void main(String[] args) {
        // ДЗ п.2
        byte b = 20;
        short s = 2000;
        char c = 'F';
        int i = 200000;
        long l = 2000L;
        float f = 200.0f;
        double d = 20.202020;
        boolean bool = false;
        String sayHello = "Hello world";

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(sayHello);

        // ДЗ п.3
        int k = getCalculation(2, 3, 10, 5);
        System.out.println(k);

        //ДЗ п.4
        int number1 = 7;
        int number2 = 9;
        getResult(number1, number2);


        //ДЗ п.5
        int number = -10;
        getComparison(number);

        //ДЗ п.6
        int someNumber = -3;
        getNegativeValue(someNumber);

        //ДЗ п.7
        String name = "Пони Апокалипсиса";
        getName(name);

        //ДЗ п.8
        int year = 2013;
        calcLeapYear(year);

    }

    // ДЗ п.3
    private static int getCalculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //ДЗ п.4
    private static boolean getResult(int number1, int number2) {
        return number1 + number2 >= 10 && number1 + number2 <= 20;
    }

    //ДЗ п.5
    private static void getComparison(int number) {
        if (number >= 0) {
            System.out.println("Введенное вами число " + number + " положительное.");
        } else {
            System.out.println("Введенное вами число " + number + " отрицательное.");
        }
    }

    //ДЗ п.6
    private static boolean getNegativeValue(int someNumber) {
        return someNumber < 0;
    }

    //ДЗ п.7
    private static void getName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //ДЗ п.8
    private static void calcLeapYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

}


