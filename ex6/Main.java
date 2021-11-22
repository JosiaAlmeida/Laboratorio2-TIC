import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a sua nota e o peso da nota");
    float num1 = leitor.nextFloat();
    float peso1 = leitor.nextFloat();

    System.out.println("Digite a sua nota e o peso da nota");
    float num2 = leitor.nextFloat();
    float peso2 = leitor.nextFloat();

    System.out.println("Digite a sua nota e o peso da nota");
    float num3 = leitor.nextFloat();
    float peso3 = leitor.nextFloat();

    float med =
      (num1 * (peso1 / 100) + num2 * (peso2 / 100) + num3 * (peso3 / 100)) /
      (peso1 / 100) +
      (peso2 / 100) +
      (peso3 / 100);
    System.out.println("Media ponderada " + med);
  }
}
