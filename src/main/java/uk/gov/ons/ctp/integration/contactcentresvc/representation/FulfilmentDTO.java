package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The response object representing a single fulfilment record
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FulfilmentDTO implements Serializable {

  public enum Method {
    POST,
    EMAIL,
    SMS
  }

  private String productCode;

  private String language;

  private String description;

  private Method method;
}
