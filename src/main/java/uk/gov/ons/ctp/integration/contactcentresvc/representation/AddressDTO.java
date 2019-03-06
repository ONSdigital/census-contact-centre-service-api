package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "uprn", "formatted-address", "welsh-formatted-address" })
public class AddressDTO {

  private String uprn;

  @JsonProperty("formatted-address")
  private String formattedAddress;
	
  @JsonProperty("welsh-formatted-address")
  private String welshFormattedAddress;
}
