public class Logger {

    // The single instance of Logger, initially null
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code here, if any
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
