package quantitymeasurement;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        NULL_VALUE, MISMATCHED_VALUE;

    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}