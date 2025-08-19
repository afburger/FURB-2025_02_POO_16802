package unidade01.exemplos.aula03;

public class PessoaSobrecarga {

    private double altura;
    private double peso;
    private String nome;

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

    // Exemplo de sobrecarga de métodos
    public double calcularImc() {
        return peso / (altura * altura);
    }

    public double calcularImc(double normal) {
        double imc = calcularImc();
        if (imc <= normal) {
            System.out.println("O imc calculado está dentro do normal");
        }
        return imc;
    }

}
