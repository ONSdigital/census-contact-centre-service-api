package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object when contact centre requests an EQ launch URL
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LaunchRequestDTO implements Serializable {

  @Pattern(regexp = "\\d{1,5}")
  @NotNull
  private String agentId;
}
