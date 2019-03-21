package uk.gov.ons.ctp.integration.contactcentresvc;

public interface Constants {
  public static final String UPRN_RE = "^\\d{1,12}$";
  public static final long UPRN_MIN = 0L;
  public static final long UPRN_MAX = 999999999999L;

  public static final String PHONENUMBER_RE =
      "^(?:(?:\\(?(?:0(?:0|11)\\)?[\\s-]?\\(?|\\+)44\\)?[\\s-]?(?:\\(?0\\)?[\\s-]?)?)|"
          + "(?:\\(?0))(?:(?:\\d{5}\\)?[\\s-]?\\d{4,5})|(?:\\d{4}\\)?[\\s-]?(?:\\d{5}|\\d{3}[\\s-]"
          + "?\\d{3}))|(?:\\d{3}\\)?[\\s-]?\\d{3}[\\s-]?\\d{3,4})|(?:\\d{2}\\)?[\\s-]?\\d{4}[\\s-]"
          + "?\\d{4}))(?:[\\s-]?(?:x|ext\\.?|\\#)\\d{3,4})?$";
  public static final String OPTIONAL_PHONENUMBER_RE = "^$|" + PHONENUMBER_RE;

  public static final String POSTCODE_RE =
      "GIR[ ]?0AA|((AB|AL|B|BA|BB|BD|BH|BL|BN|BR|BS|BT|BX|CA|CB|CF|CH|CM|CO|CR|"
          + "CT|CV|CW|DA|DD|DE|DG|DH|DL|DN|DT|DY|E|EC|EH|EN|EX|FK|FY|G|GL|GY|GU|HA|"
          + "HD|HG|HP|HR|HS|HU|HX|IG|IM|IP|IV|JE|KA|KT|KW|KY|L|LA|LD|LE|LL|LN|LS|LU|"
          + "M|ME|MK|ML|N|NE|NG|NN|NP|NR|NW|OL|OX|PA|PE|PH|PL|PO|PR|RG|RH|RM|S|SA|SE|"
          + "SG|SK|SL|SM|SN|SO|SP|SR|SS|ST|SW|SY|TA|TD|TF|TN|TQ|TR|TS|TW|UB|W|WA|WC|WD|"
          + "WF|WN|WR|WS|WV|YO|ZE)(\\d[\\dA-Z]?[ ]?\\d[ABD-HJLN-UW-Z]{2}))|BFPO[ ]?\\d{1,4}";
  public static final String OPTIONAL_POSTCODE_RE = "^$|" + POSTCODE_RE;

  public static final String UUID_RE = "^[0-9A-Fa-f]{8}(?:-[0-9A-Fa-f]{4}){3}-[0-9A-Fa-f]{12}$";
  public static final String REGION_RE = "^$|[ENW]";
}
