/*

Linear Regression Calculator

*/

import java.util.Arrays;

// Linear Regression Formula
class LinReg implements Regressor
{
  private final double intercept, slope, r2;

  public LinReg(double[] x, double [] y)
  {
    if (x.length != y.length)
    {
      throw new IllegalArgumentException("Array lengths not equal");
    }

    int n = x.length;

    double sumx = 0.0, sumy = 0.0, b1num = 0.0, b1denom = 0.0, b1 = 0.0, b0 = 0.0;

    for(int i=0; i < n; i++)
    {
      sumx += x[i];
      sumy += y[i];
    }

    double xbar = 0.0, ybar = 0.0, ssto = 0.0, ssr = 0.0;
    xbar = (sumx/n);
    ybar = (sumy/n);

    for(int i=0; i < n; i++)
    {
      b1num += (x[i] - xbar)*(y[i] - ybar);
      b1denom += Math.pow((x[i] - xbar),2);
      ssto += Math.pow((y[i] - ybar),2);
    }

    b1 = (b1num / b1denom);

    b0 = ybar - b1*xbar;

    slope = b1;
    intercept = b0;

    // Calculate the SSR
    for(int i = 0; i < n; i++)
    {
      ssr += Math.pow(((intercept + slope*x[i]) - ybar),2);
    }

    r2 = (ssr/ssto) ;
  }

  public String dataReport()
  {

    return "The regression line is y_hat = " + intercept + " + " + slope + "*x" + "\n" + "with an R2 of " + r2;

  }

  public double[] predict(double[] x)
  {

    int j = x.length;

    double[] predictors = new double[j];

    for(int i = 0; i < j; i++)
    {
      predictors[i] = intercept + slope*x[i];
    }

    return predictors;
  }

}
