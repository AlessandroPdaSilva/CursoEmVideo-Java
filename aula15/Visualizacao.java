package aula15;

public class Visualizacao {
    
    // var
    private Usuario espectador;
    private Video filme;

    // contrutor

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido( this.espectador.getTotAssistido()+ 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // metodos

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(float nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(int porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 80){
            tot = 8;
        }else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }
    
    // to string

    
    public void detalhes(){
        System.out.println("{" +
        " \n espectador='" + this.espectador.toString() + "'" +
        ", \n filme='" + this.filme.toString() + "'" +
        "}");
    }

    // get e set 

    public Usuario getEspectador() {
        return this.espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }


}
