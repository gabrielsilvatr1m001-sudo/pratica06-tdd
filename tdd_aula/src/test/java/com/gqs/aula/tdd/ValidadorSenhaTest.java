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

@Test
public void deveRejeitarSenhaComMenosDe2Digitos() {
    ValidadorSenha validador = new ValidadorSenha();

    String resultado = validador.validar("abcdefgh");

    assertTrue(resultado.contains("A senha deve conter pelo menos 2 dígitos"));
}

@Test
public void deveRejeitarSenhaSemLetraMaiuscula() {
    ValidadorSenha validador = new ValidadorSenha();

    String resultado = validador.validar("abcdefgh12");

    assertTrue(resultado.contains("A senha deve conter pelo menos uma letra maiuscula"));
}

@Test
public void deveRejeitarSenhaSemCaractereEspecial() {
    ValidadorSenha validador = new ValidadorSenha();

    String resultado = validador.validar("Abcdef12");

    assertTrue(resultado.contains("A senha deve conter pelo menos um caractere especial"));
}

@Test
public void deveRetornarTodosOsErrosQuandoSenhaForInvalida() {
    ValidadorSenha validador = new ValidadorSenha();

    String resultado = validador.validar("mypass");

    assertTrue(resultado.contains("A senha deve ter pelo menos 8 caracteres"));
    assertTrue(resultado.contains("A senha deve conter pelo menos 2 dígitos"));
    assertTrue(resultado.contains("A senha deve conter pelo menos uma letra maiuscula"));
    assertTrue(resultado.contains("A senha deve conter pelo menos um caractere especial"));
}

}