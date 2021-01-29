package aula10;

public class Pessoa {
    
    // var
    private String nome;
    private int idade;
    private String sexo;


    // metodos

    public void fazerAniv(){

        this.setIdade( getIdade() + 1);

    }

    // contrutor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    // get e set

    public Pessoa() {
	}

	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", sexo='" + getSexo() + "'" +
            "}";
    }


}
