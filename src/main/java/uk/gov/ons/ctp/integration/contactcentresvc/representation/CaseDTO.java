package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseDTO implements Serializable {
  private UUID id;

  // case-ref
  private String caseRef;

  // maxLength: 2
  // case-type
  private String caseType;

  // created-date-time
  private LocalDateTime createdDateTime;

  // maxLength: 60
  // address-line1
  private String addressLine1;

  // maxLength: 60
  // address-line2
  private String addressLine2;

  // maxLength: 60
  // address-line3
  private String addressLine3;

  // maxLength: 60
  // address-line4
  private String addressLine4;

  // maxLength: 30
  // town-name;
  private String townName;

  // maxLength: 30
  // country;
  private String country;

  // maxLength: 8
  private String postcode;

  private List<CaseResponseDTO> responses;

  private List<CaseEventDTO> caseEvents;
}
