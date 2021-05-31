public class ifElseCheck {

  private static final boolean enabled_agg_coldstore = false;
  private static final boolean enable_old_aggregates = true;
  private static final boolean enable_new_aggregates = true;

  public static void main(String[] args) {

    if (enable_old_aggregates && enable_new_aggregates) System.out.println("both true");
    else if (enable_old_aggregates) System.out.println("old aggr enable");
    else if (enable_new_aggregates) System.out.println("new aggr enable");
  }
}
