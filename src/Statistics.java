
import java.util.Arrays;
import java.lang.Math;

/**
 * Methods for computing some common statistics,
 * such as average, variance, and correlation.
 */
public class Statistics {

	/**
	 * Compute the arithmetic average of an array of numbers.
	 * @param x is array to compute average of.  Must not be null.
	 * @return the arithmetic average of values in x, or 0 if x is empty.
	 */
	public static double average(double[] x) {
		// Some fun: instead of a loop.
		double sum = Arrays.stream(x).sum();
		return sum/x.length;
	}
	
	/**
	 * Compute the variance of values in an array.
	 * Variance uses the formula sum(x[k]*x[k])/length(x) - average(x)^2.
	 * 
	 * @param x is the array of values. Must contain at least 1 element.
	 * @return the variance of x
	 * @throws IllegalArgumentException if x is empty
	 */
	public static double variance(double[] x) {
         if (x.length == 0) {
             throw new IllegalArgumentException("There is no any variance in the array.");
            }
        double sum = 0D;
        for (double vari : x) {
            sum += vari * vari;
           }
         return sum / x.length - Math.pow(average(x), 2);
        
          }
        
	
	/**
	 * Compute the covariance between arrays x and y.
	 * The covariance is defined by
	 * 
	 * sum[ (x[k] - average(x)) * (y[k] - average(y)) ]/n
	 * where n is number of elements in the arrays.
	 * 
	 * But it is more efficient to compute using the equivalent formula:
	 * 
	 * sum( x[k]*y[k] )/n - average(x)*average(y)
	 * 
	 * Note that if x == y, this is the variance.
	 * 
	 * @param x is the first array of values.
	 * @param y is the second array of values
	 * @return the covariance between x and y
	 * @throws IllegalArgumentException if arrays are not same length or length is 0.
	 */
	public static double covariance(double[] x, double[] y) {
         if(x.length == 0 & y.length == 0){
             throw new IllegalArgumentException("There is no any covariance in the array.");
           }
        double sum = 0D;
        for (int i =0; i<x.length;i++) {
            double xCovari = x[i] - average(x);
            double yCovari = y[i] - average(y);
            sum += xCovari * yCovari;   
        }
        return sum/x.length;
            
        }
	 	
	
}

