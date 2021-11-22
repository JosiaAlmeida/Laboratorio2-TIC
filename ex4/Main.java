import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite 2 valores");
    double num1 = leitor.nextDouble();
    double num2 = leitor.nextDouble();
    double div = num2 > 0 ? num1 / num2 : 0;
    System.out.println("Resultado " + div);
  }
}
