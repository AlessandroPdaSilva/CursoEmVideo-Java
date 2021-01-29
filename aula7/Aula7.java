package aula7;

public class Aula7{
    
    public static void main(String[] args){
        Lutador lutador1 = new Lutador("putscript","brasileira",26,1.7f,80.0f);
        // nome,nacionalidade,idade,altura,peso

        
        Lutador lutador2 = new Lutador("dead code","canadense",26,1.7f,80.0f);
        // nome,nacionalidade,idade,altura,peso

        lutador1.apresentar();
        lutador2.apresentar();

        // Luta luta12 = new Luta();

        // luta12.marcarLuta(lutador1, lutador2);
        
         

    }

}
