public class Livro{
    private String titulo;
    private String autor;

    public Livro (String titulo, String autor); {
    this.titulo = titulo;
    this.autor = autor;
    }

    public void apresentar(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

}