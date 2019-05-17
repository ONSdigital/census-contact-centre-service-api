package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

/** This response object is used to return a list of addresses for postcode and address queries. */
@Data
@JsonPropertyOrder({"dataVersion", "addresses", "total"})
public class AddressQueryResponseDTO {

  private String dataVersion;

  private ArrayList<AddressDTO> addresses;

  private int total;
}
