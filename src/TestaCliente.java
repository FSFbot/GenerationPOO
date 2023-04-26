
public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Felipe","195819621994","Avenida Geremanrio Dantas","40029822");
        Cliente c2 =  new Cliente("Manoel Gomes","12332145665412","Rua: Caneta Azul","11112222");
        PessoaFisica pf1 = new PessoaFisica("João da Silva", "1234-5678", "Rua das Flores, 123", "111.222.333-44","4400");
        PessoaFisica pf2 = new PessoaFisica("Maria dos Santos", "9876-5432", "Avenida das Palmeiras, 456", "555.666.777-88","3300");
        PessoaJuridica pj1 = new PessoaJuridica("Loja de Eletrônicos LTDA", "9999-8888", "Rua dos Coqueiros, 789", "11987877878", "7548975243094752309","Pesque&pague");
        PessoaJuridica pj2 = new PessoaJuridica("Supermercado Bom Preço LTDA", "5555-4444", "Avenida dos Girassóis, 321", "1199998888","44.555.666/0001-77" ,"Supermercado Bom Preço");


        System.out.print("Os dados para o cliente 1:\nNome: "+c1.getNome()+"\nCPF: "+c1.getCpf()+"\nEndereço: "+
                c1.getEndereco()+"\nTelefone: "+c1.getTelefone()+"\n");

        System.out.print("Os dados para o cliente 2:\nNome: "+c2.getNome()+"\nCPF: "+c2.getCpf()+"\nEndereço: "+
                c2.getEndereco()+"\nTelefone: "+c2.getTelefone());
    }
}

