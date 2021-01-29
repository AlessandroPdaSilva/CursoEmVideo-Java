package aula10;

public class Funcionario extends Pessoa{

    // var
    private String setor;
    private boolean trabalhando;

    // metodos

    public void mudaTrabalho(){
        this.trabalhando = !this.trabalhando;
    }

    // get e set


    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return this.trabalhando;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


}
