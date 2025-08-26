package unidade01.exemplos.aula06;

public class PessoaConstrutores {

    private double altura;
    private double peso;
    private String nome;

    public PessoaConstrutores() {
        nome = "Vazio";
    }

    public PessoaConstrutores(double altura, double peso, String nome) {
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
