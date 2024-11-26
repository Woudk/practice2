package org.colleg.practice2.task1;

public class Picture {
    private String name;
    private short year;
    private String author;

    public Picture(String name, short year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
    public String toString() {
        return "Ім'я: " + name + ", Рік: " + year + ", Автор: " + author;
    }
}
