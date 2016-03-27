package nl.lakedigital.djfc.commons.json;

public abstract class AbstracteJsonEntiteitMetSoortEnId {
    private String soortEntiteit;
    private Long entiteitId;

    public abstract Long getId();

    public abstract void setId(Long id);

    public String getSoortEntiteit() {
        return soortEntiteit;
    }

    public void setSoortEntiteit(String soortEntiteit) {
        this.soortEntiteit = soortEntiteit;
    }

    public Long getEntiteitId() {
        return entiteitId;
    }

    public void setEntiteitId(Long entiteitId) {
        this.entiteitId = entiteitId;
    }
}
