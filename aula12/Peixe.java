package aula12;

public class Peixe extends Animal{
    
   

    // var
    private String corEscama;


    // contrutor

    public Peixe(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }


    
    // metodos

        public void soltarBolha(){
            System.out.print(" soltando Bolha");
        }

        @Override
        public void locomover() {
            System.out.print("nadando ");
        }

        @Override
        public void alimentar() {
            System.out.print("comendo substancia");
        }

        @Override
        public void emitirSom() {
            System.out.print(" peixe nao faz som");
        }


    // get e set


    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
