package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.teste;

import technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divide(10.0, 5.0);
        System.out.println(resultado);
    }
}
