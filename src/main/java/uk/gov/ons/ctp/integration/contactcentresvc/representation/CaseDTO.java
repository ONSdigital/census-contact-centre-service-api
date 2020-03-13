package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.godaddy.logging.LoggingScope;
import com.godaddy.logging.Scope;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.common.model.UniquePropertyReferenceNumber;

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

  @LoggingScope(scope = Scope.HASH)
  private String caseRef;

  private String caseType;

  private String addressType;

  private List<DeliveryChannel> allowedDeliveryChannels;

  private Date createdDateTime;

  private String addressLine1;

  @LoggingScope(scope = Scope.SKIP)
  private String addressLine2;

  @LoggingScope(scope = Scope.SKIP)
  private String addressLine3;

  @LoggingScope(scope = Scope.SKIP)
  private String townName;

  private String region;

  private String postcode;

  @JsonUnwrapped private UniquePropertyReferenceNumber uprn;

  private List<CaseEventDTO> caseEvents;

  private boolean handDelivery;

  @JsonIgnore
  public boolean isHandDelivery() {
    return handDelivery;
  }
}
