package aula8;

public class Livro implements Publicação{

    // var

    private String $titulo;
    private String $autor;
    private int $totPaginas;
    private int $pagAtual;
    private boolean $aberto;
    private Pessoa $leitor;


    // contrutor 


    public Livro(String $titulo, String $autor, int $totPaginas, Pessoa $leitor) {
        this.$titulo = $titulo;
        this.$autor = $autor;
        this.$totPaginas = $totPaginas;
        this.$pagAtual = 0;
        this.$aberto = false;
        this.$leitor = $leitor;
    }


    // metodos


        public void detalhes(){

            System.out.println("Titulo : "+ this.$gettitulo() +
            "\n Autor : "+ this.$getautor() +
            "\n Total de Paginas : "+ this.$gettotPaginas() + 
            "\n Leitor : "+ this.$leitor.$getNome() );
            

        }

        @Override
        public void abrir(){
            this.$setaberto(true);
        };
        @Override
        public void fechar(){
            this.$setaberto(false);
        };
        @Override
        public void folhear(int p){

            if(p > this.$totPaginas){
                this.$pagAtual = 0;
            }else{
                this.$setpagAtual(p);
            }
            
        };
        @Override
        public void avancarPag(){
            this.$setpagAtual( $getpagAtual() + 1);
        };
        @Override
        public void voltarPag(){
            this.$setpagAtual( $getpagAtual() - 1);
        };

    // get e set


    public String $gettitulo() {
        return this.$titulo;
    }

    public void $settitulo(String $titulo) {
        this.$titulo = $titulo;
    }

    public String $getautor() {
        return this.$autor;
    }

    public void $setautor(String $autor) {
        this.$autor = $autor;
    }

    public int $gettotPaginas() {
        return this.$totPaginas;
    }

    public void $settotPaginas(int $totPaginas) {
        this.$totPaginas = $totPaginas;
    }

    public int $getpagAtual() {
        return this.$pagAtual;
    }

    public void $setpagAtual(int $pagAtual) {
        this.$pagAtual = $pagAtual;
    }

    public boolean $isaberto() {
        return this.$aberto;
    }

    public boolean $getaberto() {
        return this.$aberto;
    }

    public void $setaberto(boolean $aberto) {
        this.$aberto = $aberto;
    }

    public Pessoa $getleitor() {
        return this.$leitor;
    }

    public void $setleitor(Pessoa $leitor) {
        this.$leitor = $leitor;
    }


}