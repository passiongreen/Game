class Main {
  public static void main(String[] args)
  {
    boolean x, y, z, b;

    x = false;
    y= z = true;
    b = x || y && z; // 우선순위    && -> ||    x || (y && z)
    System.out.println("x = "+ x +", y = "+ y +", z = "+ z +", b = "+ b);
  }
}

// 논리연산자
// a && b     AND
// a || b      OR
// !a         NOT
