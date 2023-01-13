package Data;

import java.text.ParseException;
import java.util.HashMap;

import UserExceptions.InputException;

public class DataHandler {

    public static String[] attributes = new String[]{"lastName",
            "firstName",
            "patronymic",
            "dateOfBirth",
            "phoneNumber",
            "sex"};

    public static Person p;

    public static Person newData() {

        String inputData = DataReciever.newData();
        try {

            if (CheckData.dataIsValid(inputData) == -1) {
                throw new InputException();
            }

            HashMap<String, String> personData = new HashMap<>();
            for (int i = 0; i < attributes.length; i++) {
                personData.putIfAbsent(attributes[i], inputData.split(" ")[i]);
            }

            CheckDate.dateIsValid(personData.get("dateOfBirth"));

            p = new Person(personData);
            return p;
        } catch (InputException e) {
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            System.out.println("Введите дату корректно в формате dd.mm.yyyy\n");
        }
        return null;
    }
}