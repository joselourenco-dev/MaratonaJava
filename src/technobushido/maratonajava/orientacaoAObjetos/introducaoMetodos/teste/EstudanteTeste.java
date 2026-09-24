package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.teste;

import technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.dominio.Estudante;
import technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
    static void main() {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();


        estudante01.nome = "Samurai";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Zoro";
        estudante02.idade = 31;
        estudante02.sexo = 'M';

        impressoraEstudante.imprime(estudante01);
        System.out.println("============");
        impressoraEstudante.imprime(estudante02);


    }
}
