public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public abstract String getNome();

    @Override
    public String toString() {
        return "Pessoa{" + ", nome='" + nome + '\'' + '}';
    }
}
