public class Aluno extends Usuario{
    private String curso;


    public Aluno (String nome, String curso, String email) {
        super(nome, email);
        this.curso = curso;

    }

    public void apresentar(){
        System.out.println("Nome: " + getNome());
        System.out.println("E-mail: " + getEmail());
        Sytem.out.prinln("Curso: " + curso);
    }
    
}