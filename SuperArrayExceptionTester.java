public class SuperArrayExceptionTester{

  public static void main(String[] args){
    try {
      SuperArray negative = new SuperArray(-4);
    }
    catch (IllegalArgumentException e) {
      System.out.println("Please provide a non-negative capacity");
    }

    SuperArray test = new SuperArray(5);
    test.add("hi");   test.add("hi");   test.add("hi");   test.add("hi");

    try {
      System.out.println(test.get(3));
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("Please provide an index between 0 and " + (test.size() - 1));
    }
    System.out.println(test.get(2));

    try {
      test.set(3, "bye");
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("Please provide an index between 0 and " + (test.size() - 1));
    }
    System.out.println(test.set(2, "bye"));
    System.out.println(test);

    try {
      test.add(4, "hi");
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("Please provide an index between 0 and " + test.size());
    }
    System.out.println(test.size());

    try {
      test.remove(4);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("Please provide an index between 0 and " + (test.size() - 1));
    }
    System.out.println(test.size());

  }

}
