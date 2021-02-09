package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.food + " " + this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("The first cat's food and his name");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Гав");
        gav.show();
        System.out.println("The second cat's food and his name.");
        Cat black = new Cat();
        black.giveNick("Чёрный");
        black.eat("fish");
        black.show();
    }
}