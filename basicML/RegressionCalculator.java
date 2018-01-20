/*

 This is an attempt of writing a linear regression program in java

 Author: Dillon Allen

*/

// Main Class here for output

import java.util.Arrays;

public class RegressionCalculator
{
  public static void main(String[] args)
  {

    // data taken from a website with linear regression examples and solutions
    double[] xdata = {63.0, 64.0, 66.0, 69.0, 69.0, 71.0, 71.0, 72.0, 73.0, 75.0};
    double[] ydata = {127.0, 121.0, 142.0, 157.0, 162.0, 156.0, 169.0, 165.0, 181.0, 208.0};

    int x_train_size =0, y_train_size = 0, x_test_size = 0, y_test_size = 0;

    // Split into test and train sets. Take one away from each to keep the indicies restricted to the bounds

    x_train_size = (int) Math.ceil(0.8*xdata.length);
    y_train_size = (int) Math.ceil(0.8*ydata.length);

    // Use Arrays.copyOfRange to get our train and test sets

    double[] x_train = Arrays.copyOfRange(xdata, 0, x_train_size);
    double[] y_train = Arrays.copyOfRange(ydata, 0, y_train_size);

    double[] x_test = Arrays.copyOfRange(xdata, x_train_size, xdata.length);
    double[] y_test = Arrays.copyOfRange(ydata, y_train_size, ydata.length);

    // Display our test and training sets

    System.out.println("Our xtrain set is " + Arrays.toString(x_train));


    // Call the regressor on our training data

    Regressor regressor = new LinReg(x_train, y_train);
    System.out.println("The training set yields the results " + "\n" + regressor.dataReport());

    // Call the predictor method now to see what we get

    double y_pred[] = regressor.predict(x_test);
    System.out.println("The test set predictions are " + "\n" + Arrays.toString(y_pred));
  }
}
