package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenMultipleInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "6", "8"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);

        ValidateInput input1 = new ValidateInput(out, in);
        int selected1 = input1.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(6);

        ValidateInput input2 = new ValidateInput(out, in);
        int selected2 = input2.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(8);
    }

    @Test
    public void whenNegativeInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}