public class Demo{
  public static void removeDuplicates(SuperArray s){  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    SuperArray.removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray();
    a.add("c");   a.add("b");    a.add("b");    a.add("s");

    SuperArray b = new SuperArray();
    b.add("d");   b.add("s");    b.add("b");    b.add("b");   b.add("u");

    SuperArray c = SuperArray.findOverlap(a,b);
    System.out.println(c);

    SuperArray equalCheck1 = new SuperArray(7);
    SuperArray equalCheck2 = new SuperArray(6);

    equalCheck1.add("a");   equalCheck1.add("b");   equalCheck1.add("c");

    equalCheck2.add("a");   equalCheck2.add("b");   equalCheck2.add("c");

    System.out.println(equalCheck1.equals(equalCheck2));

    equalCheck2.add("d");

    System.out.println(equalCheck1.equals(equalCheck2));

    SuperArray zipCheck1 = new SuperArray(6);
    SuperArray zipCheck2 = new SuperArray(4);

    zipCheck1.add("a");   zipCheck1.add("b");   zipCheck1.add("c");

    zipCheck2.add("0");   zipCheck2.add("1");   zipCheck2.add("2");
    zipCheck2.add("3");   zipCheck2.add("4");   

    SuperArray zipped = SuperArray.zip(zipCheck1, zipCheck2);
    System.out.println(zipped);

}
}
