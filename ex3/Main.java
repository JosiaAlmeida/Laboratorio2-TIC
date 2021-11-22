import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite 3 valores");
    int num1 = leitor.nextInt();
    int num2 = leitor.nextInt();
    int num3 = leitor.nextInt();
    int mult = num1 * num2 * num3;
    System.out.println("Resultado " + mult);
  }
}
