package aula15;

public class Video implements AcoesVideo{
    
    // var 
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtida;
    private boolean reproduzindo;

    // contrutor


    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtida = 0;
        this.reproduzindo = false;
    }


    // metodos 

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }


    // to string


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", avaliacao='" + getAvaliacao() + "'" +
            ", views='" + getViews() + "'" +
            ", curtida='" + getCurtida() + "'" +
            ", reproduzindo='" + isReproduzindo() + "'" +
            "}";
    }


    // get e set 

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        float nova;
        nova = (this.avaliacao + avaliacao)/this.views;

        this.avaliacao = nova;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtida() {
        return this.curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    


}
