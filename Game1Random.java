import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();

    System.out.println("0 ~ 99 범위의 난수:" + Math.abs(r.nextInt() % 100));

    System.out.println("0 ~ 2 범위의 난수:" + Math.abs(r.nextInt() % 3));

  }
}

// Random 클래스는 약 -20000000?? ~ 약 20000000??  100나눈 나머지가 0 ~99 사이의 값 
