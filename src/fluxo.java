public class fluxo {

    public static void main(String[] args) {

        System.out.println("Ini do main");
        // o try pode ser colocado antes do método 1
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        // O try pode ser colocado antes do método 2
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {

//              Exemplo01
                try{   // Tenta executar o código do parâmetro
                    int a = i/0;
                } catch ( ArithmeticException exception ){ // Caso tenha algum erro executa o catch
                    String msg = exception.getMessage(); // Toda exceção é uma classe
                    System.out.println("ArithmeticException" + msg );
                    exception.printStackTrace(); // Imprime o caminho da trilha
                } catch ( NullPointerException exception2 ){
                    String msg2 = exception2.getMessage();
                    System.out.println("NullpointerException" + msg2 );
                    exception2.printStackTrace(); // Imprime o caminho da trilha

                }
            System.out.println(i);

//          Exemplo02
//            conta testeConta = null; // Exemplo02
//            testeConta.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
