public class VeiculoPequenoPorteImpl implements Veiculo{
    private String cor;
    private double precoBaseDiaria = 100;
    private String placa;

    public VeiculoPequenoPorteImpl(String cor, String placa){
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
        return "VeiculoPequenoPorteImpl{" + "cor='" + cor + '\'' + ", precoBaseDiaria=" + precoBaseDiaria + ", placa='" + placa + '\'' + '}';
    }
}
