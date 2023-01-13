package Data;

import java.util.HashMap;

public class Person {

    String lastName;
    String firstName;
    String patronymic;
    String dateOfBirth;
    int phoneNumber;
    String sex;

    public Person(HashMap<String, String> data) {
        this.lastName = data.get("lastName");
        this.firstName = data.get("firstName");
        this.patronymic = data.get("patronymic");
        this.dateOfBirth = data.get("bdateOfBirth");
        this.phoneNumber = Integer.parseInt(data.get("phoneNumber"));
        this.sex = data.get("sex");
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%d><%s>", lastName, firstName, patronymic, dateOfBirth, phoneNumber, sex);
    }

    public String getLastName() {
        return this.lastName;
    }
}