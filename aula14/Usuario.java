package aula14;

public class Usuario extends Pessoa{
    
    // var 
    private String login;
    private int totAssistido;


    // contrutor

    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome,idade,sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    // metodos

    public void viuMaisUm(){

    }



    // to string

    @Override
    public String toString() {
        return "{" + super.toString() +
            " login='" + getLogin() + "'" +
            ", totAssistido='" + getTotAssistido() + "'" +
            "}";
    }



    // get e set

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }


}
