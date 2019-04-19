package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The response object representing a single fulfilment record
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FulfilmentDTO implements Serializable {

  private List<Region> regions;

  private CaseType caseType;

  private String fulfilmentCode;

  private String language;

  private String description;

  private DeliveryChannel deliveryChannel;
}
