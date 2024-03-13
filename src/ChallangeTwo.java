import java.util.Scanner;

public class ChallangeTwo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
    int number = scanner.nextInt();
        
    boolean isFibonacci = isFibonacci(number);
    
    if (isFibonacci) {
      System.out.println(number + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println(number + " não pertence à sequência de Fibonacci.");
    }
    scanner.close();
  }
    
  public static boolean isFibonacci(int number) {
    int a = 0;
    int b = 1;
        
    while (a <= number) {
      if (a == number) {
          return true;
      }
      
      int temp = b;
      b = a + b;
      a = temp;
    }
        
    return false;
  }
}
