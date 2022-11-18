/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] array1 = new double[array.length];
        for(int i = 0; i < array.length; i++){
            array1[i] = array[i];
        }
        return array1;

	}
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for(int i = 0; i < x.length; i++){
            x[i] = alpha*x[i];
            y[i] = alpha*y[i];
        }

	// WRITE YOUR CODE HERE
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }

	// WRITE YOUR CODE HERE
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        theta = Math.toRadians(theta);
        //use the copy

        for(int i = 0; i < x.length; i++){
            double temp_x = x[i];
            double temp_y = y[i];
            x[i] = temp_x*Math.cos(theta) - temp_y*Math.sin(theta);
            y[i] = temp_y*Math.cos(theta) + temp_x*Math.sin(theta);
        }

	// WRITE YOUR CODE HERE
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        
        // Scales polygon by the factor 2.

        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double theta = -45.0;
        double alpha = 2.0; 
        double dx = 2.0, dy = 1.0;
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        //scale(x, y, alpha); 
        rotate(x, y, theta);
        //translate(x, y, dx, dy);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        //System.out.println(copy());



	// WRITE YOUR CODE HERE
    }
}
