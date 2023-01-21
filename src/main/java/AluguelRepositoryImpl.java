import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class AluguelRepositoryImpl implements AluguelRepository{
    private static final Map<String, Aluguel> ALUGUEIS = new HashMap<>();
    // private static String id = "";

    @Override
    public ArrayList<Aluguel> buscarAluguelDeUmaPessoa(Pessoa pessoa) {
        ArrayList<Aluguel> alugueis = new ArrayList<>();
        ALUGUEIS.forEach((chave, valor) -> {
            if(valor.getInformacoesCliente().getDadosPessoais().getNome().equals(pessoa.getNome())){
                alugueis.add(valor);
            }
        });

        return alugueis;
    }

    @Override
    public String salvarAluguel(Aluguel aluguel) {
        String idAluguel = aluguel.getId();
        ALUGUEIS.put(idAluguel, aluguel);
        return idAluguel;
    }
}
