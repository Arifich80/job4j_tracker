package ru.job4j.collection;

import org.assertj.core.error.ShouldBeFalse;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    @Test
    public void whenTestDublicateMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        Citizen citizen1 = new Citizen("2f44a", "Alexander Ivanov");
        office.add(citizen1);
        assertFalse(office.add(citizen1));
    }
}