package technobushido.maratonajava.introducao;

public class Arrays01 {
    public static void main (String[] args){
          //aula01
            int[] idades = new int[4];
            idades[0] = 21;
            idades[1] = 63;
            idades[2] = 45;
            idades[3] = 25;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        System.out.println(idades[3]);
        System.out.println();

        //aula 02

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Zoro";
        nomes[3] = "Gohan";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        System.out.println();

        //Aula 03
        int[] numeros = {1, 2, 3, 4};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("============");

        for(int num : numeros){
            System.out.println(num);
        }

    }
}
