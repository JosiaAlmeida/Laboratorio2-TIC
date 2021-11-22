import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a diagonal maior e menor ");
    double lado = leitor.nextDouble();
    double Area = (lado * lado);
    System.out.println("Area do Losango: " + Area);
  }
}
