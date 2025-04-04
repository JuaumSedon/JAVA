public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();

        cadastro.setNome("Janilson");
        cadastro.setIdade(57);
        cadastro.setId(3);
        repository.update(cadastro);
    }
}
