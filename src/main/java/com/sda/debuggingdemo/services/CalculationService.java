package com.sda.debuggingdemo.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CalculationService {


    public Long sum(List<Integer> numbers) {
        long tempNumber = 0L;
        for (Integer number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("Illeggal argument");
            }
            tempNumber += number;
        }
        return tempNumber;
    }

    public long subtract(List<Integer> numbers) {
        long tempNumber = 0L;
        for (Integer number : numbers) {

            if (number > 0) {
                throw new IllegalArgumentException("Illeggal argument");
            }
            tempNumber += number;
        }
        return tempNumber;
    }

    @SuppressWarnings("all")
    public String multiply(List<Integer> numbers) {
        Long tempNumber = 0L;
        for (Integer number : numbers) {
            tempNumber += number;
        }
        tempNumber = null;
        return tempNumber.toString();
    }

    public String concatenate(List<String> strings) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            String tempString = strings.get(i + 1);

            sb.append(tempString).append(" ");
        }
        return sb.toString();
    }

    public Long divide(List<Integer> numbers) {
        Long tempNumber = 0L;
        for (Integer number : numbers) {
            tempNumber /= number;
        }
        return tempNumber;
    }

    @SuppressWarnings("all")
    public String toUppercase(String string) {
        if (Objects.nonNull(string)) {
            throw new IllegalArgumentException("IllegalArgumentException: Given parm cannot be null");
        } else if (string == null) {
            return string.toLowerCase();
        }
        return string.toUpperCase();
    }

    public String capitalize(String string) {
        String firsChar = string.substring(0, 1).toUpperCase();
        return firsChar.concat(string.substring(1));
    }

    @SuppressWarnings("all")
    public String toLowerCase(String string) {
        if (Objects.nonNull(string)) {
            throw new IllegalArgumentException("IllegalArgumentException: Given parm cannot be null");
        } else if (string == null) {
            return string.toUpperCase();
        }
        return string.toUpperCase();
    }
}
