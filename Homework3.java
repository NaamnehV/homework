package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] ards) {
        Scanner scanner = new Scanner(System.in);
//        String letterCount1 = scanner.nextLine();
//        String letterCount2 = scanner.nextLine();
//        System.out.println(letterCount1.length());
//        System.out.println(letterCount2.length());
//        System.out.println(returnNewWord(letterCount1, letterCount2));
//        String word =new String();
//    --------------------------------------------


        Scanner scanner1 = new Scanner(System.in);
//        System.out. println("ВВедите первое число");
//        double num1 = scanner1.nextDouble();
//        System.out.println("Введите второе число");
//        double num2 = scanner1.nextDouble();
//
//        System.out.println(summa(num1,num2));
//        System.out.println(minus(num1,num2));
//        System.out.println(multiplied(num1,num2));
//        System.out.println(divide(num1,num2));

//---------------------------------------------------
        System.out.println("Сколько евро желаете поменять в доллары?");
        double euro = scanner.nextDouble();
        System.out.println("Введите курс евро к доллару");
        double courseOfDollar = scanner.nextDouble();

        converter(euro, courseOfDollar);

    }

    public static void converter(double summa, double course) {
        double convercion = summa * course;
        System.out.println("При курсе:" + course + "USD за EUR, при обмене: " + summa + "EUR Вы получите" + convercion + "$");
    }







    public static double summa (double x, double y){
        double result = x + y;
        return result;
    }

    public static double minus (double x, double y){
        double result = x - y;
        return result;
    }

    public static double multiplied (double x, double y){
        double result = x * y;
        return result;
    }

    public static double divide (double x, double y){
        double result = x/y;
        return result;
    }



    public static String returnNewWord(String str1, String str2) {

        str1 = str1.substring(0, str1.length()/2);
        str2=str2.substring(str2.length()/2, str2.length());
        String str3 = str1 + str2;
        return str3;
    }

}

