//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Cliente {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    /**
     * Constructor da classe
     * @param nome
     * @param idade
     * @param email
     * @param telefone
     */
    public Cliente(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Exibe toda informaçao do usuario
    public void exibirInformacoes() {
        System.out.println("Informaçoes do cliente");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone " + this.telefone);
    }

    /**
     * dar ola com o nome do cliente
     * @return
     */
    public String cumprimetarCliente() {
        return "Olá, " + this.nome + "!";
    }
}
