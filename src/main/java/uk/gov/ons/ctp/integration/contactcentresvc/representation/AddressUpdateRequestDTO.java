package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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

/** The request object for updating addresss details by uprn */
@SuppressWarnings("serial")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressUpdateRequestDTO implements Serializable {

  public enum Category {
    CREATE,
    UPDATE,
    DELETE;
  }

  public enum Type {
    @JsonProperty("NEW")
    NEW_PROPERTY,
    CORRECTION,
    SPLIT,
    MERGED,
    DEMOLISHED,
    DERELICT,
    UNOCCUPIED
  }

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

  private Category category;

  private Type type;

  @NotBlank
  @Size(max = 12)
  private String title;

  @NotBlank
  @Size(max = 60)
  private String forename;

  @NotBlank
  @Size(max = 60)
  private String surname;

  @NotNull private LocalDateTime dateTime;
}
