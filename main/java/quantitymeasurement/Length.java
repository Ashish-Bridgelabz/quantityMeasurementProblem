package quantitymeasurement;

public class Length {


    private static final double FEET_TO_INCH = 12;

    public enum Unit {FEET, INCH;}

    private final double value;
    private Unit unit;

    public Length(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that.unit);
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}

