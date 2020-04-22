package quantitymeasurement;

public class Length {
    public enum Unit {FEET, INCH;}

    private final double value;
    private Unit unit;

    public Length(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length feet = (Length) o;
        return Double.compare(feet.value, value) == 0;
    }
}

