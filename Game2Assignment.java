public class Main
{
  public static void main(String[] args)
  {
    int x, y, z;

    x = y = z = 1;
    z += x + y;
    System.out.println("x = "+ x +", y = "+ y +", z = "+ z);

    x += y -= z = 5;
    System.out.println("x = "+ x +", y = "+ y +", z = "+ z);
  }
}


// 대입연산자

// a += b      a = a + b
// a *= b      a = a * b
//
