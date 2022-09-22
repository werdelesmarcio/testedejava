import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
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

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println(j + "x" + i + "=" + j * i);
            }
        }

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        String[] letras = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(numeros));

        int[] nums = {8, 6, 52, 12, 100};

        int maior = nums[0], menor = nums[0], media = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > maior){
                maior = nums[i];
            }
            if (nums[i] < menor){
                menor = nums[i];
            }
            media += nums[i];
        }

        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
        System.out.println("Media " + media / nums.length);

        int resultado = soma(2,6);

        System.out.println(resultado);

    }

    public static int soma(int a, int b){
        return a + b;
    }
}

