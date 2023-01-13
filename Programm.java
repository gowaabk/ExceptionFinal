
import Data.DataHandler;
import FileWorker.FileSaver;
import UserInput.InputInit;

public class Programm {
    public static void main(String[] args) {

        while (true) {
            String s = InputInit.init();

            switch (s) {
                case "add":
                    FileSaver.save(DataHandler.newData());
                    break;

                case "quit":
                    return;

                default:
                    System.out.println("Некорректная комнада\n");
                    break;
            }
        }
    }
}