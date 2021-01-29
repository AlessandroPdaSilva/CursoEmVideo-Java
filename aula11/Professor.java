package aula11;

public class Professor {

    // var
    
    private String especialidade;
    private float salario;

    // construtor


    public Professor(String especialidade, float salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }


    // metodos 

        public void receberAum(float p){
            this.setSalario( getSalario() + p);
        }


    // get e set 


    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
