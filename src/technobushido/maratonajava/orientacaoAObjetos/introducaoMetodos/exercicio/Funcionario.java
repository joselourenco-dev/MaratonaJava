package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.exercicio;

public class Funcionario {
    public String nome;
    public int idade;
    public int[] salarios;

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salarios: ");
        for (int salario: salarios){
            System.out.println(salario);
        }
    }

    public void mediaSalarios(){
        int soma = 0;
        for (int salario: salarios){
            soma += salario;
        }
        int media =  soma / salarios.length;

        System.out.println("Média salarial: " + media);
    }

}
