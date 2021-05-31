import java.util.*;

enum Name {
  Alice,
  Smith,
  Bob,
  Jones
}

class HackerEarth1 {

  public static void main(String[] args) {

    Set<Name> obj = new TreeSet<Name>();

    obj.add(Name.Alice);

    obj.add(Name.Smith);

    obj.add(Name.Bob);

    obj.add(Name.Smith);

    for (Name d : obj) {

      System.out.println(d);
    }
  }
}
