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
public class RefusalsDTO implements Serializable {
  private Refusal[] codes;

  public class Refusal {
    private String refusalCode;
    private String description;
  }
}
