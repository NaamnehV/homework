package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println( "Cколько коробок Вы хотите отправить?");

        Scanner Cartons = new Scanner(System.in);
        int Carton = Cartons.nextInt();

        System.out.println("Сколько весит 1 коробка?");
        double Kg = Cartons.nextDouble();

        Scanner Name = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        String Name1 = Name. nextLine();

        System.out.println("Введите Вашу фамилию");
        String Lastname1 = Name.nextLine();

        System.out.println("Введите адрес получателя");
        String Address1 = Name.nextLine();

        System.out.println("Имя: " + "\"" + Name1.toUpperCase() + " " + "\n" + "Фамилия: " + "\"" + Lastname1.toUpperCase()
                + "" + "\"" + "\n" + "Адрес: " + "\"" + Address1.toUpperCase() + "\"" + "\n" + "Вес посылки: " +  (Carton*Kg) );

        boolean TF = Name.nextBoolean();

        System.out.println("Viktoriia Vasylenko");

    }
}