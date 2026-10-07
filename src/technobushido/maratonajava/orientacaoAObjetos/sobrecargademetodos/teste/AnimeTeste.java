package technobushido.maratonajava.orientacaoAObjetos.sobrecargademetodos.teste;

import technobushido.maratonajava.orientacaoAObjetos.sobrecargademetodos.dominio.Anime;

public class AnimeTeste {
    static void main() {
        Anime anime = new Anime();
//        anime.init("One punch-man", "Ação", 12);
        anime.init("One punch-man", "TV", 12, "Ação");

        anime.imprime();
    }
}
