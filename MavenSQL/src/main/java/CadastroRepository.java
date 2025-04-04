import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadastroRepository {

    private Connection conexao;

    public CadastroRepository() {
        conexao = FabricaConexao.getConexao();
    }

    public void insert(Cadastro cadastro) {
        try {
            String instrucaoSQL = "INSERT INTO rocket_db.tabela_cadastro (Nome, Idade) VALUES(?, ?);";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSQL);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.execute();
            System.out.println("Insert realizado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Cadastro cadastro) {

        try {
            String instrucaoSQL = "UPDATE rocket_db.tabela_cadastro SET Nome=?, Idade=? WHERE id=?;";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSQL);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.setInt(3, cadastro.getId());
            pst.execute();
            System.out.println("UPDATE realizado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Integer id){

       try {
           String instrucaoSQL = " DELETE FROM rocket_db.tabela_cadastro WHERE id=?;";
           PreparedStatement pst = conexao.prepareStatement(instrucaoSQL);
           pst.setInt(1, id);
           pst.execute();
           System.out.println("DELETE realizado com sucesso");
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    


}
