public interface Aluguel {
    Cliente getInformacoesCliente();
    Veiculo getInformacoesObjetoAlugado();
    int getQtdDiasAluguel();
    String getId();
}
