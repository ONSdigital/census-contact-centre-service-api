package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object for a CaseDTOs case event data
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseEventDTO {

  private String description;

  private String category;

  private LocalDateTime createdDateTime;
}
