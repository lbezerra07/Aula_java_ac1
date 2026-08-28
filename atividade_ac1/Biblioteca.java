public class Biblioteca {
    private String titulo;
    private String autor;
    private Livro livro;
    

    public Pessoa(String titulo, String autor, Livro livro) {
        this.livro = new Livro(titulo, autor);
    }
    

}