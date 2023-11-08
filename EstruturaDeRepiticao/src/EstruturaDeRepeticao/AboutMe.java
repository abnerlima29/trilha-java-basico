package EstruturaDeRepeticao;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite o seu sobre nome");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura");
            double altura = scanner.nextDouble();


            System.out.println("Olá, me chamo " + nome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");

        }
        catch (InputMismatchException e){
            System.out.println("Os campos altura e idade precisam ser númericos");

        }
    }
}
