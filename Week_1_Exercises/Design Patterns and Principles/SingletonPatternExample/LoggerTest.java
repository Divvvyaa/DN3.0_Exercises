public class LoggerTest {

    public static void main(String[] args) {
        // Get the singleton instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log some messages
        logger1.log("This is a message from logger1.");
        logger2.log("This is a message from logger2.");

        // Verify that both logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}
