public class PessoaJuridica extends Cliente{
    private String cnpj;
    private int numFuncionarios;
    private String setor;


    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public void imprimir() {
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Setor: " + setor);
        System.out.println("Número de Funcionários: " + numFuncionarios);
    }

    public String getCnpj(){return cnpj;}
    public void setCnpj(String cnpj) {this.cnpj = cnpj;}

    public String getSetor() {return setor;}
    public void setSetor(String setor) {this.setor = setor;}

    public int getNumFuncionarios() {return numFuncionarios;}
    public void setNumFuncionarios(int numFuncionarios) {this.numFuncionarios = numFuncionarios;}

    public static PessoaJuridica criarCliente(String nome, String endereco, String cnpj, int numFuncionarios, String setor){
        PessoaJuridica aux = new PessoaJuridica(nome, endereco, cnpj, numFuncionarios, setor);
        return aux;
    }
}
