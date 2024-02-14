package Usuario;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Conta {
    static Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

    static Random aleatorio =new Random();

    private double gravarConta;

    private double gravarAgencia;



    public double setGravarConta (double conta ) {
         conta = aleatorio.nextInt(500)*10;

         this.gravarConta= conta ;

         return this.gravarConta;
    }

    public double setGravarAgencia (double agencia){
        agencia = aleatorio.nextDouble(500)*10;
        this.gravarAgencia = agencia;
        return this.gravarAgencia;
    }


}
