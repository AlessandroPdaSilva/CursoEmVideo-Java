package aula12;

public class Mamifero extends Animal{
    
    // var 
    private String corPelo;

    // contrutor 

    public Mamifero(float peso, int idade, int membros,String corPelo){
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    // metodos

        @Override
        public void locomover() {
            System.out.print(" andando");
        }

        @Override
        public void alimentar() {
            System.out.print(" mamando");
        }

        @Override
        public void emitirSom() {
            System.out.print(" som de mamifero");
        }


    // get e set

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


}
