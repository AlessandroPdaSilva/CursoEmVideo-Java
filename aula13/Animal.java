package aula13;

public class Animal {
    
    // var
    public float peso;
    public int idade;
    public int membros;

    // metodos 

    public void emitirSom(){
        System.out.print("Som de Animal");
    }


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
