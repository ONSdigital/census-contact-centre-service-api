package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.integration.contactcentresvc.Constants;

/**
 * The request object when contact centre requests a postal fulfilment for an unresolved case
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostalUnresolvedFulfilmentRequestDTO {

  @NotBlank
  @Size(max = 12)
  private String title;

  @NotBlank
  @Size(max = 60)
  private String forename;

  @NotBlank
  @Size(max = 60)
  private String surname;

  @NotBlank
  @Size(max = 60)
  private String addressLine1;

  @Size(max = 60)
  private String addressLine2;

  @Size(max = 60)
  private String addressLine3;

  @Size(max = 60)
  private String addressLine4;

  @NotBlank
  @Size(max = 60)
  private String townName;

  @Pattern(regexp = Constants.REGION_RE)
  private String region;

  @NotNull
  @Pattern(regexp = Constants.POSTCODE_RE)
  private String postcode;

  @NotBlank
  @Size(max = 12)
  private String fulfilmentCode;

  @NotNull private LocalDateTime dateTime;
}
