package e1intentionalbug;


public class FirstIntentionalBug {

    public static void main(String[] args) {
        // 1.bug BC_IMPOSSIBLE_CAST
        MyName mn = new MyName();

        System.out.println(doSomething(mn));
    }


    public static Name doSomething(Name n) {
        if  (n instanceof MyName) {
            n = (DnsName) n; // force ClassCastException
        }
        return n;
    }
}
