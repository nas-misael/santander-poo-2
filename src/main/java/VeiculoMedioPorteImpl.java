public class VeiculoMedioPorteImpl implements Veiculo{
    private String cor;
    private double precoBaseDiaria = 150;
    private String placa;

    public VeiculoMedioPorteImpl(String cor, String placa){
        this.cor = cor.toUpperCase();
        this.placa = placa;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public double getPrecoBaseDiaria() {
        return this.precoBaseDiaria;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String getInformacoesDoVeiculo() {
        return "VeiculoMedioPorteImpl{" + "cor='" + cor + '\'' + ", precoBaseDiaria=" + precoBaseDiaria + ", placa='" + placa + '\'' + '}';
    }
}
