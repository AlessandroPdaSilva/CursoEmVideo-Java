package aula10;

public class Aula10 {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa("Jonathan", 22 , "m");
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Funcionario f1 = new Funcionario();

        p1.fazerAniv();

        a1.setNome("maria");
        pr1.setNome("bia");
        f1.setNome("marcos");

        a1.setCurso("informatica");
        pr1.setSalario(2500);
        f1.setSetor("estoque");


    }
}
