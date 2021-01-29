package aula7;

import java.util.Random;

public class Luta {
    
    // var 
    private Lutador $lutador1;
    private Lutador $lutador2;
    private int $rounds;
    private boolean $aprovada;

    // metodos 

        public void marcarLuta(Lutador l1, Lutador l2){

            if( l1.$getCategoria().equals(l2.$getCategoria()) && l1 != l2 ){

                this.$setAprovada(true);
                this.$setLutador1(l1);
                this.$setLutador2(l2);
            }else{
                this.$setAprovada(false);
                this.$setLutador1(null);
                this.$setLutador2(null);
            }

        }

        public void lutar(){

            if( this.$getAprovada() ){

                System.out.println("******* Desafiante **********");
                this.$getLutador1().apresentar();

                System.out.println("******* Desafiado **********");
                this.$getLutador2().apresentar();

                Random random = new Random();
                int vencedor = random.nextInt(3);

                    switch(vencedor){
                        case 0:
                            System.out.println("Empate");
                            this.$lutador1.empatarLuta();
                            this.$lutador2.empatarLuta();
                        break;

                        case 1:
                            System.out.println($lutador1.$getNome() + " Ganhou");
                            this.$lutador1.ganharLuta();
                            this.$lutador2.perderLuta();
                        break;

                        case 2:
                            System.out.println($lutador2.$getNome() + " Ganhou");
                            this.$lutador1.perderLuta();
                            this.$lutador2.ganharLuta();
                        break;
                        
                    }


            }else {
                System.out.println("a luta nao pode acontecer");
            }
        }

    // get e set
    public Lutador $getLutador1() {
        return this.$lutador1;
    }

    public void $setLutador1(Lutador lutador1) {
        this.$lutador1 = lutador1;
    }

    public Lutador $getLutador2() {
        return this.$lutador2;
    }

    public void $setLutador2(Lutador lutador2) {
        this.$lutador2 = lutador2;
    }

    public int $getRounds() {
        return this.$rounds;
    }

    public void $setRounds(int rounds) {
        this.$rounds = rounds;
    }

    public boolean $isAprovada() {
        return this.$aprovada;
    }

    public boolean $getAprovada() {
        return this.$aprovada;
    }

    public void $setAprovada(boolean aprovada) {
        this.$aprovada = aprovada;
    }

}
