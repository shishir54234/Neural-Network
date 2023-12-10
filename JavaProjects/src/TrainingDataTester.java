import org.junit.Test;
import static org.junit.Assert.*;

public class TrainingDataTester {

    @Test
    public void testTrainingDataInitialization() {
        float[] inputData = {0.1f, 0.2f, 0.3f};
        float[] expectedOutput = {0.5f, 0.6f};

        TrainingData trainingData = new TrainingData(inputData, expectedOutput);

        // Check if the input data and expected output are correctly initialized
        assertArrayEquals(inputData, trainingData.data, 0.01f);
        assertArrayEquals(expectedOutput, trainingData.expectedOutput, 0.01f);
    }

    // Add more test methods as needed to cover other functionalities

}
