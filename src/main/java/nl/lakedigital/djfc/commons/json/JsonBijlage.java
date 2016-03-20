package nl.lakedigital.djfc.commons.json;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class JsonBijlage extends AbstracteJsonEntiteitMetSoortEnId implements Comparable<JsonBijlage> {
    private Long id;
    private String bestandsNaam;
    private String url;
    private String tonen;
    private String omschrijving;
    private String datumUpload;
    private String omschrijvingOfBestandsNaam;
    private String omschrijvingOfBestandsNaamBackup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBestandsNaam() {
        return bestandsNaam;
    }

    public void setBestandsNaam(String bestandsNaam) {
        this.bestandsNaam = bestandsNaam;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTonen() {
        return tonen;
    }

    public void setTonen(String tonen) {
        this.tonen = tonen;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getDatumUpload() {
        return datumUpload;
    }

    public void setDatumUpload(String datumUpload) {
        this.datumUpload = datumUpload;
    }

    public String getOmschrijvingOfBestandsNaam() {
        return omschrijvingOfBestandsNaam;
    }

    public void setOmschrijvingOfBestandsNaam(String omschrijvingOfBestandsNaam) {
        this.omschrijvingOfBestandsNaam = omschrijvingOfBestandsNaam;
    }

    public String getOmschrijvingOfBestandsNaamBackup() {
        return omschrijvingOfBestandsNaamBackup;
    }

    public void setOmschrijvingOfBestandsNaamBackup(String omschrijvingOfBestandsNaamBackup) {
        this.omschrijvingOfBestandsNaamBackup = omschrijvingOfBestandsNaamBackup;
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof JsonBijlage)) {
            return false;
        }
        JsonBijlage rhs = (JsonBijlage) object;
        return new EqualsBuilder().append(this.bestandsNaam, rhs.bestandsNaam).append(this.id, rhs.id).append(this.url, rhs.url).isEquals();
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.bestandsNaam).append(this.id).append(this.url).toHashCode();
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", this.url).append("bestandsNaam", this.bestandsNaam).append("id", this.id).toString();
    }

    @Override
    public int compareTo(JsonBijlage o) {
        if (this.getSoortEntiteit() == o.getSoortEntiteit()) {
            return this.bestandsNaam.compareTo(o.bestandsNaam);
        } else {
            return 0;
        }
    }
}
