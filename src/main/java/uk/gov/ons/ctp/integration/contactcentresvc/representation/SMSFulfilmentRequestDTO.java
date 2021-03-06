package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.godaddy.logging.LoggingScope;
import com.godaddy.logging.Scope;
import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.integration.contactcentresvc.Constants;

/**
 * The request object when contact centre requests an SMS fulfilment for a given case
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SMSFulfilmentRequestDTO {

  @NotNull private UUID caseId;

  @NotNull
  @Size(max = 20)
  @Pattern(regexp = Constants.UKMOBILEPHONENUMBER_RE)
  @LoggingScope(scope = Scope.SKIP)
  private String telNo;

  @NotNull
  @Size(max = 12)
  private String fulfilmentCode;

  @NotNull private Date dateTime;
}
