package aula8;

public class Pessoa{

    // var

    private String $nome;
    private int $idade;
    private String $sexo;


    // contrutor


    public Pessoa(String nome, int idade, String sexo) {
        this.$setNome(nome);
        this.$setIdade(idade);
        this.$setSexo(sexo);
    }



    // metodos

        public void fazerAniversario(){

            this.$setIdade( $getIdade() + 1 );

        }

    // get e set

    public String $getNome() {
        return this.$nome;
    }

    public void $setNome(String nome) {
        this.$nome = nome;
    }

    public int $getIdade() {
        return this.$idade;
    }

    public void $setIdade(int idade) {
        this.$idade = idade;
    }

    public String $getSexo() {
        return this.$sexo;
    }

    public void $setSexo(String sexo) {
        this.$sexo = sexo;
    }


    

}