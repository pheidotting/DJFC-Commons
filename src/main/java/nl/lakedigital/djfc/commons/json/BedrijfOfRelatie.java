package nl.lakedigital.djfc.commons.json;

public abstract class BedrijfOfRelatie {
    private JsonAdres adres;

    public JsonAdres getAdres() {
        return adres;
    }

    public void setAdres(JsonAdres adres) {
        this.adres = adres;
    }
}
