public class Principal {
    public static void main(String[] args) {
        Pessoa usuario = new Pessoa("Inatel", 123456789);
        Endereco e1 = new Endereco("Av. João de Camargo", "Centro", 510);
        usuario.addEndereco(e1);
        usuario.mostraInfo();
    }
}
