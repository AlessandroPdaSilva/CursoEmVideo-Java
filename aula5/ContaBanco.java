package aula5;

public class ContaBanco {
    
    // var
    public int $numconta;
    protected String $tipo;
    private String $dono;
    private float $saldo;
    private boolean $status;

    // contrutor

    public ContaBanco(){
        this.$setSaldo(0);
        this.$setStatus(false);
    }

    // metodos

        public void estadoAtual(){
            
            System.out.print(" Conta: " + this.$getNumconta() + 
            "\n Dono: " + this.$getDono() + 
            "\n Tipo: " + this.$getTipo() + 
            "\n Saldo: " + this.$getSaldo() + 
            "\n Status: " + this.$getStatus());
        }

        public void abrirConta(String tipo){

            this.$setStatus(true);
            this.$setTipo(tipo);

            if(tipo == "cc"){
                this.$setSaldo(50);
            }else if(tipo == "cp"){
                this.$setSaldo(150);
            }
        }

        public void fecharConta(){

            if( $getSaldo() > 0){
                System.out.print(" Conta com dinheiro");
            }else if( $getSaldo() < 0){
                System.out.print(" Conta com debito");
            }else{
                this.$setStatus(false);
                System.out.print(" Conta fechada com sucesso");
            }
        }

        public void depositar(float valor){

            if($getStatus() == true){

                this.$setSaldo( $getSaldo() + valor);
                System.out.print("Valor de "+ valor + "reais depositado com sucesso");

            }else{

                System.out.print(" Nao e possivel depositar nessa conta");

            }

        }

        public void sacar(float valor){

            if($getStatus() == true){
                
                if($getSaldo() >= valor){
                    this.$setSaldo( $getSaldo() - valor);
                    System.out.print("Saque feito com sucesso");
                }else{
                    System.out.print(" Saldo insuficiente");
                }

            }

        }

        public void pagarMensal(){
            int v = 0;
            
            if($getTipo() == "cc"){
                v = 12;
            }else if($getTipo()  == "cp"){
                v = 20;
            }

            if(this.$getStatus()){

                this.$setSaldo( $getSaldo() - v);
                System.out.print(" Pagamento mensal efeturado ");
            }else{
                System.out.println(" Conta fechada ");
            }

        }



    // get e set
    public int $getNumconta() {
        return this.$numconta;
    }

    public void $setNumconta(int numconta) {
        this.$numconta = numconta;
    }

    public String $getTipo() {
        return this.$tipo;
    }

    public void $setTipo(String tipo) {
        this.$tipo = tipo;
    }

    public String $getDono() {
        return this.$dono;
    }

    public void $setDono(String dono) {
        this.$dono = dono;
    }

    public float $getSaldo() {
        return this.$saldo;
    }

    public void $setSaldo(float saldo) {
        this.$saldo = saldo;
    }

    public boolean $isStatus() {
        return this.$status;
    }

    public boolean $getStatus() {
        return this.$status;
    }

    public void $setStatus(boolean status) {
        this.$status = status;
    }



}
