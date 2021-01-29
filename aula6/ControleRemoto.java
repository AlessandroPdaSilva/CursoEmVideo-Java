package aula6;

public class ControleRemoto implements Controlador {
    
    // var
    private int $volume;
    private boolean $ligado;
    private boolean $tocando;

    // contrutor

    public ControleRemoto(){
        this.$setVolume(0);
        this.$setLigado(false);
        this.$setTocando(false);
    }

    // metodos

    @Override
    public void ligar(){
        this.$setLigado(true);
    };
    @Override
    public void desligar(){
        this.$setLigado(false);
    };
    @Override
    public void abrirMenu(){

        System.out.println(" Esta ligado ?" + this.$getLigado());
        System.out.println(" Esta tocando ?" + this.$getTocando());

        System.out.println(" Volume "+ this.$getVolume()+"\n");
        for( int i = 0 ; i <= this.$getVolume(); i++){
            System.out.print("|");
        }

    };
    @Override
    public void fecharMenu(){
        System.out.println(" fechando menu");
    };
    @Override
    public void maisVolume(){

        if(this.$getLigado() == true){
            this.$setVolume( $getVolume() + 1 );
        }else{

            System.out.print(" Aparelho desligado");
        }

    };
    @Override
    public void menosVolume(){

        if(this.$getLigado() == true){
            this.$setVolume( $getVolume() - 1 );
        }else{
            System.out.print(" Aparelho desligado");
        }


    };
    @Override
    public void ligarMudo(){

        if(this.$getLigado() && this.$getVolume() > 0){
            this.$setVolume(0);
        }else{
            System.out.println(" Aparelho desligado");
        }
    };
    @Override
    public void desligarMudo(){
        if(this.$getLigado() && this.$getVolume() <=0){
            this.$setVolume(20);
        }else{
            System.out.println(" Aparelho desligado");
        }
    };
    @Override
    public void play(){

        if(this.$getLigado() && !(this.$getTocando()) ){
            this.$setTocando(true);
        }else{
            this.$setTocando(false);
        }

    };
    @Override
    public void pause(){

        if(this.$getLigado() && this.$getTocando() ){
            this.$setTocando(false);
        }else{
            this.$setTocando(true);
        }
    };

    // get e set
    public int $getVolume() {
        return this.$volume;
    }

    public void $setVolume(int volume) {
        this.$volume = volume;
    }

    public boolean $isLigado() {
        return this.$ligado;
    }

    public boolean $getLigado() {
        return this.$ligado;
    }

    public void $setLigado(boolean ligado) {
        this.$ligado = ligado;
    }

    public boolean $isTocando() {
        return this.$tocando;
    }

    public boolean $getTocando() {
        return this.$tocando;
    }

    public void $setTocando(boolean tocando) {
        this.$tocando = tocando;
    }

}
