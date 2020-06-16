The swagger-current.yml in this project details the API implemented by the current release candidate of the Contact Centre Service, assuming it itself is dependent on the HEAD of this repo.

The swagger-future.yml details the planned API for a future release, and it's primary purpose is to facilitate discussion and understanding of upcoming changes.

While the swaggers can describe the request parameters for each endpoint, path parameters, and response objects, there are finer details which cannot be expressed in swagger, and it is the purpose of
this document to capture and communicate some of the finer business rules which cannot be expressed in swagger.


This is the ONS Census Contact Centre Service public API model project

It contains the representation objects sent/returned to/from the Contact Centre Service REST endpoints and
it's swagger API

# GENERAL
## GET/version

# CONTACT_CENTRE
## GET/addresses
## GET/addresses/postcode
## POST/cases
## POST/cases/{caseId}/invalidate
## GET/cases/uprn/{uprn}
## GET/cases/ccs/postcode/{postcode}
## PUT/cases/{caseId}
## GET/cases/{caseId}
## GET/cases/ref/{reference}
## GET/cases/{caseId}/launch
## POST/cases/{caseId}/fulfilment/post
## POST/cases/{caseId}/fulfilment/sms
## GET/fulfilments
## POST/cases/{caseId}/refusal
1. The provided caseType (HH|CE|SPG) will be used as the addressType and caseType if the estabType of OTHER is provided, else the addressType and caseType derived from the provided estabType is used.
If the provided caseType does not match the derived type from the estabType, a BAD_REQUEST response is returned.
2. If the caseType is CE, then a value greater than zero must be provided for the ceUsualResidents field

# ASSISTED_DIGITAL
## GET/addresses
## GET/addresses/postcode
## GET/cases/uprn/{uprn}
## GET/cases/{caseId}/uac

# SCHEMA
## EstabType
Each EstabType is mapped internally to a corresponding AddressType (Which mirrors the codification of the primary CaseTypes HH|CE|SPG).
This mapping is used by the service to derive a CaseType/AddressType from an EstabType.
The current mapping is as follows:

| EstabType | Case/AddressType |
|------------------------------|---|
| HALL_OF_RESIDENCE | CE |
| CARE_HOME | CE |
| HOSPITAL | CE |
| HOSPICE | CE |
| MENTAL_HEALTH_HOSPITAL | CE |
| MEDICAL_CARE_OTHER | CE |
| BOARDING_SCHOOL | CE |
| LOW_OR_MEDIUM_SECURE_MENTAL_HEALTH | CE |
| HIGH_SECURE_MENTAL_HEALTH | CE |
| HOTEL | CE |
| YOUTH_HOSTEL | CE |
| HOSTEL | CE |
| MILITARY_SLA | CE |
| MILITARY_US | CE |
| RELIGIOUS_COMMUNITY | CE |
| RESIDENTIAL_CHILDRENS_HOME | CE |
| EDUCATION_OTHER | CE |
| PRISON | CE |
| IMMIGRATION_REMOVAL_CENTRE | CE |
| APPROVED_PREMISES | CE |
| ROUGH_SLEEPER | CE |
| STAFF_ACCOMMODATION | CE |
| CAMPHILL | CE |
| HOLIDAY_PARK | CE |
| HOUSEHOLD | HH |
| SHELTERED_ACCOMMODATION | HH |
| RESIDENTIAL_CARAVAN | HH |
| RESIDENTIAL_BOAT | HH |
| GATED_APARTMENTS | HH |
| MOD_HOUSEHOLDS | HH |
| FOREIGN_OFFICES | HH |
| CASTLES | HH |
| GRT_SITE | HH |
| MILITARY_SFA | SPG |
| EMBASSY | SPG |
| ROYAL_HOUSEHOLD | SPG |
| CARAVAN_SITE | SPG |
| MARINA | SPG |
| TRAVELLING_PERSONS | SPG |
| TRANSIENT_PERSONS | SPG |

