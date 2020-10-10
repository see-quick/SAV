package e2maskbug;

public class MaskBug {

    public static void main(String[] args) {

        // 3.bug INT_BAD_COMPARISON_WITH_SIGNED_BYTE
        byte b[] = new byte[20];
        String asciiLine = "";

        for (int offset = 0; offset < b.length; offset++) {
            if ((b[offset] < 32) || (b[offset] > 128)) {
                asciiLine += ".";
            }
            else {
                asciiLine += new String (b, offset, 1);
            }
        }
    }
}
