package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object when contact centre requests a list of fulfilments to be returned
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FulfilmentsRequestDTO {

  private CaseType caseType;

  private Region region;
}
