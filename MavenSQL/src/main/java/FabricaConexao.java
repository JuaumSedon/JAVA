import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaConexao {
    private static Connection conexao;


    public static void conectar() {
        try {

            if (conexao == null) {
                conexao = DriverManager.getConnection("jdbc:mysql://localhost/rocket_db?" + "user=root&password=1234");

                System.out.println("Conectado....");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static Connection getConexao() {
        return conexao;
    }
}
