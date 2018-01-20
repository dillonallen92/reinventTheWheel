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

    x_train_size = Math.ceil(0.8*x.length).intValue();


    Regressor regressor = new LinReg(xdata, ydata);
    System.out.println(regressor.dataReport());


  }
}
