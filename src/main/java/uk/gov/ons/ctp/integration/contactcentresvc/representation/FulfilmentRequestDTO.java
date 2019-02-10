package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import lombok.Data;

@Data
public abstract class FulfilmentRequestDTO implements Serializable {
  private String addressLine1;
}
