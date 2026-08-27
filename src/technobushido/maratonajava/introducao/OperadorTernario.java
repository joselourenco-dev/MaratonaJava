package technobushido.maratonajava.introducao;

public class OperadorTernario {
    static void main() {
        double salario = 400.0;
        String doar = "Irei doar";
        String naoDoar = "Não irei doar";
        String resultado = salario >= 500 ? doar : naoDoar;

        System.out.println(resultado);
    }
}
