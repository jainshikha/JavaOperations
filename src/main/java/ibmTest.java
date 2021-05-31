import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ibmTest
{

  public static void main(String[] args) {
    //
    StringBuilder s1 = new StringBuilder("Java");
    String s2 = "love";
    s1.append(s2);
    s2.substring(4);
    int fountAt=s1.indexOf(s2);
    System.out.println(fountAt);


    List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
    nums.stream().filter(n->n%2==0).forEach(System.out::println);
    }


}
