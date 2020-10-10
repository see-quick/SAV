package e4loggingbug;

public class LoggingBug {

    public static void main(String[] args) {

        // 7.bug RV_RETURN_VALUE_IGNORED

        String userdir = System.getProperty("user.dir");
        userdir.replace("\\", "/");

        System.out.println("Changed string " + userdir);
    }
}
