package quantitymeasurement;

import jdk.jshell.execution.Util;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(UnitMeasurementS.FEET,0.0);
        Length feet2 = new Length(UnitMeasurementS.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnFalse() {
        Length feet1 = new Length(UnitMeasurementS.FEET, 0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameReferenceToObject_ShouldReturnTrue() {
        Length feet1 = new Length(UnitMeasurementS.FEET,0.0);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void givenCheckTypeInchAndFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(UnitMeasurementS.FEET,0.0);
        Length inch1 = new Length(UnitMeasurementS.INCH,0.1);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(UnitMeasurementS.FEET,0.0);
        Length feet2 = new Length(UnitMeasurementS.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,0.0);
        Length inch2 = new Length(UnitMeasurementS.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenOneNullObjectValue_ShouldReturnFalse() {
        Length inch1 = new Length(UnitMeasurementS.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameReferenceOfObjecth_ShouldReturnTrue() {
        Length inch1 = new Length(UnitMeasurementS.INCH,0.0);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void givenCheckTypeFeetAndInch_ShouldReturnEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,1.0);
        Length feet1 = new Length(UnitMeasurementS.INCH,1.0);
        Assert.assertEquals(inch1, feet1);
    }

    @Test
    public void given1InchAnd1FeetSameEquality_shouldReturnNotEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,1.0);
        Length inch2 = new Length(UnitMeasurementS.INCH,1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,0.0);
        Length feet1 = new Length(UnitMeasurementS.FEET,0.0);
        boolean compareCheck = UnitMeasurementS.compare(inch1,feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,0.0);
        Length feet1 = new Length(UnitMeasurementS.FEET,1.0);
        boolean compareCheck = UnitMeasurementS.compare(inch1, feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,0.0);
        Length feet1 = new Length(UnitMeasurementS.FEET,1.0);
        boolean compareCheck = UnitMeasurementS.compare(feet1,inch1);
        Assert.assertFalse(compareCheck);

    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(UnitMeasurementS.FEET,1.0);
        Length feet2 = new Length(UnitMeasurementS.FEET,1.0);
        boolean compareCheck = UnitMeasurementS.compare(feet2,feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompare_ShouldReturnEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,12.0);
        Length feet1 = new Length(UnitMeasurementS.FEET,1.0);
        boolean compareCheck = UnitMeasurementS.compare(inch1,feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        Length inch1 = new Length(UnitMeasurementS.INCH,12.0);
        Length feet1 = new Length(UnitMeasurementS.FEET,1.0);
        boolean compareCheck = UnitMeasurementS.compare(feet1,inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAnd1Yard_ShouldReturnTrue() {
        Length value1 = new Length(UnitMeasurementS.FEET,3.0);
        Length value2 = new Length(UnitMeasurementS.YARD,1.0);
        boolean compareCheck = UnitMeasurementS.compare(value2, value1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenOneFeetAndOneYard_ShouldReturnNotEqual() {
        Length value1 = new Length(UnitMeasurementS.FEET,1.0);
        Length value2 = new Length(UnitMeasurementS.YARD,1.0);
        boolean compareCheck = UnitMeasurementS.compare(value2, value1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void givenOneInchAndOneYard_ShouldReturnNotEqual() {
        Length value1 = new Length(UnitMeasurementS.INCH,1.0);
        Length value2 = new Length(UnitMeasurementS.YARD,1.0);
        boolean compareCheck = UnitMeasurementS.compare(value2, value1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Length value1 = new Length(UnitMeasurementS.INCH,36.0);
        Length value2 = new Length(UnitMeasurementS.YARD,1.0);
        boolean compareCheck = UnitMeasurementS.compare(value1,value2);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given36InchAndOneYard_ShouldReturnEqual() {
        Length value1 = new Length(UnitMeasurementS.INCH,36.0);
        Length value2 = new Length(UnitMeasurementS.YARD,1.0);
        boolean compareCheck = UnitMeasurementS.compare(value2, value1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Length value1 = new Length(UnitMeasurementS.FEET,3.0);
        Length value2 = new Length(UnitMeasurementS.YARD,1.0);
        boolean compareCheck = UnitMeasurementS.compare(value2, value1);
        Assert.assertTrue(compareCheck);
    }
}

