
package com.gqs.aula.tdd;

public class ValidadorSenha {

    public String validar(String senha) {
        String erros = "";

        if (senha.length() < 8) {
            erros += "A senha deve ter pelo menos 8 caracteres\n";
        }

        int quantidadeDigitos = 0;
        boolean temLetraMaiuscula = false;
        boolean temCaractereEspecial = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                quantidadeDigitos++;
            }

            if (Character.isUpperCase(caractere)) {
                temLetraMaiuscula = true;
            }

            if (!Character.isLetterOrDigit(caractere)) {
                temCaractereEspecial = true;
            }
        }

        if (quantidadeDigitos < 2) {
            erros += "A senha deve conter pelo menos 2 dígitos\n";
        }

        if (!temLetraMaiuscula) {
            erros += "A senha deve conter pelo menos uma letra maiuscula\n";
        }

        if (!temCaractereEspecial) {
            erros += "A senha deve conter pelo menos um caractere especial\n";
        }

        return erros;
    }
}
