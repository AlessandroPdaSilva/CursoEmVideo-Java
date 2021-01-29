package aula10;

public class Aluno extends Pessoa{
        // var
        private int matricula;
        private String curso;
    

        // construtor
    
        // metodos
    
            public void cancelarMatri(){    
                System.out.println(" matricula cancelada");
            }
    
        // get e set
    
    
        public int getMatricula() {
            return this.matricula;
        }
    
        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }
    
        public String getCurso() {
            return this.curso;
        }
    
        public void setCurso(String curso) {
            this.curso = curso;
        }
    
   

}
