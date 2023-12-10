import org.junit.Test;
import static org.junit.Assert.*;

public class NeuronTest {

    @Test
    public void testHiddenAndOutputNeuronConstructor()throws IllegalArgumentException {
        float[] weights = {0.5f, 0.8f, -0.3f};
        float bias = 1.2f;
        Neuron neuron = new Neuron(weights, bias);

        for (int i = 0; i < weights.length; i++) {
            assertEquals(weights[i], neuron.weights[i], 0.001); // You might need to adjust the delta
        }

        assertEquals(bias, neuron.bias, 0.001); // You might need to adjust the delta
        for (int i = 0; i < weights.length; i++) {
            assertEquals(weights[i], neuron.cache_weights[i], 0.001); // You might need to adjust the delta
        }
        assertEquals(0, neuron.gradient, 0.001); // You might need to adjust the delta
    }

    @Test
    public void testInputNeuronConstructor() throws IllegalArgumentException{
        float value = 2.5f;
        Neuron neuron = new Neuron(value);

        assertNull(neuron.weights);
        assertEquals(-1f, neuron.bias, 0.001); // You might need to adjust the delta
        assertNull(neuron.cache_weights);
        assertEquals(-1, neuron.gradient, 0.001); // You might need to adjust the delta
        assertEquals(value, neuron.value, 0.001); // You might need to adjust the delta
    }

    @Test
    public void testUpdateWeight() throws IllegalArgumentException{
        float[] initialWeights = {0.5f, -0.2f, 0.8f};
        Neuron neuron = new Neuron(initialWeights, 1.0f);

        float[] newWeights = {-0.3f, 0.7f, -0.1f};
        neuron.cache_weights = newWeights;

        neuron.update_weight();

        for (int i = 0; i < initialWeights.length; i++) {
            assertEquals(newWeights[i], neuron.weights[i], 0.001); // You might need to adjust the delta
        }
    }

    // Add more test methods as needed to cover different scenarios

}
