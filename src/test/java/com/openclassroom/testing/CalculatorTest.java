package com.openclassroom.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAddTwoPositiveNumbers() {
        //1) Arrange   étape pour déclarer variables objects
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        //2) Act      Utiliser méthode de l'objet déclaré précédemment
        int somme = calculator.add(a, b);

        //3) Assert   confirmation (expected, result)
        assertEquals(5, somme);
    }

    @Test
    void testMultiplicationOfTwoNumbers() {
        //arrange
        int a = 2;
        int b = 3;
        Multiplication multiplication = new Multiplication();

        //act
        int result = multiplication.calcul(a, b);

        //assert
        assertEquals(6, result);

    }

}
