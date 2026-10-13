package technobushido.maratonajava.orientacaoAObjetos.construtores.teste;

import technobushido.maratonajava.orientacaoAObjetos.construtores.dominio.Anime;

public class AnimeTeste {
    static void main() {
        Anime anime = new Anime("One punch-man", "TV", 12, "Ação");
        Anime anime2 = new Anime("One punch-man", "TV", 12, "Ação", "Mon Huay");

        anime.imprime();
        System.out.println("");
        anime2.imprime();
    }
}
