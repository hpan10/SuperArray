import java.util.Arrays;

public class SuperArrayTester{

  public static void main(String[]args){

    SuperArray a1 = new SuperArray();
    System.out.println(a1.size()); // Should print 0
    a1.add("One");
    System.out.println(a1.size()); // Should print 1
    System.out.println(a1.get(0)); // Should print "One"
    System.out.println(a1.get(1)); // Should print "Nothing exists at index 1"

  }

}
