package sg.edu.rp.c346.id21030068.democustomcontactlist;

public class Contact {

    private String name;
    private int countryCode;
    private int phoneNumber;
    private char gender;

    public Contact(String name, int countryCode, int phoneNumber, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

}
