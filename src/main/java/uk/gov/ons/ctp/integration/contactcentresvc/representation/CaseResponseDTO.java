package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object for a CaseDTO containing a case's questionnaire response
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseResponseDTO implements Serializable {

  private String dateTime;

  private String inboundChannel;
}
