package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object when contact centre Gets refusals
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefusalsRequestDTO {

  @Size(max = 2)
  private String caseType;
}
