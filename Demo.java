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

    SuperArray c = findOverlap(a,b);
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

    SuperArray zipped = zip(zipCheck1, zipCheck2);
    System.out.println(zipped);
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray(1);
    for (int i = 0; i < a.size(); i++){
      if (b.contains(a.get(i))){
        c.add(a.get(i));
      }
    }
    SuperArray.removeDuplicates(c);
    return c;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray(a.size() + b.size());
    for (int i = 0; i < Math.max(a.size(), b.size()); i++){
      if (i < a.size()) c.add(a.get(i));
      if (i < b.size()) c.add(b.get(i));
    }
    return c;
  }

}
