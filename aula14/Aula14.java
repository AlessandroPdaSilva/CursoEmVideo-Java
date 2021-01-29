package aula14;

public class Aula14 {
    
    public static void main( String[] args){

        Video video[] = new Video[3];

        video[1] = new Video(" Curso em video PHP");

        System.out.println(video[1].toString());


        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("maria",40,"f","maju");
        usuario[1] = new Usuario("joao",30,"m","jp");

        System.out.println(usuario[0].toString());
    }

}
