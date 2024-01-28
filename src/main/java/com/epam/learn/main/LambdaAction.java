package com.epam.learn.main;


import java.util.*;

interface Action {
    void doAction(int num);
}
public class LambdaAction {

//    Action action = i -> System.out.println(i);
//    Action action = Integer i -> System.out.println(i);
//    Action action = (Integer i) -> System.out.println(i);
//        Action action = (int i) -> System.out.println(i);
public static  List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List <Integer> c = Arrays.asList(0,0);
    for (int i = 0; i<a.size();i++){
        if(a.get(i)<b.get(i)){
            c.set(2, c.get(2)+1);
        }
        else{
            if(a.get(i)>b.get(i)){
                c.set(1, c.get(1)+1);
            }
        }
    }
    return c;
}
}
