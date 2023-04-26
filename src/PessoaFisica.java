public class PessoaFisica extends Cliente{
    private String renda;

    public PessoaFisica(String nome, String cpf, String endereco, String telefone, String renda) {
        super(nome, cpf, endereco, telefone);
        this.renda = renda;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }
}
