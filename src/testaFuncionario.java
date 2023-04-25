public class testaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João Silva", "Analista de Sistemas", 5000.0);
        Funcionario f2 = new Funcionario("Maria Santos", "Gerente de Projetos", 8000.0);

        System.out.println(f1);
        System.out.println(f2);

        f1.aumentarSalario(10.0);
        f2.aumentarSalario(5.0);

        System.out.println(f1);
        System.out.println(f2);
    }
}

