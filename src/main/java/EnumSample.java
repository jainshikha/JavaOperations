public enum EnumSample {
  HELIUM("He", "Gas"),
  MAGNESIUM("Mg", "Sollid");
  private final String cS;
  private final String n;

  EnumSample(String ncs, String nN) {
    cS = ncs;
    n = nN;
  }

  public static void main(String[] args) {
    System.out.printf(
        "%s,%s,%s",
        EnumSample.HELIUM.toString(), EnumSample.HELIUM.chemicalSym(), EnumSample.HELIUM.n);
    System.out.println("//////////////////////");
    System.out.println(EnumSample.HELIUM);
  }

  public String chemicalSym() {
    return cS;
  }

  public String na() {
    return n;
  }
}
