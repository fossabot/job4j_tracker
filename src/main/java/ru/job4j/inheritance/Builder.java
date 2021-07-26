package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String country;

    public Builder() {
    }

    public Builder(String name,
                   String surname,
                   String education,
                   String birthday,
                   String university,
                   String country) {
        super(name, surname, education, birthday, university);
        this.country = country;
    }
}