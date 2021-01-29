package aula11;

public class Tecnico extends Aluno{

    // var
    private int registroProf;

    // contrutor

    public Tecnico(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    // metodos 

        public void praticar(){
            System.out.print("estou praticando");
        }

        @Override
        public void pagarMens(){
            System.out.print( this.getNome() + " e tecnico , entao, possui mensalidade diferente ");
        }
    // get e set

    public int getRegistroProf() {
        return this.registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }


}
