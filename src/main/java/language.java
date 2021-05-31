enum language {
  Python(10),
  Java(9),
  Anuglar(12);
  private final int coders;

  language(int p) {
    coders = p;
  }

  int getCoders() {
    return coders;
  }
}