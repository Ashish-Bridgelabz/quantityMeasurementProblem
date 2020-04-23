package quantitymeasurement;

    enum UnitMeasurementS {
        FEET(12.0), INCH(1.0), YARD(36.0);

        double baseUnitConversion;

        UnitMeasurementS(double baseUnitConversion) {
            this.baseUnitConversion = baseUnitConversion;
        }
       public  static boolean compare(Length length1, Length length2) {
            return Double.compare(length1.value * length1.unit.baseUnitConversion, length2.value * length2.unit.baseUnitConversion) == 0;
        }
    }
