package technobushido.maratonajava.orientacaoAObjetos.introducaoMetodos.dominio;

public class Calculadora {
    public void soma(){
        System.out.println(10 + 30);
    }

    public void subtrai(){
        System.out.println(20-15);
    }

    public void multiplica(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divide(double num1, double num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }

        return num1 / num2;
    }

}
