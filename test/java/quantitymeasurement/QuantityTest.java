package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(0.0, Length.Unit.FEET);
        Length feet2 = new Length(0.0,Length.Unit.FEET);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(0.0,Length.Unit.FEET);
        Length feet2 = new Length(1.0,Length.Unit.FEET);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneNullObject_ShouldReturnFalse() {
        Length feet1 = new Length(0.0,Length.Unit.FEET);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameReferenceToLength_ShouldReturnTrue() {
        Length feet1 = new Length(0.0,Length.Unit.FEET);
        Assert.assertEquals(feet1, feet1);
    }
    @Test
    public void givenCheckTypeInchAndFeet_ShouldReturnNotEqual(){
        Length feet1 = new Length(0.0,Length.Unit.FEET);
        Length inch = new Length(0.1,Length.Unit.INCH);
        Assert.assertNotEquals(feet1, inch);

    }
}
