package com.gqs.aula.tdd;

public class ValidadorSenha {

    public String validar(String senha) {

        if (senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres";
        }

        int quantidadeDigitos = 0;
        boolean temLetraMaiuscula = false;

        for (char caractere : senha.toCharArray()) {

            if (Character.isDigit(caractere)) {
                quantidadeDigitos++;
            }

            if (Character.isUpperCase(caractere)) {
                temLetraMaiuscula = true;
            }
        }

        if (quantidadeDigitos < 2) {
            return "A senha deve conter pelo menos 2 dígitos";
        }

        if (!temLetraMaiuscula) {
            return "A senha deve conter pelo menos uma letra maiuscula";
        }

        return "";
    }
}
