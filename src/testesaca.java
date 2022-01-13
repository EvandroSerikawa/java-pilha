public class testesaca {
    public static void main(String[] args) {

        conta novaConta = new contacorrente( 12592, 52695 );

        novaConta.deposita(200);
        try {
            novaConta.saca(190);
        }catch(saldoinsulficienteException exception) {
            System.out.println("Ex: " + exception.getMessage());
        }
        System.out.println(novaConta.getSaldo());
    }

}
