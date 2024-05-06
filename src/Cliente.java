import java.util.Date;

public class Cliente {

    private String nome;

    private String endereco;

    private Date data;


    Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        data = new Date();
    }

    Cliente(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
}
