/*

 This is an attempt of writing a linear regression program in java

 Author: Dillon Allen

*/

// Main Class here for output

public class LinearRegression
{
  public static void main(String[] args)
  {

    // data taken from a website with linear regression examples and solutions
    double[] xdata = {63.0, 64.0, 66.0, 69.0, 69.0, 71.0, 71.0, 72.0, 73.0, 75.0};
    double[] ydata = {127.0, 121.0, 142.0, 157.0, 162.0, 156.0, 169.0, 165.0, 181.0, 208.0};

    LinReg regressor = new LinReg(xdata, ydata);
    System.out.println(regressor.dataReport());


  }
}
