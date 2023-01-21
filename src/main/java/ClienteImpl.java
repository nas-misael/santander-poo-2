public class ClienteImpl implements Cliente{
    private Pessoa dadosPessoais;
    private String clienteDesde;

    public ClienteImpl(Pessoa dadosPessoais, String clienteDesde){
        this.dadosPessoais = dadosPessoais;
        this.clienteDesde = clienteDesde;
    }

    @Override
    public Pessoa getDadosPessoais() {
        return dadosPessoais;
    }

    @Override
    public String clienteDesde() {
        return this.clienteDesde;
    }
}
