import java.util.ArrayList;

public interface AluguelRepository {
    ArrayList<Aluguel> buscarAluguelDeUmaPessoa(Pessoa pessoa);
    String salvarAluguel(Aluguel aluguel);
}
