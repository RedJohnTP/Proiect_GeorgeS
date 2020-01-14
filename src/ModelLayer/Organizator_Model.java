package ModelLayer;

public class Organizator_Model {
    private String nume;
    private String telefon;
    private String email;
    private String parola;
    private int id;

    public Organizator_Model(String nume, String telefon, String email, String parola, int id) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
        this.parola = parola;
        this.id = id;
    }

    public Organizator_Model(String nume, String telefon, String email, String parola) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
        this.parola = parola;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
