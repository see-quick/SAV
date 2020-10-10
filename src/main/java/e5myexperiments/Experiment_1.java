package e5myexperiments;

public class Experiment_1 {

    public static void main(String[] args) {
        doSomething( "something");
    }

    public static void doSomething(String s) {
        doSomething1(s);
    }

    public static void doSomething1(String s) {
        doSomething2(null);
    }

    public static String doSomething2(String s) {
        s.length();

        return s;
    }
}
