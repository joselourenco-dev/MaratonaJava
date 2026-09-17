package technobushido.maratonajava.introducao;

public class Arrays02 {
 public static void main(String[] args){

     //aula01
     int[][] mesDia = new int[3][2];
     mesDia[0][0] = 1;
     mesDia[0][1] = 31;

     mesDia[1][0] = 2;
     mesDia[1][1] = 28;

     mesDia[2][0] = 3;
     mesDia[2][1] = 28;



     for (int i = 0; i < mesDia.length; i++) {
         for (int j = 0; j < mesDia[i].length; j++) {
             System.out.println(mesDia[i][j]);
         }
     }

     System.out.println("==============");

     for (int[] diaBase : mesDia){
         for (int dia : diaBase){
             System.out.println(dia);
         }
     }

     //aula02
     int[][] arrayInt = new int[3][];

     arrayInt[0] = new int[2];
     arrayInt[1] = new int[3];
     arrayInt[2] = new int[6];

     for (int[] arrayBase : arrayInt){
         System.out.println("\n");
         for (int num : arrayBase){
             System.out.print(num + "  ");
         }
     }

 }
}
