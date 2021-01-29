package aula12;

public class Aula12 {

    public static void main(String[] args){

        Mamifero m = new Mamifero(20,3,4,"amarelo");
        Peixe p = new Peixe(2, 1, 0);

        p.locomover();
        m.locomover();


    }

}
