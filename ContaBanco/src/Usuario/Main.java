package Usuario;

import Usuario.NomeUsuario;



public class Main {
    public static void main(String[] args) {

        NomeUsuario usuario = new NomeUsuario();
        Conta conta =new Conta();

        System.out.println("Seja bem vindo, " + usuario.setGravarNome("","" +"!"));
        System.out.println("sua conta é " + conta.setGravarConta(2) +" e Sua agência é " + conta.setGravarAgencia(2));



    }
}