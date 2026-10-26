package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidadorSenhaTest {

@Test
public void deveRejeitarSenhaComMenosDe8Caracteres() {
    ValidadorSenha validador = new ValidadorSenha();

    String resultado = validador.validar("abc123");

    assertTrue(resultado.contains("A senha deve ter pelo menos 8 caracteres"));
}

}