package ModelLayer;

public class Locatie_Model {
    private String strada;
    private String numar;
    private String bloc;
    private String apartament;
    private String oras;
    private int id;

    public Locatie_Model(String strada, String numar, String bloc, String apartament, String oras, int id) {
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.apartament = apartament;
        this.oras = oras;
        this.id = id;
    }

    public Locatie_Model(String strada, String numar, String bloc, String apartament, String oras) {
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.apartament = apartament;
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
