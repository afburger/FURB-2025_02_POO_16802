package unidade01.exemplos.aula03;

public class PessoaConstrutoresDois {

    private double altura;
    private double peso;
    private String nome;

    public PessoaConstrutoresDois(double altura, double peso, String nome) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    double calcularImc() {
        return peso / (altura * altura);
    }
    
}
