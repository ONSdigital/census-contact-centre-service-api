package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.godaddy.logging.LoggingScope;
import com.godaddy.logging.Scope;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.common.domain.EstabType;

/**
 * The request object when contact centre calls to modify the details for a case
 *
 * @author philwhiles
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModifyCaseRequestDTO extends CaseRequestDTO {

  @NotNull private UUID caseId;

  @NotNull private EstabType estabType;

  @NotNull private CaseStatus status;

  @Size(max = 60)
  @LoggingScope(scope = Scope.SKIP)
  private String notes;
}
