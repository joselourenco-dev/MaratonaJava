package technobushido.maratonajava.orientacaoAObjetos.introducaoClasses.teste;

import technobushido.maratonajava.orientacaoAObjetos.introducaoClasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.nome = "volkswagen";
        carro.modelo = "Gol";
        carro.ano = 2020;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
    }
}
