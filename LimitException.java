public class LimitException extends Exception{
    private double remainingAmout;

    public LimitException(String message, double remainingAmout) {
        super(message);
        this.remainingAmout = remainingAmout;
    }

    public double getRemainingAmout() {
        return remainingAmout;
    }
}
