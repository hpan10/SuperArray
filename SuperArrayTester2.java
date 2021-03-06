import java.util.Arrays;

public class SuperArrayTester2{

  public static void main(String[] args){

    SuperArray a = new SuperArray(10);
    a.add("one");
    a.add("two");
    a.add("three");
    a.add("five");
    System.out.println(a);
    System.out.println(a.data.length);
    System.out.println(a.size());
    a.add(3, "four");
    System.out.println(a);
    System.out.println(a.data.length);
    System.out.println(a.size());

    SuperArray b = new SuperArray(4);
    b.add("one");
    b.add("two");
    b.add("three");
    b.add("five");
    b.add("four");
    System.out.println(b);
    System.out.println(b.size());
    System.out.println(b.data.length);
    System.out.println(b.remove(3));
    System.out.println(b);
    System.out.println(b.size());
    System.out.println(b.data.length);
    System.out.println(b.indexOf("five"));
    System.out.println(b.indexOf("four"));
    System.out.println(b.remove(-1));
    System.out.println(b.remove(8));

    String[] c = b.toArray();
    System.out.println(Arrays.toString(c));
    System.out.println(c.length);
    System.out.println(c[2]);



  }

}
