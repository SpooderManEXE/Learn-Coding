class Main {
  public static void main(String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
}
