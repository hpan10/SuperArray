import java.util.Arrays;

public class SuperArrayTester{

  public static void main(String[]args){

    SuperArray a1 = new SuperArray();
    System.out.println(a1.size()); // Should print 0
    a1.add("One");
    System.out.println(a1.size()); // Should print 1
    System.out.println(a1.get(0)); // Should print "One"
    System.out.println(a1.get(1)); // Should print "Nothing exists at index 1"
    System.out.println(a1.set(0, "Zero")); // Should print "One"
    System.out.println(a1.get(0)); // Should print "Zero"
    System.out.println(a1.get(1)); // Should print "Nothing exists at index 1"
    System.out.println(Arrays.toString(a1.data));
    a1.resize();
    System.out.println(Arrays.toString(a1.data));
    a1.add("One");
    a1.add("Two");
    System.out.println(a1.size()); //Should print 3
    a1.resize();
    System.out.println(Arrays.toString(a1.data));

    SuperArray a2 = new SuperArray();
    System.out.println(Arrays.toString(a2.data));
    a2.add("Test");
    System.out.println(a2);
    a2.add("Test");
    System.out.println(a2);
    a2.add("Test");
    System.out.println(a2);
    a2.add("Test");
    System.out.println(a2);
    a2.add("Test");
    System.out.println(a2);
    a2.add("Test");
    System.out.println(a2);
    a2.add("Test");
    a2.add("Test");
    a2.add("Test");
    a2.add("Test");
    System.out.println(Arrays.toString(a2.data));
    System.out.println(a2.size()); // Should print 10
    a2.add("HA");
    System.out.println(Arrays.toString(a2.data));
    System.out.println(a2.size()); // Should print 11
    System.out.println(a2);
    System.out.println(a2.contains("Test"));
    System.out.println(a2.contains("hehe"));
    System.out.println(a2.contains("HA"));
    System.out.println(a2);
    a2.clear();
    System.out.println(Arrays.toString(a2.data));
    System.out.println(a2);


    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.size()); // Should print 3
    System.out.println(Arrays.toString(words.data));


  }

}
