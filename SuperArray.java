import java.util.Arrays;

public class SuperArray{

  //instance variables
  public String[] data;
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
    if (size == data.length) resize();
    data[size] = element; size++; return true;
  }

  public String get(int index){
    if (index >= 0 && index <= size - 1) return data[index];
    return "Nothing exists at index " + index;
  }

  public String set(int index, String element){
    if (index >= 0 && index <= size - 1){
      String temp = data[index];
      data[index] = element;
      return temp;
    }
    return "Nothing exists at index " + index;
  }

  public void resize(){
    String[] newArray = new String[data.length + 1];
    for (int start = 0; start < size; start++){
      newArray[start] = get(start);
    }
    data = newArray;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public String toString(){
    String toString = "[";
    for (int i = 0; i < size; i++){
      if (i != size - 1) toString += data[i] + ", ";
      else toString += data[i] + "]";
    }
    return toString;
  }

  public boolean contains(String s){
    for (int i = 0; i < data.length; i++){
      if (data[i] == null);
      else if (data[i].equals(s)) return true;
    }
    return false;
  }

}
