package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private String university;

    public Surgeon(String university) {
    }

    public Surgeon(String name,
                   String surname,
                   String education,
                   String birthday,
                   String experience,
                   String university) {
        super(name, surname, education, birthday, experience);
        this.university = university;
    }
}
