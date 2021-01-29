package aula12;

public class Reptil extends Animal{
  

    // var
    private String corEscama;

    // contrutor
  
    public Reptil(float peso, int idade, int membros , String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

        // metodos

        @Override
        public void locomover() {
            System.out.print("rastejando");
        }

        @Override
        public void alimentar() {
            System.out.print("comendo vejetais");
        }

        @Override
        public void emitirSom() {
            System.out.print("som de reptil");
        }





    // get e set


    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
