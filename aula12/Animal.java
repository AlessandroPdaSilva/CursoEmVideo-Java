package aula12;

public abstract class Animal {

    // var

    protected float peso;
    protected int idade;
    protected int membros;

    // contrutor

    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }



    // metodos

    public void locomover(){
        System.out.print(" animal se locomovendo");
    };
    public void alimentar(){
        System.out.print(" animal se alimentando");
    };
    public void emitirSom(){
        System.out.print(" animal se emitindo som");
    };



    // get e set 

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}
