public class VeiculoSUVImpl implements Veiculo{
    private String cor;
    private double precoBaseDiaria = 200;
    private String placa;

    public VeiculoSUVImpl(String cor, String placa){
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
        return "VeiculoSUVImpl{" + "cor='" + cor + '\'' + ", precoBaseDiaria=" + precoBaseDiaria + ", placa='" + placa + '\'' + '}';
    }
}
