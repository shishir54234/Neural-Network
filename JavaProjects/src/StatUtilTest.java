import org.junit.Test;
import static org.junit.Assert.*;

public class StatUtilTest {

    @Test
    public void testRandomFloatInRange()throws IllegalArgumentException {
        float min = -1.0f;
        float max = 1.0f;
        float randomFloat = StatUtil.RandomFloat(min, max);
        assertTrue(randomFloat >= min && randomFloat <= max);
    }

    @Test
    public void testSigmoid()throws IllegalArgumentException {
        float x = 0.0f;
        float sigmoidValue = StatUtil.Sigmoid(x);
        assertEquals(0.5f, sigmoidValue, 0.001f);
    }

    @Test
    public void testSigmoidDerivative()throws IllegalArgumentException {
        float x = 0.0f;
        float sigmoidDerivativeValue = StatUtil.SigmoidDerivative(x);
        assertEquals(0.25f, sigmoidDerivativeValue, 0.001f);
    }

    @Test
    public void testReLU()throws IllegalArgumentException {
        float x = 2.0f;
        float reLUValue = StatUtil.ReLU(x);
        assertEquals(2.0f, reLUValue, 0.001f);
    }

    @Test
    public void testReLUDerivative() throws IllegalArgumentException{
        float x = 2.0f;
        float reLUDerivativeValue = StatUtil.ReLUDerivative(x);
        assertEquals(1.0f, reLUDerivativeValue, 0.001f);
    }

    @Test
    public void testSquaredError()throws IllegalArgumentException {
        float output = 0.5f;
        float target = 0.8f;
        float squaredErrorValue = StatUtil.squaredError(output, target);
        assertEquals(0.615f, squaredErrorValue, 0.001f);
    }


}
