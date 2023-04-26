public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String cpf, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome, cpf, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
