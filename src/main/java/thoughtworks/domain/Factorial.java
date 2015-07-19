/*
 * Copyright 2015 ThoughtWorks Inc.
 *
 * MIT
 */

package thoughtworks.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by devops on 15-7-16.
 * plus method
 */
public class Factorial {



    public int factorial(int firstNumber) {
        int result = 1;
        for (int i = 1; i <= firstNumber; i++) {
            result *= i;
        }

        return result;
    }

    public int factorialSum(int factor) {
        int result = 0;
        for (int i = 1; i <= factor; i++) {
                result += factorial(i);
        }
        return result;

    }


}
