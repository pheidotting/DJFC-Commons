package nl.lakedigital.djfc.commons.json;

public class BedrijfZoekResultaat extends BedrijfOfRelatie {
    private Long id;
    private String naam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
