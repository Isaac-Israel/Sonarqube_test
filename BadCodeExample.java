public class BadCodeExample {
    public static void main(String[] args) {
        // Hardcoded credentials (Security issue)
        String password = "123456";

        // Unused variable (Code smell)
        int unused = 10;

        // Empty catch block (Bug + Code smell)
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // nothing here
        }

        // Duplicate code (Code smell)
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
