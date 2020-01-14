package DBLayer;

import ModelLayer.Utilizator_Model;

import java.sql.Connection;
import java.sql.SQLException;

public class DB_Utilizator {
   // public static void main(String [] args)
    //{
    //    Creare(new Utilizator_Model("test","test", "test", "test"));
   // }
    public Utilizator_Model Creare(Utilizator_Model utilizator){
        String sql = "INSERT INTO Utilizator (Nume, Prenume, Email, Parola) " +
                "VALUES ('"+utilizator.getNume()+"', '"+utilizator.getPrenume()+"', '"+utilizator.getEmail()+"', '"+utilizator.getParola()+"')  ";
        try
        {
            Connection conn = DB_Connection.getInstance().getDBcon();
            //conn = DBConnection.getInstance().getDBcon();
            conn.createStatement().executeUpdate(sql);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            DB_Connection.closeConnection();
        }
        return utilizator;
    }

}
