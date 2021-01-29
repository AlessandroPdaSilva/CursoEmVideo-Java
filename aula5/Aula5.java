package aula5;

public class Aula5 {
    
    public static void main( String[] args){

        ContaBanco conta1 = new ContaBanco();
        ContaBanco conta2 = new ContaBanco();

        conta1.$setDono("Davy Jones");
        conta1.$setNumconta(22222222);
        conta1.abrirConta("cc");
        conta1.depositar(100);

        conta1.estadoAtual();

        conta2.$setDono("Creusa");
        conta2.$setNumconta(3333333);
        conta2.abrirConta("cp");
        conta2.depositar(300);
        conta2.sacar(100);

        conta2.estadoAtual();

    }

}
