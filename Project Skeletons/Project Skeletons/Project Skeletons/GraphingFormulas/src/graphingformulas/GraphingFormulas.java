
package graphingformulas;


public class GraphingFormulas {

    
    public static void main(String[] args) {
	
		//this part will test the functions
		System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has slope " + slope(2,8,4,-4) );
                
		System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has distance " + distance(2,8,4,-4) );
 
	}
 
    
        public static double slope( int x1, int y1, int x2, int y2 )
	{
            // put your code here and change the return value below
            return ( y2 -  y1) / ( x2 -  x1);
	}
        
	public static double distance( int x1, int y1, int x2, int y2 )
	{
            // put your code here and change the return value below
            int n1 = x2 - x1;
            int n3 = y2 - y1;
            int n2 = 2;
            int n4 = 2;
            return Math.sqrt(Math.pow(n1, n2) + Math.pow(n3,n4));
	}
}