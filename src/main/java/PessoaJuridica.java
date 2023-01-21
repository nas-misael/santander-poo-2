public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "| NOME: " + this.nome + " | CNPJ: " + this.cnpj + " |" ;
    }
}
