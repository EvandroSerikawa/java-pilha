public class contacorrente extends conta {

    public contacorrente( int agencia , int conta ) {

    }

    @Override
    public void deposita(double valor) {
    }

    @Override
    public void saca(double valor) {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }
}
