public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Silva", 28, "maria.silva@cliente.com", "3334-5678");
        System.out.println(cliente1.cumprimetarCliente());
        cliente1.exibirInformacoes();
    }
}