package technobushido.maratonajava.orientacaoAObjetos.blocodeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] epsodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.epsodios) {
            System.out.print(episodio + " ");
        }
    }


    public int[] getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int[] epsodios) {
        this.epsodios = epsodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
