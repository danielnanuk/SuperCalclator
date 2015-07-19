/*
 * Copyright 2015 ThoughtWorks Inc.
 *
 * MIT
 */

package thoughtworks.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SubtractTest {

    @Test
    public void two_subtract_one_equal_one(){
        Calculator calculator = new Subtract();
        int result = calculator.calculate(2, 1);
        assertThat(result, is(1));
    }
}
