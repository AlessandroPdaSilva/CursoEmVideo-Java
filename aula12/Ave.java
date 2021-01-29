package aula12;

public class Ave extends Animal {
    
  
    // var
    private String corPena;

    // contrutor

    public Ave(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }


    // metodos

    public void fazerNinho(){
        System.out.println(" fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.print("voando");
    }

    @Override
    public void alimentar() {
        System.out.print("comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.print("som de ave");
    }


    // get e set


    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }



}
