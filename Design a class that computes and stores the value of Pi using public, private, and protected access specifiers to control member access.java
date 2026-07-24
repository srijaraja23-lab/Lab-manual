class PiValue {

    // Public variable
    public double pi;

    // Private method
    private void calculatePi() {
        pi = 22.0 / 7.0;
    }

    // Protected method
    protected void displayPi() {
        System.out.println("Value of Pi = " + pi);
    }

    // Public method
    public void computePi() {
        calculatePi();   // Calling private method
    }
}

public class PiDemo {

    public static void main(String[] args) {

        PiValue obj = new PiValue();

        obj.computePi();    // Public method
        obj.displayPi();    // Protected method (accessible in same package)
    }
}
