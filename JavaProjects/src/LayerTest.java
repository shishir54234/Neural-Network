
import org.junit.Test;
import static org.junit.Assert.*;

public class LayerTest {

    @Test
    public void testHiddenAndOutputLayerConstructor() {
        Layer layer = new Layer(1, 5);

        assertNotNull(layer.neurons);
        assertEquals(5, layer.neurons.length);

        for (Neuron neuron : layer.neurons) {
            assertNotNull(neuron.weights);
            assertEquals(1, neuron.weights.length);
        }
    }

    @Test
    public void testInputLayerConstructor() {
        float[] input = {1.0f, 2.0f, 3.0f};
        Layer layer = new Layer(input);

        assertNotNull(layer.neurons);
        assertEquals(input.length, layer.neurons.length);

        for (int i = 0; i < input.length; i++) {
            assertEquals(input[i], layer.neurons[i].value,0.001);
        }
    }

    // Add more test methods as needed to cover different scenarios

}
