package nl.lakedigital.djfc.commons.json;

public abstract class BedrijfOfRelatie {
    private JsonAdres adres;
    private String identificatie;

    public JsonAdres getAdres() {
        return adres;
    }

    public void setAdres(JsonAdres adres) {
        this.adres = adres;
    }

    public String getIdentificatie() {
        return identificatie;
    }

    public void setIdentificatie(String identificatie) {
        this.identificatie = identificatie;
    }
}
