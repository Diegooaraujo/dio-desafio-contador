import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o primeiro parametro: ");
       int parametroUm = sc.nextInt();
       System.out.println("Digite o segundo parametro: ");
       int parametroDois = sc.nextInt();
       sc.close();

       try{
              contador(parametroUm, parametroDois);


       }catch(ParametrosInvalidosException e){
        System.out.println("erro: " + e.getMessage());

       }

      
    }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
       if(parametroUm > parametroDois){
           throw new ParametrosInvalidosException("O primeiro parametro deve ser menor que o segundo parametro");
       }
       int contagem = parametroDois - parametroUm;
         for(int i = 1; i <= contagem; i++){
              System.out.println(parametroUm + i);
         }
    }
}
