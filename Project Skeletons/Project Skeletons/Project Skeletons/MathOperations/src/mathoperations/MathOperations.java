package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,d,e,g,i,j;
          double a,b,c,f,h;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         
         d = 18;
         System.out.println("d is " + d);
         e = d+d;
         System.out.println("d+d is " + e);
         f = e+d+c-p;
         System.out.println("e+d+c-p is " + f);
         
         g = e*d;
         System.out.println("e*d is " + g);
         h = g/d*f;
         System.out.println("g/d*f is" + h);
         i = --d;
         System.out.println("d-- is " + i);
         j = ++e;
         System.out.println("e-- is " + j);
         
                 
         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
     }
}