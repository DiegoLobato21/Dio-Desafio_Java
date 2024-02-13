package Usuario;

import Usuario.NomeUsuario;



public class Main {
    public static void main(String[] args) {

        NomeUsuario usuario = new NomeUsuario("","");

        System.out.println("Seja bem vindo, " + usuario.getGravarNome()+ "!");



    }
}