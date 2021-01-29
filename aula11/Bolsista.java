package aula11;

public class Bolsista extends Aluno {
    
    // var
    private float bolsa;


    // contrutor

    public Bolsista(String nome, int idade, String sexo ,float bolsa) {
        super(nome, idade, sexo);
        this.bolsa = bolsa;
    }


    // metodos 

        public void renovarBolsa(){
            System.out.print(" Renovando bolsa de "+ this.getNome());
        }

        @Override
        public void pagarMens() {
            System.out.print(this.getNome() +" é Bolsista , Pagamento facilitado");
        }


    // get e set 
    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


}
