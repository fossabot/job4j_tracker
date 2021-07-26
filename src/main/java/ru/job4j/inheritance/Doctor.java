package ru.job4j.inheritance;

public class Doctor extends Profession{

    private String experience;

    public Doctor() {

    }

    public Doctor(String name,
                  String surname,
                  String education,
                  String birthday,
                  String experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }

}
