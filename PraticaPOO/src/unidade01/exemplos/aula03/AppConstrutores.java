package unidade01.exemplos.aula03;

public class AppConstrutores {

    public static void main(String[] args) {
        PessoaConstrutores pc = new PessoaConstrutores();

        pc.setNome("André");

        System.out.println(pc.getNome());

        PessoaConstrutores pc2 = new PessoaConstrutores();
        System.out.println("Nome da pc2: " + pc2.getNome());

        System.out.println("-------------------------");

        PessoaConstrutores pc3 = new PessoaConstrutores(1.79, 100, "João");
        System.out.println("Nome da pc3: " + pc3.getNome());
        System.out.println("IMC da pc3: " + pc3.calcularImc());

        PessoaConstrutores pc4 = new PessoaConstrutores(1.79, 100, null);
        System.out.println("Nome da pc4: " + pc4.getNome());
        System.out.println("IMC da pc4: " + pc4.calcularImc());

        PessoaConstrutoresDois pcd = new PessoaConstrutoresDois(1.89, 75, "Nome");
        System.out.println("Nome da pcd: " + pcd.getNome());
        System.out.println("IMC da pcd: " + pcd.calcularImc());


    }
}
