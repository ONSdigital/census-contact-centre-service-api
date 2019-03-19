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

  private String caseRef;

  private String caseType;

  private LocalDateTime createdDateTime;

  private String addressLine1;

  private String addressLine2;

  private String addressLine3;

  private String addressLine4;

  private String townName;

  private String country;

  private String postcode;

  private List<CaseResponseDTO> responses;

  private List<CaseEventDTO> caseEvents;
}
