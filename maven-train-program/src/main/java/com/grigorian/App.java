package com.grigorian;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String text = "maven lifecycle in epam";

        String capitalized = StringUtils.capitalize(text);

        System.out.println("Result: " + capitalized);
    }
}
