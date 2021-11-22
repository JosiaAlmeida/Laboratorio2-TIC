import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a base maior e menor ");
    double bmaior = leitor.nextDouble();
    double bmenor = leitor.nextDouble();

    System.out.println("Digite a altura ");
    double altura = leitor.nextDouble();

    double AreaTrapezio = ((bmaior * bmenor) * altura) / 2;
    System.out.println("Area do Losango: " + AreaTrapezio);
  }
}
