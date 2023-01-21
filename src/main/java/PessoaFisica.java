public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "| NOME: " + this.nome + " | CPF: " + this.cpf + " |" ;
    }
}
