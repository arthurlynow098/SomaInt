import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int A, B, resultado;
      
      A = sc.nextInt();
      B = sc.nextInt();
      
      resultado = A + B;
      
      
      System.out.printf("SOMA É DE: " + resultado);
      
      sc.close();
  }
}