package aula11;


public class Aluno extends Pessoa{
    
    // var

    private int matricula;
    private String curso;


    // contrutor

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    // metodos 

    public void pagarMens(){
        System.out.println("Pagando mensalidade de "+ this.getNome());
    }

    // get e set


    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
