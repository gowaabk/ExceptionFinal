package UserExceptions;


public class InputException extends Exception {
    public InputException() {

        System.out.println("Количество полей неверно! Введите данные в формате:");
        System.out.println("Petrov Petr Petrovich 19.12.2000 789456 m");
    }
}