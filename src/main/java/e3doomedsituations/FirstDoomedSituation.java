package e3doomedsituations;

public class FirstDoomedSituation {

    public static void main(String[] args) {

        // 3.bug NP_ALWAYS_NULL

        Object object = null;

        if (null == object) {
            // complain
        }

        String algorithm = object.toString();
    }
}
