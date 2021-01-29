package Aula2;

public class Caneta {
    
    // var
    public String $modelo;
    public String $cor;
    public int $carga;
    private boolean $tampada;


    
    // metodos

    public  void status(){
        System.out.print("STATUS \n Modelo: " + this.$modelo +
        "\n Cor: " + this.$cor +" \n Carga: " + this.$carga);

        System.out.println("esta tampada? "+ this.$tampada);
    }

    public void rabiscar(){

        if(this.$tampada == false){
            System.out.print("Estou rabiscando");
        }else{
            System.out.print("...");
        }

    }

    protected void tampar(){
        this.$tampada = true;
    }

    protected void destampar(){
        this.$tampada = false;
    }




}
