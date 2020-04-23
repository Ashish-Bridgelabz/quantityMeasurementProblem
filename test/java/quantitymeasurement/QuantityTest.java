package quantitymeasurement;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    QuantityMeasurementService quantityMeasurement = new QuantityMeasurementService();

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityMeasurementException {
        Length firstValue = new Length(0.0, UnitMeasurements.FEET);
        Length secondValue = new Length(0.0, UnitMeasurements.FEET);
        boolean result1 = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result1);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfIsNull_ShouldThrowException() {
        try {
            Length firstValue = new Length(0.0, UnitMeasurements.FEET);
            boolean result = quantityMeasurement.compare(firstValue, null);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoSameObjectReference_ShouldReturnTrue() {
        Length firstValue = new Length(0.0, UnitMeasurements.FEET);
        Assert.assertEquals(firstValue, firstValue);
    }

    @Test
    public void givenTwoObjects_IfBothOfThemAreNull_ShouldThrowException() {
        try {
            quantityMeasurement.compare(null, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(0.0, UnitMeasurements.FEET);
        Length secondValue = new Length(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(12.0, UnitMeasurements.FEET);
        Length secondValue = new Length(12.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnAppropriateResult() throws QuantityMeasurementException {
        Length firstValue = new Length(0.0, UnitMeasurements.INCH);
        Length secondValue = new Length(0.0, UnitMeasurements.INCH);
        boolean result1 = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result1);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnTrue() {
        try {
            Length firstValue = new Length(0.0, UnitMeasurements.INCH);
            boolean result = quantityMeasurement.compare(firstValue, null);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoInchObjects_IfObjectsAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchObjects_IfTypeIsSame_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(0.0, UnitMeasurements.INCH);
        Length secondValue = new Length(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchObjects_IfValuesAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(12.0, UnitMeasurements.INCH);
        Length secondValue = new Length(12.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(3.0, UnitMeasurements.FEET);
        Length secondValue = new Length(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1FeetAndOneYard_ShouldReturnFalse() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.FEET);
        Length secondValue = new Length(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldNotReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.INCH);
        Length secondValue = new Length(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldNotReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.YARD);
        Length secondValue = new Length(36.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(36.0, UnitMeasurements.INCH);
        Length secondValue = new Length(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.YARD);
        Length secondValue = new Length(3.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(2.0, UnitMeasurements.INCH);
        Length secondValue = new Length(5.0, UnitMeasurements.CENTIMETER);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValues_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        Length firstValue = new Length(2.0, UnitMeasurements.INCH);
        Length secondValue = new Length(2.0, UnitMeasurements.INCH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.FEET);
        Length secondValue = new Length(2.0, UnitMeasurements.INCH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(14.0, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeetValue_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.FEET);
        Length secounValue = new Length(1.0, UnitMeasurements.FEET);
        Double result = quantityMeasurement.addTwoValues(firstValue, secounValue);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenTwoInchAndTwoAndHalfCM_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        Length firstValue = new Length(2.0, UnitMeasurements.INCH);
        Length secondValue = new Length(2.5, UnitMeasurements.CENTIMETER);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenOneGallonAnd3Point78LitresValue_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.GALLON);
        Length secondValue = new Length(3.78, UnitMeasurements.LITRES);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1LitreAnd1000Ml_shouldReturnEqual() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.LITRES);
        Length secondValue = new Length(1000.0, UnitMeasurements.MILLILITERS);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneGallonAn3Point78LitresValue_IfEqual_ShouldReturn() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.GALLON);
        Length secondValue = new Length(3.78, UnitMeasurements.LITRES);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void givenOneLiterAnd1000Milileters_IfEqual_ShouldReturn() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.LITRES);
        Length secondValue = new Length(1000.0, UnitMeasurements.MILLILITERS);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test
    public void givenOneKiloGramValueAnd1000Gram_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.KILOGRAMS);
        Length secondValue = new Length(1000.0, UnitMeasurements.GRAMS);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneTonneAnd1000KG_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.TONNE);
        Length secondValue = new Length(1000.0, UnitMeasurements.KILOGRAMS);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1000TonneAnd1000Gram_IfEqual_ShouldReturEqual() throws QuantityMeasurementException {
        Length firstValue = new Length(1.0, UnitMeasurements.TONNE);
        Length secondValue = new Length(1000.0, UnitMeasurements.GRAMS);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(1001, result, 0.0);

    }

}





