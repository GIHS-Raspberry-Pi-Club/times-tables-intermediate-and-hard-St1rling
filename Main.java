public class Main {

  public static void main(String[] args) {
      for (int i = 1; i < 12; i += 2) {
          String out = "";
          for (int j = 1; j < 12; j += 2) {
              out = out + (i * j) + " ";
          }
          System.out.println(out);
      }
  }
}
