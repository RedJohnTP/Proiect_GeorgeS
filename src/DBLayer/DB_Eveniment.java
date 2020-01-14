package DBLayer;

import ModelLayer.Eveniment_Model;

import java.sql.Connection;
import java.sql.SQLException;

public class DB_Eveniment {

    public Eveniment_Model Creare(Eveniment_Model eveniment){
        String sql = "INSERT INTO Utilizator (Org_ID, Ev_ID, No_Locuri, Ora_Data, isActive, Locatie_ID) " +
                "VALUES ('"+eveniment.getOrg_ID()
                +"', '"+eveniment.getEv_ID()
                +"', '"+eveniment.getNo_locuri()
                +"', '"+eveniment.getOra_Data()
                +"', '"+eveniment.isIdActive()
                +"', '"+eveniment.getLocatie_ID()
                +"')  ";
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
        return eveniment;
    }

}
