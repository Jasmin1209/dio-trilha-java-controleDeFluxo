import java.util.Scanner;

public class Contador {
    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o 1º Número: ");
        int NumeroUm = scanner.nextInt();
        System.out.println("Informe o 2º Número: ");
        int NumeroDois = scanner.nextInt();

        try{
            contar(NumeroUm, NumeroDois);
        }catch (ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("============");
        }
    }

    static void contar (int NumeroUm, int NumeroDois) throws ParametrosInvalidosException{
        if(NumeroUm > NumeroDois){
            throw new ParametrosInvalidosException( "O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = NumeroDois - NumeroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.printf("Imprimindo o número %s\n", i);
        }
    }
}
