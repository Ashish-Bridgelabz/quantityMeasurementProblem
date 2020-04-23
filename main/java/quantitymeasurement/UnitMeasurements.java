package quantitymeasurement;

enum UnitMeasurementS {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    double baseUnitConversion;

    UnitMeasurementS(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(Length length1, Length length2) {
        return Double.compare(length1.value * length1.unit.baseUnitConversion, length2.value * length2.unit.baseUnitConversion) == 0;
    }

    public static double addTwoLengths(Length length1, Length length2) {
        return length1.value + length2.value;
    }
}
