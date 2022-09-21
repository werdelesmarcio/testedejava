import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String nome = "Werdeles";

        System.out.println("Hello, " + nome + ".");

        int a;
        int b = 2;
        a = 5;
        int soma = a + b;

        System.out.println(soma);

        boolean res = false;

        System.out.println(res);

        boolean fds = true;
        boolean sol = true;
        boolean praia = sol && fds;

        System.out.println(praia);
        String mensagem = fds ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

        int nota = 100;

        if (nota >= 70){
            System.out.println("Aluno não precisa fazer a prova.");
        } else{
            System.out.println("Aluno precisa fazer a prova.");
        }

        String graduacao;

        if(nota >= 70){
            graduacao = "A";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "B";
        } else if (nota < 60 && nota >= 50) {
            graduacao = "C";
        } else {
            graduacao = "";
        }

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado.");
                break;
            case "C":
                System.out.println("Aluno em recuperação.");
                break;
            default:
                System.out.println("Aluno reprovado.");
                break;
        }

        String nome2 = "Werdeles";

        LocalDate hoje = LocalDate.now();

        System.out.println(nome.toUpperCase());

        Locale brasil = new Locale("pt","BR");

        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
    }
}