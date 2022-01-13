public class fluxo2{

    public static void main(String[] args) {

        System.out.println("Ini do main");
    try{
        metodo1();
    }catch ( ArithmeticException | NullPointerException | minhaException exception){
        String msg = exception.getMessage();
        System.out.println( "Exception" + msg );
        exception.printStackTrace();
    }
        System.out.println("Fim do main");
    }
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            int a = i /0;
//          Exemplo02
//            conta testeConta = null; // Exemplo02
//            testeConta.deposita();
//        }

//        ArithmeticException exception = new ArithmeticException(" Deu ruim ");
//        throw exception;
//        Normalmente usado da forma abaixo.
          throw new minhaException (" Deu muito ruim ");


        //System.out.println("Fim do metodo2");
    }
}
