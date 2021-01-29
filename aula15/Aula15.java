package aula15;

public class Aula15 {
    
    public static void main( String[] args){

        // video
        Video video[] = new Video[3];

        video[1] = new Video(" Curso em video PHP");

        //System.out.println(video[1].toString());

        // usuario
        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("maria",40,"f","maju");
        usuario[1] = new Usuario("joao",30,"m","jp");

        //System.out.println(usuario[0].toString());


        // visualizacao
        Visualizacao visualizacao1 = new Visualizacao(usuario[0], video[1]);

        visualizacao1.avaliar(9);
        visualizacao1.detalhes();

    }

}
