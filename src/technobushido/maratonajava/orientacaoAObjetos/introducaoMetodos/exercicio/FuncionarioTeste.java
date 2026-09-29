package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.exercicio;

public class FuncionarioTeste {
    static void main() {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Samurai";
        funcionario.idade = 25;
        funcionario.salarios = new int[]{2500, 1700, 1900};

        funcionario.imprimir();
        System.out.println("");
        funcionario.mediaSalarios();
    }
}
