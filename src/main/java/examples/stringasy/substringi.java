package examples.stringasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class substringi {
    public static List<String> getAllSubstrings(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> substrings = new ArrayList<>();

        for (int startIndex = 0; startIndex < str.length(); startIndex++) {
            for (int endIndex = startIndex; endIndex < str.length(); endIndex++) {
                String temp = str.substring(startIndex, endIndex + 1);
                substrings.add(temp);
//                System.out.print("startIndex = " + startIndex);
//                System.out.print(" ");
//                System.out.print("endIndex = " + endIndex);
//                System.out.print(" ");
//                System.out.println("temp = " + temp);
            }
        }

        return substrings;
    }

    public static void main (String [] args){
        List<String>listedSubstrings=getAllSubstrings("welcometojava");
        List<String> filteredSubstrings= new ArrayList<>();
        for (String substring : listedSubstrings){
            if (substring.length()==3){
                filteredSubstrings.add(substring);
            }
        }

        Collections.sort(filteredSubstrings);
        System.out.println(filteredSubstrings.get(0));
        System.out.println(filteredSubstrings.get(filteredSubstrings.size()-1));

    }
}
