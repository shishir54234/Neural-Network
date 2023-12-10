# Neural Network Implementation in Java

## Overview

This Java project provides an object-oriented implementation of a neural network without external libraries. It includes classes for `NeuralNetwork`, `Layer`, `Neuron`, and `StatUtil`. The implementation supports training with CSV files for input and output, allowing flexibility in dimensions.

## Structure

The project structure is organized as follows:

- `NeuralNetwork.java`: Main class containing the implementation of the neural network, including forward and backward propagation.
- `Layer.java`: Class representing a layer of neurons in the network.
- `Neuron.java`: Class representing a single neuron in the network.
- `StatUtil.java`: Utility class containing mathematical functions used in the neural network.
- `input_training.csv`: CSV file containing training input data.
- `output_training.csv`: CSV file containing corresponding training output data.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/neural-network-java.git
2. Navigate to project directory 

    ```
    cd neural-network-java
3. Compile the java Files

    ```
    javac NeuralNetwork.java
4. Run the example:

    ```
    java NeuralNetwork

## Customization

You can customize the neural network by adjusting parameters such as the number of layers, neurons per layer, learning rate, and activation function in the NeuralNetwork.java file.

## Input and Output Flexibility
The neural network supports training with CSV files (input_training.csv and output_training.csv). The input and output can be of any dimension, providing flexibility for different datasets.

## Example CSV Format
1. input_training.csv
   ```
    1, 0, 0
    0, 1, 1
    1, 1, 0
2. output_training.csv
    ```
    0
    1
    1
### Contributors
 1. Shishir Shahi
 2. Vihan Vashishth



