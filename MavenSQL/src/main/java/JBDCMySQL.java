import java.sql.*;

public class JBDCMySQL {

    public static void main(String[] args) {

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        Connection conn = null;
        try {



            String instrucaoSQL = "INSERT INTO rocket_db.tabela_cadastro (Nome, Idade) VALUES(?, ?);";
            String nome = "Ricardo";
            Integer idade = 42;

            PreparedStatement pst = conn.prepareStatement(instrucaoSQL);
            pst.setString(1,nome);
            pst.setInt(2,idade);
            pst.execute();
            System.out.println("Insert realizado com sucesso");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }finally {
            if(conn!=null)
            {
                try{
                    conn.close();
                    System.out.println("ConexaoFechada");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
