public abstract class conta{

    protected double saldo;
    private int agencia;
    private int conta;
    private cliente titular;
    //private static int total = 0;

    public conta (){

    }

    public conta( int agencia , int conta ){
        //conta.total ++;
        //System.out.println("O total de contas abertas é: " + conta.total);
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 100;
        System.out.println("Seguem os dados da nova conta criada: " + this.agencia + this.conta );
    }

        public abstract void deposita( double valor );

        public void saca  ( double valor ){ // ex: qndo extends do Exception   public void saca throws saldoinsulficienteException
            if( this.saldo < valor ){
                throw new saldoinsulficienteException("Saldo: "+ this.saldo + ",valorr: "+ valor);

            }
        }

        public void transfere(double valor , conta destino ){
                this.saca( valor );
                destino.deposita( valor );
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public cliente getTitular() {
        return titular;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

//    public static int getTotal() {
//        return total;
//    }
//
//    public static void setTotal(int total) {
//        conta.total = total;
//    }

}