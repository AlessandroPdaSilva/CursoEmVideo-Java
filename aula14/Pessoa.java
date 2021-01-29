package aula14;

public abstract class Pessoa {

    // var
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    // contrutor 


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    

    // metodos 

        protected void ganharExp(){

        }


    // to string 


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", experiencia='" + getExperiencia() + "'" +
            "}";
    }



    // get e set


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

    public float getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }


}
