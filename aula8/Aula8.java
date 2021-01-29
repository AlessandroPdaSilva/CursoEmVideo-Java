package aula8;

public class Aula8 {
    
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("pedro",15,"m");// nome,idade,sexo
        Livro[] livro = new Livro[1];// titulo,autor,total de paginas, leitor

        livro[0] = new Livro("harry", "jones autor", 500, pessoa1);

        livro[0].folhear(400);
        livro[0].detalhes();

    }

}
