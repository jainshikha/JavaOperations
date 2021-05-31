import java.util.ArrayList;
import java.util.List;

public class Listmut {
  public void Display() {
    List<String> list = new ArrayList<>();
    list.add("alice");
    list.add("smirth");
    list.add("jones");
    for (String st : list) {
      st += "50";
    }
    System.out.println(list);
  }

  public static void main(String[] args) {
    Listmut ob = new Listmut();
    ob.Display();
  }
}
