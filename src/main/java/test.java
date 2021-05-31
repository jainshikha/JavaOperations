import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.lang.AutoCloseable;
public class test {
    public static void i(int i)
    {
    System.out.println(i);
    }
    public static void i(Integer i){
    System.out.println("srfomg: Integer: "+ i);
    }
    public static void main(String[] args) {
    //

        i(10);

      String name = "sachin sachin rahul surabh";
      List<String> names = new ArrayList<>(Arrays.asList(name.split(" ")));
      Map<Object, Long> names_startswiths= new LinkedHashMap<>();

      names_startswiths = names.stream()
        .collect(Collectors.groupingBy(k ->k, Collectors.counting()));
    System.out.println("-----------");
        names.stream().filter( x-> x.startsWith("s")).forEach(System.out::println);
                //.collect(Collectors.groupingBy(k ->k, Collectors.counting()));
        System.out.println("-----------");

        names.replaceAll(String::toUpperCase);
    System.out.println(names);
    //System.out.println(names_startswiths);

      int sum = 0;
      for(int i = 0; i < 10; i++){
          if(i%3 == 0 || i%5 == 0){
              sum = sum + i;
          }
      }
    System.out.println(sum);

      try{
          Map m = new TreeMap();
          //m.put(null,"aud");
          m.put(11,"audi");
            m.put(11,"bmw");
          System.out.println(m);

      }catch (Exception  e)
      {
      System.out.println(e);
      }
      //firstNonRepeatedCharacterJava8("stress");
  }
    public static String firstNonRepeatedCharacterJava8(String input) {

        Map chars = input.codePoints().mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(chars);

    for (int i = 1; i <=5 ; i++) {
      System.out.println(".........." + i);
    }

        return "S";

//
//        int pos = chars.entrySet().stream().filter(e -> e.getValue() == 1L).findFirst().map(Map.Entry::getKey)
//                .orElse(Integer.valueOf(Character.MIN_VALUE));
//
//        return String.valueOf(Character.toChars(pos));

    }

}
