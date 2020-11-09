import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;

public class ClassPathTester {
  public static void main(String[] args) {
    try {
      double[] limit = {1, 2, 3};
      String[] stra = {"{2}", "{2}", "{2}"};
      ChoiceFormat cf = new ChoiceFormat(limit, stra);
      Format[] farray = {cf, null, NumberFormat.getInstance()};
      MessageFormat mf = new MessageFormat("{0} out of {2}");
      mf.setFormats(farray);
      Object[] targs = {null, "3", null};
      for (int i = 0; i < 4; i++) {
        targs[0] = new Integer(i);
        targs[2] = targs[0];
        System.out.println(mf.format(targs));
      }
    } catch (Exception e) {
      System.out.println(e.getClass());
    }
  }
}
