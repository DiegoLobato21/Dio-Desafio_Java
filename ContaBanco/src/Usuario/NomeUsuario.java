package Usuario;
import java.util.Locale;
import java.util.Scanner;

public class NomeUsuario {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private String nome;
    private String sobrenome;

    private String BoaVinda;


    public  String gravarNome(String nome) {
        this.nome = nome;
        System.out.println("Qual seu nome?");
        nome = scanner.next();
        return nome;

    }

    public  String gravarSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        System.out.println("Qual seu sobrenome? ");
        sobrenome = scanner.next();
        return sobrenome;
    }

    public String BoaVinda (String boasvindas){
        this.BoaVinda = boasvindas;
        System.out.println("Seja bem vindo" + gravarNome(nome) + gravarSobrenome(sobrenome));


        return  boasvindas ;
    }



}
