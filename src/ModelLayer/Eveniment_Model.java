package ModelLayer;

public class Eveniment_Model {

    private int org_ID;
    private int ev_ID;
    private int no_locuri;
    private String ora_Data;
    private boolean idActive;
    private int id;
    private int locatie_ID;
    private byte[] rowVersion;

    public Eveniment_Model(int org_ID, int ev_ID, int no_locuri, String ora_Data, boolean idActive, int id, int locatie_ID) {
        this.org_ID = org_ID;
        this.ev_ID = ev_ID;
        this.no_locuri = no_locuri;
        this.ora_Data = ora_Data;
        this.idActive = idActive;
        this.id = id;
        this.locatie_ID = locatie_ID;
    }

    public Eveniment_Model(int org_ID, int ev_ID, int no_locuri, String ora_Data, boolean idActive, int locatie_ID) {
        this.org_ID = org_ID;
        this.ev_ID = ev_ID;
        this.no_locuri = no_locuri;
        this.ora_Data = ora_Data;
        this.idActive = idActive;
        this.locatie_ID = locatie_ID;
    }

    public int getOrg_ID() {
        return org_ID;
    }

    public void setOrg_ID(int org_ID) {
        this.org_ID = org_ID;
    }

    public int getEv_ID() {
        return ev_ID;
    }

    public void setEv_ID(int ev_ID) {
        this.ev_ID = ev_ID;
    }

    public int getNo_locuri() {
        return no_locuri;
    }

    public void setNo_locuri(int no_locuri) {
        this.no_locuri = no_locuri;
    }

    public String getOra_Data() {
        return ora_Data;
    }

    public void setOra_Data(String ora_Data) {
        this.ora_Data = ora_Data;
    }

    public boolean isIdActive() {
        return idActive;
    }

    public void setIdActive(boolean idActive) {
        this.idActive = idActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocatie_ID() {
        return locatie_ID;
    }

    public void setLocatie_ID(int locatie_ID) {
        this.locatie_ID = locatie_ID;
    }

    public void setRowVersion(byte[] rowVersion) {
        this.rowVersion = rowVersion;
    }

    public byte[] getRowVersion() {
        return rowVersion;
    }
}
