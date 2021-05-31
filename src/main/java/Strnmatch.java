import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strnmatch {
  public static void main(String[] args) {

    //
    String regx = "\\b(\\d{3})\\d{7}\\b";
    Pattern p = Pattern.compile(regx);
    String sou = "3342449027, 2339829, and 6152534734";
    Matcher m = p.matcher(sou);
    while (m.find()) {
      String val = m.group();
      String val2 = m.group(1);
      System.out.println("val: " + val + " val2 " + val2);
    }
    System.out.println("hiiiiiiii");
  }
}
