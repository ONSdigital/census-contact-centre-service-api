package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"data-version", "addresses", "total"})
public class PostcodeQueryResponseDTO {

  @JsonProperty("data-version")
  private String dataVersion;

  private ArrayList<AddressDTO> addresses;

  private int total;
}
