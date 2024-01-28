package com.epam.learn.main;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Lambdasy  {
    List<String> strings = Arrays.asList("abc", "cba", "test", "hello");
//    Collections.sort(strings, (String s1, String s2) -> s1.length() - s2.length() );
    Runnable run  = () -> System.out.println("hello");

    public static void main(String[] args) {
        Runnable run  = () -> System.out.println("hello");
    }
}
