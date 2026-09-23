package technobushido.maratonajava.orientacaoAObjetos.introducaoClasses.teste;

import technobushido.maratonajava.orientacaoAObjetos.introducaoClasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.nome = "volkswagen";
        carro.modelo = "Gol";
        carro.ano = 2020;

        Carro carro2 = new Carro();
        carro2.nome = "Fusca";
        carro2.modelo = "Black";
        carro2.ano = 2030;

        carro  = carro2;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
