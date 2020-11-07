public class SuperArray{

  //instance variables
  public String[] data;
  private int size;

  //constructor
  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int InitialCapacity){
    data = new String[InitialCapacity];
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

  public void add(int index, String element){
    if (!(index > size || index < 0)){
      if (size == data.length) resize();
      if (data[index] != null){
        for (int i = size; i >= index; i--){
          data[i + 1] = data[i];
        }
      }
      data[index] = element;
      size++;
    }
  }

  public String remove(int index){
    if (!(index > size - 1|| index < 0)){
      String value = data[index];
      if (data[index] != null){
        for (int i = index; i < size - 1; i++){
          data[i] = data[i + 1];
        }
      }
      size--;
      return value;
    }
    return "Nothing exists at this index";
  }

  public String get(int index){
    if (index >= 0 && index <= size - 1) return data[index];
    return "Nothing exists at index " + index;
  }

  public int indexOf(String s){
    if (contains(s)){
      for (int index = 0; index < size; index++){
        if (data[index].equals(s)) return index;
      }
    }
    return -1;
  }

  public String set(int index, String element){
    if (index >= 0 && index <= size - 1){
      String temp = data[index];
      data[index] = element;
      return temp;
    }
    return "Nothing exists at index " + index;
  }

  private void resize(){
    String[] newArray = new String[data.length * 2];
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
      else toString += data[i];
    }
    return toString + "]";
  }

  public String[] toArray(){
    String[] array = new String[size];
    for (int i = 0; i < size; i++){
      array[i] = data[i];
    }
    return array;
  }

  public boolean contains(String s){
    for (int i = 0; i < data.length; i++){
      if (data[i] == null);
      else if (data[i].equals(s)) return true;
    }
    return false;
  }

  public void clear(){
    size = 0;
    for (int start = 0; start < size; start ++){
      data[start] = null;
    }
  }

  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size();){
      if (s.indexOf(s.get(i)) != i){
        s.remove(i);
      }
      else i++;
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray(1);
    for (int i = 0; i < a.size(); i++){
      if (b.indexOf(a.get(i)) != -1){
        c.add(a.get(i));
      }
    }
    removeDuplicates(c);
    return c;
  }

  public int lastIndexOf(String value){
    if (contains(value)){
      for (int index = size - 1; index >= 0; index--){
        if (data[index].equals(value)) return index;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    return (this.toString().equals(other.toString()));
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray(a.size + b.size);
    for (int i = 0; i < Math.max(a.size, b.size); i++){
      if (i < a.size) c.add(a.get(i));
      if (i < b.size) c.add(b.get(i));
    }
    return c;
  }

}
