import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario implements Trabalhavel {
    private List<Funcionario> equipe;

    public Gerente(String nome, double salario, Projeto projeto) {
        super(nome, salario, projeto);
        this.equipe = new ArrayList<>();   
    }

    public void adicionarFuncionario(Funcionario f) {
        equipe.add(f);
    }

    public void lsitarEquipe() {
        System.out.println(" Equipe: " + getNome());
        if (equipe.isEmpty()) {
            System.out.println("Não há funcionários na equipe.");
        } else {
            for (Funcionario f : equipe) {
                System.out.println("" + f.getNome());
            }
        }
    }

    @Override 
    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando o projeto: " + getProjeto().getNome());
    }

    @Override public void exibirDados() {
        super.exibirDados();
        System.out.println("Funcionários na equipe: " + equipe.size());
    }

}