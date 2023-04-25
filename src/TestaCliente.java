
public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Felipe","195819621994","Avenida Geremanrio Dantas","40029822");
        Cliente c2 =  new Cliente("Manoel Gomes","12332145665412","Rua: Caneta Azul","11112222");

        System.out.print("Os dados para o cliente 1:\nNome: "+c1.getNome()+"\nCPF: "+c1.getCpf()+"\nEndereço: "+
                c1.getEndereco()+"\nTelefone: "+c1.getTelefone()+"\n");

        System.out.print("Os dados para o cliente 2:\nNome: "+c2.getNome()+"\nCPF: "+c2.getCpf()+"\nEndereço: "+
                c2.getEndereco()+"\nTelefone: "+c2.getTelefone());
    }
}

