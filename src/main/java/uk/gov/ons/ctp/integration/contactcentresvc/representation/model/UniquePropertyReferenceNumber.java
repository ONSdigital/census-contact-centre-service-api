package uk.gov.ons.ctp.integration.contactcentresvc.representation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import uk.gov.ons.ctp.integration.contactcentresvc.Constants;

/**
 * If this class is included Jackson serialisation then you may want to simplify the generated
 * string by removing an extra layer of output, so that the generated string can contain a 'uprn'
 * value instead of showing the hierarchy of ownership. To do this annotate references to this class
 * with '@JsonUnwrapped'.
 */
@Data
@AllArgsConstructor
public class UniquePropertyReferenceNumber {

  public UniquePropertyReferenceNumber(String str) {
    if (!StringUtils.isBlank(str)) {
      try {
        Long uprn = Long.parseLong(str);
        if (uprn.longValue() >= Constants.UPRN_MIN && uprn.longValue() <= Constants.UPRN_MAX) {
          this.value = uprn;
        } else {
          throw new IllegalArgumentException("String '" + uprn + "' is not a valid UPRN");
        }
      } catch (NumberFormatException e) {
        throw new IllegalArgumentException();
      }
    }
  }

  @JsonProperty("uprn")
  @JsonSerialize(using = ToStringSerializer.class)
  private long value;
}
