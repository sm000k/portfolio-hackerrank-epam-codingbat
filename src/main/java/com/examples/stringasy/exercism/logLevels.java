package examples.stringasy.exercism;

public class logLevels {

    public static String message(String logLine) {
//        String[] arrOfStr = str.split("@", 2);
//        logLine.trim();
//        logLine.trim();

        String[] product = logLine.split(" ", -1);
        logLine.trim();

        // throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method")

        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }

    public static void main (String [] arg){
        String x =logLevels.message("[WARNING]:   \\tTimezone not set  \\r\\n");
//        String x =logLevels.message("to jest tekst   z wieloma spacjami    ");
        System.out.println("hello");
        System.out.println(x);
    }
}
