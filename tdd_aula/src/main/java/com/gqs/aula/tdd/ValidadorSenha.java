package com.gqs.aula.tdd;

public class ValidadorSenha {

    public String validar(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres";
        }

        return "";
    }
}