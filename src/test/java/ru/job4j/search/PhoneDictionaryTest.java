package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenNotFound() {
        String rsl = "not found";
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Alex", "Ivanov", "123456", "Moscow")
        );
        List<Person> persons = findPerson;
        List<Person> emptyList = new ArrayList();
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons, is(emptyList));
    }
}