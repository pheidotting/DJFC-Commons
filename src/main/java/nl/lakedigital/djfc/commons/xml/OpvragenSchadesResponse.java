package nl.lakedigital.djfc.commons.xml;

import nl.lakedigital.djfc.commons.json.JsonSchade;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "opvragenSchadesResponse")
public class OpvragenSchadesResponse {
    private List<JsonSchade> schades;

    public List<JsonSchade> getSchades() {
        return schades;
    }

    public void setSchades(List<JsonSchade> schades) {
        this.schades = schades;
    }
}
