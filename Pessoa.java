public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;
    private double imc;

    public Pessoa(String cpf, String nome, int idade, String sexo, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularImc();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    private double calcularImc() {
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + this.getCpf() + ", nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + "]";
    }
}