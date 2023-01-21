import java.util.ArrayList;

public class AluguelService {
    private AluguelRepository repo;

    public AluguelService(AluguelRepository repo){
        this.repo = repo;
    }

    public double calcularValorFinalDoAluguel(Aluguel aluguel){
        int porcentagemDeDesconto = 0;
        if(aluguel.getInformacoesCliente().getDadosPessoais() instanceof PessoaFisica){
            if(aluguel.getQtdDiasAluguel() > 5){
                porcentagemDeDesconto = 5;
            }
        } else if(aluguel.getInformacoesCliente().getDadosPessoais() instanceof PessoaJuridica){
            if(aluguel.getQtdDiasAluguel() > 3){
                porcentagemDeDesconto = 10;
            }
        }

        double precoFinalDoAluguel = aluguel.getInformacoesObjetoAlugado().getPrecoBaseDiaria() * aluguel.getQtdDiasAluguel();

        if(porcentagemDeDesconto > 0){
            double desconto = (precoFinalDoAluguel / 100) * porcentagemDeDesconto;
            precoFinalDoAluguel = precoFinalDoAluguel - desconto;
        }

        return precoFinalDoAluguel;
    };

    public String salvarAluguel(Aluguel aluguel){
        return repo.salvarAluguel(aluguel);
    }

    public void buscarAluguel(Pessoa pessoa){
       ArrayList<Aluguel> alugueis = repo.buscarAluguelDeUmaPessoa(pessoa);

       if(alugueis.size() > 0){
           alugueis.stream().forEach(aluguel -> {
               System.out.println("ID: " + aluguel.getId() + " | Nome Cliente: " + aluguel.getInformacoesCliente().getDadosPessoais().getNome() + " | Objeto alugado: " + aluguel.getInformacoesObjetoAlugado().getInformacoesDoVeiculo());
           });
       }
    }
}
