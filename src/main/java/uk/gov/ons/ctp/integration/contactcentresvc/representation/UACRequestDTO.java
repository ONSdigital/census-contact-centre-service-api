package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AD request object for get uac for case
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UACRequestDTO {

  @NotNull private UUID caseId;

  @NotNull private String adLocation;

  @NotNull private boolean individual;
}
