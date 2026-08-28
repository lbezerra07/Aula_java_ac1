public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email){
        this.nome;
        this.email;
    }


    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email
    }


    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email)
    }

}