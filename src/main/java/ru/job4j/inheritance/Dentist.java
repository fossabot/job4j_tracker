package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String university;

    public Dentist() {
    }

    public Dentist(String name,
                   String surname,
                   String education,
                   String birthday,
                   String experience,
                   String university) {
        super(name, surname, education, birthday, experience);
        this.university = university;
    }
}
