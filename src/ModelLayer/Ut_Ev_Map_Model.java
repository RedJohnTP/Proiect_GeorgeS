package ModelLayer;

public class Ut_Ev_Map_Model {
    private int ut_ID;
    private int ev_ID;
    private String status;


    public Ut_Ev_Map_Model(int ut_ID, int ev_ID, String status) {
        this.ut_ID = ut_ID;
        this.ev_ID = ev_ID;
        this.status = status;
    }

    public int getUt_ID() {
        return ut_ID;
    }

    public void setUt_ID(int ut_ID) {
        this.ut_ID = ut_ID;
    }

    public int getEv_ID() {
        return ev_ID;
    }

    public void setEv_ID(int ev_ID) {
        this.ev_ID = ev_ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
