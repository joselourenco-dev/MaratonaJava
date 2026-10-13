package technobushido.maratonajava.orientacaoAObjetos.blocodeinicializacao.teste;

import technobushido.maratonajava.orientacaoAObjetos.blocodeinicializacao.dominio.Anime;

public class AnimeTeste {
    static void main() {
        Anime anime = new Anime("One piece");
        System.out.println("");

        for (int epsodio : anime.getEpsodios()) {
            System.out.print(epsodio + " ");
        }


    }
}
