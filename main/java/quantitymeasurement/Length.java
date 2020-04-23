package quantitymeasurement;

import java.util.Objects;

public class Length {

    public final UnitMeasurementS unit;
    public final double value;

    public Length(UnitMeasurementS unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}

