package e5myexperiments;

public class Experiment_2 {

    public static void main(String[] args) {
        System.out.println(recursion("qweqwee"));
    }

    public static String recursion(String s) {
        if (s == null) {
            return s;
        }
        String newString = s.substring(0, s.length() - 1);
        return recursion(newString);
    }
}
