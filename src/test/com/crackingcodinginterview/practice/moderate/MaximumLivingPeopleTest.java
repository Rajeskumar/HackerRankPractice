package test.com.crackingcodinginterview.practice.moderate;

import main.com.crackingcodinginterview.practice.moderate.MaximumLivingPeople;
import main.com.crackingcodinginterview.practice.moderate.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLivingPeopleTest {

    MaximumLivingPeople maximumLivingPeople;
    @BeforeEach
    void setUp() {
        maximumLivingPeople = new MaximumLivingPeople();
    }

    @Test
    void calculateMaximumLivingPeople() {

        Person p1 = new Person(1910, 1960);
        Person p2 = new Person(1906, 1970);
        Person p3 = new Person(1925, 1945);
        Person p4 = new Person(1960, 1990);
        Person p5 = new Person(1980, 2005);
        Person p6 = new Person(1901, 1965);


        List<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        int actual = maximumLivingPeople.calculateMaximumLivingPeople(people);

        int expected = 1925;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void calculateMaximumLivingPeople_SameBirthDeathYearCondition() {

        Person p1 = new Person(1910, 1960);
        Person p2 = new Person(1906, 1970);
        Person p3 = new Person(1925, 1945);
        Person p4 = new Person(1960, 1990);
        Person p5 = new Person(1980, 2005);
        Person p6 = new Person(1901, 1965);
        Person p7 = new Person(1945, 2001);

        List<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);

        int actual = maximumLivingPeople.calculateMaximumLivingPeople(people);

        int expected = 1945;

        Assertions.assertEquals(expected, actual);

    }
}