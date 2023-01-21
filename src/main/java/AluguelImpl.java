import java.util.UUID;

public class AluguelImpl implements Aluguel{
    private String id;
    private Cliente cliente;
    private Veiculo veiculo;
    private int qtdDiasAluguel;
    private double valorFinalDoAluguel;

    public AluguelImpl(Cliente cliente, Veiculo veiculo, int qtdDiasAluguel){
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.qtdDiasAluguel = qtdDiasAluguel;
        this.id = gerarId();
    }


    @Override
    public Cliente getInformacoesCliente() {
        return cliente;

    }

    public String gerarId() {
        return UUID.randomUUID().toString();
    }

    public int getQtdDiasAluguel() {
        return this.qtdDiasAluguel;
    }

    @Override
    public String getId() {
        return this.id;
    }


    @Override
    public Veiculo getInformacoesObjetoAlugado() {
        return veiculo;
    }
}
