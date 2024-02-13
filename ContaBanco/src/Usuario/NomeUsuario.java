package Usuario;
import java.util.Locale;
import java.util.Scanner;

public class NomeUsuario {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    static String gravarNome;




    public     NomeUsuario (String nome, String sobrenome) {

        System.out.println("Qual seu nome?");
        nome = scanner.next();
        System.out.println("Qual seu sobrenome? ");
        sobrenome = scanner.next();

        this.gravarNome = nome + " " + sobrenome;


    }

    public  String getGravarNome(){
        return  gravarNome;
    }











}
