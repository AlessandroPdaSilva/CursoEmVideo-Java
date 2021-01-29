package aula4;

public class Caneta {
    // var 
    public String $modelo;
    private float $ponta;
    private boolean $tampada;


    // contrutor

    public Caneta(String m,float p){
        this.$setModelo(m);
        this.$setPonta(p);
        this.tampar();
    }

    // metodos

        public void status(){
            System.out.println("STATUS");
            System.out.print(" Modelo:"+ this.$getModelo() +"\n  Ponta: " + this.$getPonta() +
            " \n Tampada : " + this.$getTampada());
        }

        public void tampar(){
            this.$tampada = true;
        }

        public void destampar(){
            this.$tampada = false;
        }


    // get e set
    public String $getModelo(){
        return this.$modelo;
    }

    public void $setModelo(String m){
        this.$modelo = m;
    }

    public float $getPonta(){
        return this.$ponta;
    }

    public void $setPonta(float p){
        this.$ponta = p;
    }

    public boolean $getTampada(){
        return this.$tampada;
    }

    public void $setTampada(float t){
        this.$ponta = t;
    }


}
