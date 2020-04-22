package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length feet2 = new Length(0.0, Length.Unit.FEET);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnFalse() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameReferenceToObject_ShouldReturnTrue() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Assert.assertEquals(feet1, feet1);
    }

    @Test
    public void givenCheckTypeInchAndFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length inch = new Length(0.1, Length.Unit.INCH);
        Assert.assertNotEquals(feet1, inch);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length feet2 = new Length(1.0, Length.Unit.FEET);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length inch2 = new Length(0.0, Length.Unit.INCH);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenOneNullObjectValue_ShouldReturnFalse() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameReferenceOfObjecth_ShouldReturnTrue() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void givenCheckTypeFeetAndInch_ShouldReturnEqual() {
        Length inch1 = new Length(1.0, Length.Unit.INCH);
        Length feet1 = new Length(1.0, Length.Unit.INCH);
        Assert.assertEquals(inch1, feet1);
    }

    @Test
    public void given1InchAnd1FeetSameEquality_shouldReturnNotEqual() {
        Length inch1 = new Length(1.0, Length.Unit.INCH);
        Length inch2 = new Length(1.1, Length.Unit.INCH);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0Feet_ShouldReturnEqual() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length feet1 = new Length(1.0, Length.Unit.FEET);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnNotEqual() {
        Length inch1 = new Length(0.0, Length.Unit.INCH);
        Length feet1 = new Length(1.0, Length.Unit.FEET);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertFalse(compareCheck);

    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(1.0, Length.Unit.FEET);
        Length feet2 = new Length(1.0, Length.Unit.FEET);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompare_ShouldReturnEqual() {
        Length inch1 = new Length(12.0, Length.Unit.INCH);
        Length feet1 = new Length(1.0, Length.Unit.FEET);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnEqual() {
        Length inch1 = new Length(12.0, Length.Unit.INCH);
        Length feet1 = new Length(1.0, Length.Unit.FEET);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);

    }
}

