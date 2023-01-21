public class Aplicacao {
    public static void main(String[] args) {
        Veiculo gol = new VeiculoPequenoPorteImpl("cinza", "1234ABC");
        Veiculo jetta = new VeiculoMedioPorteImpl("preto", "9876YZX");
        Veiculo ix35 = new VeiculoSUVImpl("branca", "3456FGH");

        Pessoa pessoaFisica = new PessoaFisica("João da Silva", "11111111111");
        Pessoa pessoaJuridica = new PessoaJuridica("Empresa ABC", "123543121/2212");

        Cliente cliente1 = new ClienteImpl(pessoaFisica, "1999");
        Cliente cliente2 = new ClienteImpl(pessoaJuridica, "2015");

        Aluguel aluguel1 = new AluguelImpl(cliente1, gol, 4);
        Aluguel aluguel2 = new AluguelImpl(cliente2, ix35, 1);

        AluguelRepository repo = new AluguelRepositoryImpl();

        AluguelService aluguelService = new AluguelService(repo);


        System.out.println(" Salvamento com sucesso! Id do aluguel: " + aluguelService.salvarAluguel(aluguel1));
        System.out.println(" Salvamento com sucesso! Id do aluguel: " + aluguelService.salvarAluguel(aluguel2));


        aluguelService.buscarAluguel(pessoaFisica);
        aluguelService.buscarAluguel(pessoaJuridica);

        System.out.println("| Aluguel: " + aluguel1.getId() + " | Valor final: " + aluguelService.calcularValorFinalDoAluguel(aluguel1) + " |");
        System.out.println("| Aluguel: " + aluguel2.getId() + " | Valor final: " + aluguelService.calcularValorFinalDoAluguel(aluguel2) + " |");

    }
}
