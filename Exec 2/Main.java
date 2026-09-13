import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Projeto projECommerce = new Projeto("New E-commerce", "Nova loja virtual da empresa.");
        Projeto projAppMobile = new Projeto("App Mobile", "Desenvolvimento de aplicativo para Android e IOS.");

        Desenvolvedor dev = new Desenvolvedor("Felipe Silva", 6000.00, projECommerce, "Java");
        Designer designer = new Designer("Kaique Machado", 5000.00, projECommerce, "Figma");
        Gerente gerente = new Gerente("Luís Bezerra", 10000.00, projECommerce);

        gerente.adicionarFuncionario(dev);
        gerente.adicionarFuncionario(designer);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(dev);
        funcionarios.add(designer);
        funcionarios.add(gerente);

        System.out.println(" DADOS DOS FUNCIONÁRIOS ");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }

        System.out.println(" EXECUÇÃO DAS TAREFAS" );
        for (Funcionario f : funcionarios) {
            if (f instanceof Trabalhavel) {
                ((Trabalhavel) f).trabalhar();
            }
        }
    }
}