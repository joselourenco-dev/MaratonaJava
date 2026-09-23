package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.teste;

import technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        System.out.println("finalizando calculadora");
        calculadora.subtrai();

    }
}
