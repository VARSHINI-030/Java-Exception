// Custom Exception Class

class AgeInvalidException extends Exception {

    public AgeInvalidException(String message) {
        super(message);
    }
}

public class main {

    static void checkAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age is below 18 — Not Eligible!");
        } else {
            System.out.println("Eligible to Vote 🎉");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeInvalidException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
