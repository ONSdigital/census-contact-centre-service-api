package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FulfilmentsDTO implements Serializable {

  private Fulfilment[] codes;

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Fulfilment {
    private String productCode;
    private String description;
    private String method;
  }
}
