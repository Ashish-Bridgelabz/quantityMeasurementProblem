package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurementService {
    public boolean compare(Length firstValue, Length secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Entered null value");
        if (firstValue.type != secondValue.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.MISMATCHED_VALUE, "Value mismatch");
        return !Objects.equals(firstValue, secondValue) ? false : true;
    }

    public Double addTwoValues(Length firstValue, Length secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Enter null value");
        if (firstValue.type != secondValue.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.MISMATCHED_VALUE, "Type mismatch");
        return firstValue.quantity + secondValue.quantity;
    }
}

