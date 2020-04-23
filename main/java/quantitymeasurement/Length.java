package quantitymeasurement;

import java.util.Objects;

public class Length {

    public Double quantity;
    public MeasurementType type;

    public Length(Double quantity, UnitMeasurements unitMeasurements) {
        this.quantity = unitMeasurements.convertToBaseValue(quantity, unitMeasurements);
        this.type = unitMeasurements.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length measurementQuantity1 = (Length) o;
        return Objects.equals(quantity, measurementQuantity1.quantity);
    }
}