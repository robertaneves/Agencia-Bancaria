package Programa;

public class Pessoa{ 

    private static int counter = 1;

    private String nome;
    private String cpf;
    private String email;

    public Pessoa (String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        counter += 1;

    }


    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }

    public String toString() {
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getcpf() +
                "\nEmail: " + this.getemail();
                //"\nNome: " + this.getNome();

    }


}
