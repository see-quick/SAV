package e1intentionalbug;

public class SecondIntentionalBug {

    public static void main(String[] args) {
        // 2.bug
        String s = "sdsdsa'wewq";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i++) != 'a') {
                char c = s.charAt(-i); // throw error
                System.out.println(c);
            }
        }
    }
}
