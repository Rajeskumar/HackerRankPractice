package main.com.crackingcodinginterview.practice.moderate;

public class Person {
    int birthYear;

    int deathYear;

    public Person(int birthYear, int deathYear) {
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }
}
