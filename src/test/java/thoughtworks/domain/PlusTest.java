/*
 * Copyright 2015 ThoughtWorks Inc.
 *
 * MIT
 */

package thoughtworks.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlusTest {

    @Test
    public void one_plus_two_should_equal_three() {
        Calculator calculator = new Plus();
        int result = calculator.calculate(1, 2);
        assertThat(result, is(3));
    }
}
