
package booleans;

public class Booleans {

   
    public static void main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
       
        
        // < means less than
        // > means greater than
        // <= means less than or equal to
        // == means equals
        // >= means greater than or equal to
        // != means not equal
        x=7;
        y=8;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
        String s1 = "Good morning";
        String s2 = "Hi there!";
        String s3 = "Howdy, partner";
        int var1 = s1.compareTo(s2);
        int var2 = s2.compareTo(s3);
        System.out.println(var1);
        System.out.println(var2);
        
   
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2 );
        System.out.println(b1 && !b2);
        System.out.println(b1 || b2);
        System.out.println(b2 && b1);
        System.out.println(b2 && !b1);
        
    }
    
}
