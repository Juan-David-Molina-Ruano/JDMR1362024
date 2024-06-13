package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasJDMRTest {

    @Test
    public void testCalcularRaizCuadrada(){

        OperacionesMatematicasJDMR operacionesMatematicasJDMR = new OperacionesMatematicasJDMR();

        //AsserEquals con positivo
        double resultPo = operacionesMatematicasJDMR.calcularRaizCuadrada(4);
        assertEquals(2,resultPo);

        //assertTrue con positivo
        assertTrue(resultPo == 2);


        //AsserEquals con cero
        double resultCe = operacionesMatematicasJDMR.calcularRaizCuadrada(0);
        assertEquals(Math.sqrt(0),resultCe);
        //assertTrue con cero
        assertTrue(resultCe == 0);

        try{
            //AsserEquals con cero
            double resultNe = operacionesMatematicasJDMR.calcularRaizCuadrada(-3);
            assertEquals(Math.sqrt(-3),resultNe);

            assertTrue(resultNe != 0);

        }catch (ArithmeticException e){
            System.out.println("Ocurrio un error " + e);
        }


    }
}