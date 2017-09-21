public class Main {

  public static void main(String[] args) {
      for (int i = 1; i < 12; i += 2) {
          for (int j = 1; j < 12; j += 2) {
              System.out.print((i * j) + " ");
          }
          System.out.println(" ");
      }
  }
}
