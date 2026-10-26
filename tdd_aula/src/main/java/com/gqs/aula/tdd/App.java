
package com.gqs.aula.tdd;

public class App {

    public static void main(String[] args) {

        /*System.out.println( "Hello World!" );*/

        ValidadorSenha validador = new ValidadorSenha();

        ResultadoValidacao resultado = validador.validar("mypass");

        System.out.println("Senha: mypass");
        System.out.println();

        if (resultado.isValido()) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");
            System.out.println("Erros:");

            for (String erro : resultado.getErros()) {
                System.out.println("- " + erro);
            }
        }
    }
}