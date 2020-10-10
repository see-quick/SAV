package e3doomedsituations;

public class ThirdDoomedSituation {

     interface Node {

        int CDATA_SECTION_NODE = 0;
        int COMMENT_NODE = 1;

        String getNodeName();
     }

    public static void main(String[] args) {

        // 5.bug NP_ALWAYS_NULL
        doIt(Node.COMMENT_NODE);
    }

    public static void doIt(int nodeType) {
        Node node = null;

        switch (nodeType) {
            case Node.CDATA_SECTION_NODE: {
                // node = ... not important
                break;
            }
            case Node.COMMENT_NODE:
                // ... something
            default: {
                throw new IllegalArgumentException("...("
                    + node.getNodeName() + ")");
            }
        }
    }
}
