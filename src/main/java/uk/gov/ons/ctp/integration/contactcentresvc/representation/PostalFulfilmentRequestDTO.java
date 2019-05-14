package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object when contact centre requests a postal fulfilment for a given case
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostalFulfilmentRequestDTO implements Serializable {

  @NotNull private UUID caseId;

  @NotNull
  @Size(max = 12)
  private String title;

  @NotNull
  @Size(max = 60)
  private String forename;

  @NotNull
  @Size(max = 60)
  private String surname;

  @NotNull
  @Size(max = 12)
  private String fulfilmentCode;

  @NotNull private LocalDateTime dateTime;
}
