package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import java.util.UUID;
import lombok.Data;

@Data
public abstract class UnresolvedFulfilmentRequestDTO implements Serializable {
  private UUID id;
}
