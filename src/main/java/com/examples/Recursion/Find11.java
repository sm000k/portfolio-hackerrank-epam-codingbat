package examples.Recursion;

public class Find11 {
    public int count11(String str) {
        int temp = 0;
        if (str.length() < 2) {
            return 0;
        } else {
            if (str.substring(0, 2).equals("11")) {
                return 1 + count11(str.substring(2));
            }
        }
        return temp + count11(str.substring(1));

    }


    public static String stringClean(String s) {
        if (s.length() <= 1) {
            return s;
        } else if (s.charAt(0) == s.charAt(1)) {
            return stringClean(s.substring(1));
        } else {
            return s.charAt(0) + stringClean(s.substring(1));
        }
    }

    public class StringClean2 {

        public static String stringClean(String s) {
            if (s.length() <= 1) {
                return s;
            }

            return s.charAt(0) == s.charAt(1) ? stringClean(s.substring(1)) : s.charAt(0) + stringClean(s.substring(1));
        }
    }

}

