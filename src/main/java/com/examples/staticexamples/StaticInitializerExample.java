package examples.staticexamples;

public class StaticInitializerExample {
    static int count;

    static {
        if (System.getProperty("os.name").equals("Windows")) {
            count = 10;
        } else {
            count = 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Count: " + count);
    }
}
