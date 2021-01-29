package aula7;

public class Lutador implements ControladorLutador{

    // var
    private String $nome;
    private String $nacionalidade;
    private int $idade;
    private float $altura;
    private float $peso;
    private String $categoria;
    private int $vitoria;
    private int $derrota;
    private int $empates;

    // contrutor


    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso) {
        this.$nome = nome;
        this.$nacionalidade = nacionalidade;
        this.$idade = idade;
        this.$altura = altura;
        this.$peso = peso;
        
        
    }
    


    // metodos 
    @Override
    public void apresentar(){
        System.out.print("\n Nome :" + this.$getNome() +
        "\n Nacionalidade :" + this.$getNacionalidade() +
        "\n Idade :" + this.$getIdade() +
        "\n Altura :" + this.$getAltura() +
        "\n Peso :" + this.$getPeso() +
        "\n Categoria :" + this.$getCategoria() );
    }
    @Override
    public void status(){
        System.out.print("\n Nome :" + this.$getNome()+
        "\n Vitoria :" + this.$getVitoria()+
        "\n Derrota :" + this.$getDerrota()+
        "\n Empate :" + this.$getEmpates());
    }
    @Override
    public void ganharLuta(){
        this.$setVitoria( $getVitoria() + 1);
    }
    @Override
    public void perderLuta(){
        this.$setDerrota( $getDerrota() + 1);
    }
    @Override
    public void empatarLuta(){
        this.$setEmpates( $getEmpates() + 1);
    }




    // get e set
    public String $getNome() {
        return this.$nome;
    }

    public void $setNome(String nome) {
        this.$nome = nome;
    }

    public String $getNacionalidade() {
        return this.$nacionalidade;
    }

    public void $setNacionalidade(String nacionalidade) {
        this.$nacionalidade = nacionalidade;
    }

    public int $getIdade() {
        return this.$idade;
    }

    public void $setIdade(int idade) {
        this.$idade = idade;
    }

    public float $getAltura() {
        return this.$altura;
    }

    public void $setAltura(float altura) {
        this.$altura = altura;
    }

    public float $getPeso() {
        return this.$peso;
    }

    public void $setPeso(float peso) {
        this.$peso = peso;
    }

    public String $getCategoria() {
        return this.$categoria;
    }

    public void $setCategoria(String categoria) {
        
        if(this.$getPeso() < 52.2){
            categoria = "invalido";
        }else if(this.$getPeso() <= 70.3){
            categoria = "leve";
        }else if(this.$getPeso() <= 83.9){
            categoria = "medio";
        }else if(this.$getPeso() <= 120.2){
            categoria = "pesado";
        }else {
            categoria = "invalido";
        }

    }

    public int $getVitoria() {
        return this.$vitoria;
    }

    public void $setVitoria(int vitoria) {
        this.$vitoria = vitoria;
    }

    public int $getDerrota() {
        return this.$derrota;
    }

    public void $setDerrota(int derrota) {
        this.$derrota = derrota;
    }

    public int $getEmpates() {
        return this.$empates;
    }

    public void $setEmpates(int empates) {
        this.$empates = empates;
    }

}
