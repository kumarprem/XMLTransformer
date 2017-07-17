import java.time.LocalDate;
import java.time.Period;
import java.util.*;

  public class While {   
	
	  
	
	private String ok;
	  private static float[] f = new float[2]; 
  public static void main(String[] args) {           
    List<Integer> numbers = Arrays.asList(1, 2, 3);
   // Test obj= new Test();
    class Horse 
    {
        public String name; /* Line 7 */
        public Horse(String s) 
        {
            name = s;
        }
    } /* class Horse ends */
    
    Object obj = new Horse("Zippo"); /* Line 13 */
    Horse h = (Horse) obj; /* Line 14 */
    System.out.println("horse -"+h.name);
  
    String s1 = "abc";
    String s2 = "def";
    String s3 = s2;   /* Line 7 */
    s2 = "ghi";
    System.out.println(s1 + s2 + s3);
    
    int result = 0;
    short s = 42;
    Long x = new Long("42");
    Long y = new Long(42);
    Short z = new Short("42");
    Short x2 = new Short(s);
    Integer y2 = new Integer("42");
    Integer z2 = new Integer(42);

    if (x == y) /* Line 13 */
        result = 1;
    if (x.equals(y) ) /* Line 15 */
        result = result + 10;
    if (x.equals(z) ) /* Line 17 */
        result = result + 100;
    if (x.equals(x2) ) /* Line 19 */
        result = result + 1000;
    if (x.equals(z2) ) /* Line 21 */
        result = result + 10000;

    System.out.println("result = " + result);
       System.out.println("f[0] = " + f[0]); 
    

    
   /// numbers.removeIf(n-> n%2==0);
   LocalDate l = LocalDate.of(2015, 3, 26);
   Period p = Period.ofDays(1);
   System.out.println(" datae ----"+l.plus(p));
  //  System.out.println(obj.ok);
    //Integer  q = Integer.valueOf("109.0");
    numbers.stream()
      .map(e -> e * 2) // e is the parameter to the labda, much like args is the parameter to main
      .forEach(System.out::println);
      
 /* String s ="A";
  switch(s){
  case"B": 
	  System.out.println("b");
	  default :
		  System.out.println("default");  
	  case "A":
	  System.out.println("A");
  }
  
*/    //lambda expresssions do not carry state
    
    int factor = 2; // this is effectively final, as good as being declared final
    
    numbers.stream()
      .map(e -> e * factor) //this is a closure
      .forEach(System.out::println);           
      
    //closures carry state. They close-over (hence closure) the defining scope to bind to
    //variables that are not passed in as parameters. Here factor is closed over.
    
    //closures carry (immutable) state
  }
}


