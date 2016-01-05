/*
 * Copyright 2015 ThoughtWorks Inc.
 *
 * MIT
 */

package thoughtworks.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by devops on 15-7-18.
 */
public class FactorialTest {

    @Test
    public void fours_factorial_is_sixteen() {


        Factorial factorial = new Factorial();

        int result = factorial.factorialSum(4);

        assertThat(result, is(36));


    }


}
