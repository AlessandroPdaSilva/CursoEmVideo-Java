package aula13;

public class Cachorro extends Lobo{
 
    // metodos
    @Override
    public void emitirSom() {
        System.out.print(" auu auu auu");
    }

    public void reagir( String frase){

        if( frase == "toma comida" || frase == "ola"){
            System.out.print("abanar e latir");
        }else{
            System.out.println(" rosnar");
        }

    }

    public void reagir( int hora, int min){

        if(hora < 12){
            System.out.println("abanar");
        }else if(hora >= 18){
            System.out.print(" ignorar");
        }else{
            System.out.print("abanar e latir");
        }

    }

    public void reagir( boolean dono){

        if( dono == true){
            System.out.print(" abanar");
        }else{
            System.out.print("rosnar e latir");
        }
    }

    public void reagir( int idade, float peso){

        if(idade < 5){

            if(peso < 10){
                System.out.println(" abanar");
            }else{
                System.out.println("latir");
            }

        }else{

            if(peso < 10){
                System.out.println(" rosnar");
            }else{
                System.out.println("ignorar");
            }

        }

    }
}
