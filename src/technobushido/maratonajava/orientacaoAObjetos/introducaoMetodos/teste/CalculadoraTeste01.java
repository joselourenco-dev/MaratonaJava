package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.teste;

import technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();

        calculadora.subtrai();
        calculadora.multiplica(10, 10);
        System.out.println("finalizando calculadora");
    }
}
