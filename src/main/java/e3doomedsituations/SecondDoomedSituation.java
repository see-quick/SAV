package e3doomedsituations;

public class SecondDoomedSituation {

    public static void main(String[] args) {

        // 4.bug NP_NULL_ON_SOME_PATH
        String result = "12";

        System.out.println(doIt(result));
    }

    public static char doIt(String method) {
        String result = null;

        if (method == null)
            result = "ToUnknownStream";
        else if (method.equalsIgnoreCase("xml"))
            result = "ToXMLStream";
        else if (method.equalsIgnoreCase("html"))
            result = "ToHTMLStream";
        else if (method.equalsIgnoreCase("text"))
            result = "ToTextStream";

        return result.charAt(1);
    }
}
