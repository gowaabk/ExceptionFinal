package Data;

import java.util.Scanner;

public class DataReciever {

    public static String newData() {
        System.out.println("Введите данные в формате: Фамилия Имя Отчество Дата рождения Номер телефона Пол");
        System.out.println("Petrov Petr Petrovich 19.12.2000 789456 m");
        Scanner sc = new Scanner(System.in);

        return sc.nextLine().trim();
    }
}