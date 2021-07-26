package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private String country;

    public Programmer() {
    }

    public Programmer(String name,
                      String surname,
                      String education,
                      String birthday,
                      String university,
                      String country) {
        super(name, surname, education, birthday, university);
        this.country = country;
    }
}
