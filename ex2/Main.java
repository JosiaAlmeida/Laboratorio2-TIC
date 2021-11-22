import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite 4 calores");
    int num1 = leitor.nextInt();
    int num2 = leitor.nextInt();
    int sub = num1 - num2;
    System.out.println("Resultado " + sub);
  }
}
