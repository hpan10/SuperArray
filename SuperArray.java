public class SuperArray{

  //instance variables
  private String[] data;
  private int size;

  //constructor
  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  //methods
  public int size(){
    return size;
  }

  public boolean add(String element){
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index){
    if (index >= 0 && index <= size - 1) return data[index];
    return "Nothing exists at index " + index;
  }

}
