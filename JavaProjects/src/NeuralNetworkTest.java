import org.junit.BeforeClass;
import org.junit.Test;

import com.opencsv.exceptions.CsvException;

import static org.junit.Assert.*;

public class NeuralNetworkTest {

    @BeforeClass
    public static void setUp() throws CsvException{
        // Set up layers and any other necessary initialization
        NeuralNetwork.layers = new Layer[3];
        NeuralNetwork.layers[0] = null;
        NeuralNetwork.layers[1] = new Layer(2, 5);
        NeuralNetwork.layers[2] = new Layer(5, 1);
    }

    @Test

    public static void printNeuralNetworkOutput() {
        for (int i = 0; i < NeuralNetwork.tDataSet.length; i++) {
            NeuralNetwork.forward(NeuralNetwork.tDataSet[i].data);
            System.out.println(NeuralNetwork.layers[2].neurons[0].value);
        }
    }
    public void testForward() throws CsvException, InternalError {
        float[] inputData = {0.5f, 0.7f}; // Adjust values based on your data
        float[] expectedOutput = {0.3f}; // Adjust based on your expected output

        // Call the forward method
        NeuralNetwork.forward(inputData);

        // Assert the values based on your expectations
        assertEquals(expectedOutput[0], NeuralNetwork.layers[2].neurons[0].value, 0.3); // Adjust the delta as needed
    }

    @Test
    public void testBackward() throws CsvException, InternalError {
        float[] inputData = {0.5f, 0.7f}; // Adjust values based on your data
        float[] expectedOutput = {0.3f}; // Adjust based on your expected output

        // Call the forward method to set initial values
        NeuralNetwork.forward(inputData);

        // Call the backward method
        NeuralNetwork.backward(0.01f, new TrainingData(inputData, expectedOutput));

        // Assert the values based on your expectations
        // You may want to check if weights and biases are updated correctly
        // For simplicity, we are not checking all values here
        assertEquals(0.01, NeuralNetwork.layers[2].neurons[0].cache_weights[0], 0.2); // Adjust the delta as needed
    }
    
    // Add more test methods for other functionalities as needed
}
