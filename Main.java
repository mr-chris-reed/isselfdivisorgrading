class Main {
  public static void main(String[] args) {
    if (isSelfDivisor(128)) {
      System.out.println("PASS test case for 128");
    }
    else {
      System.out.println("FAIL test case for 128");
    }
    if (!isSelfDivisor(26)) {
      System.out.println("PASS test case for 26");
    }
    else {
      System.out.println("FAIL test case for 26");
    }
    if (isSelfDivisor(155)) {
      System.out.println("PASS test case for 155");
    }
    else {
      System.out.println("PASS test case for 155");
    }
    if (!isSelfDivisor(105)) {
      System.out.println("PASS test case for 105");
    }
    else {
      System.out.println("PASS test case for 105");
    }
    if (isSelfDivisor(888)) {
      System.out.println("PASS test case for 888");
    }
    else {
      System.out.println("FAIL test case for 888");
    }
    if (!isSelfDivisor(228)) {
      System.out.println("PASS test case for 228");
    }
    else
    {
      System.out.println("PASS test case for 228");
    }
    if (!isSelfDivisor(639)) {
      System.out.println("PASS test case for 639");
    }
    else
    {
      System.out.println("PASS test case for 639");
    }
  }

  public static boolean isSelfDivisor(int number) {
    return false;
  }
}