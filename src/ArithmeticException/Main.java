/* user 28.12.2016 */
package ArithmeticException;

public class Main {
    public static void main(String[] args) {
        try {
            int simpleNumder = 10;
            int simpleDevider = 0;
            double summ = simpleNumder / simpleDevider; // dev by zero

        } catch (ArithmeticException e) {

            System.out.println("[**************************************************************************************]");
            System.out.println("Message: " + e.getMessage());
            System.out.println("LocalizedMessage: " + e.getLocalizedMessage());
            StackTraceElement[] listStackTrace = e.getStackTrace();
            System.out.println("StackTrace: ");
            for (StackTraceElement stackTraceElement : listStackTrace
                    ) {
                System.out.println(" - " + stackTraceElement.toString());
            }
            System.out.println("[**************************************************************************************]");
        }
    }
}
