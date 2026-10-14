package technobushido.maratonajava.orientacaoAObjetos.modificadorstatico.teste;

import technobushido.maratonajava.orientacaoAObjetos.modificadorstatico.dominio.Carro;

public class CarroTeste {
    static void main() {
        Carro c1 = new Carro("BMW", 150);
        Carro c2 = new Carro("Gol", 160);
        Carro c3 = new Carro("Uno", 180);


        Carro.velocidadeLimite = 190;
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
