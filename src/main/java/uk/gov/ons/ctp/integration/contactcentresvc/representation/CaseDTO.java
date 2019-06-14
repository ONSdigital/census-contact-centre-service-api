package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.integration.contactcentresvc.representation.model.UniquePropertyReferenceNumber;

/**
 * The response object when contact centre requests case details
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseDTO {

  private UUID id;

  private String caseRef;

  private String caseType;

  private Date createdDateTime;

  private String addressLine1;

  private String addressLine2;

  private String addressLine3;

  private String townName;

  private String region;

  private String postcode;

  @JsonUnwrapped
  private UniquePropertyReferenceNumber uprn;

  private List<CaseEventDTO> caseEvents;
}
