The swagger-current.yml in this project details the API implemented by the current release candidate of the Contact Centre Service, assuming it itself is dependent on the HEAD of this repo.

The swagger-future.yml details the planned API for a future release, and it's primary purpose is to facilitate discussion and understanding of upcoming changes.

While swagger can describe the request parameters for each endpoint, path parameters, and response objects, there are finer details which cannot be expressed in swagger, and it is the purpose of
this document to capture and communicate some of these finer business rules.

The swagger is published to [swaggerhub](https://app.swaggerhub.com/apis/philwhiles/ons-contact_centre_api/5.10.7-oas3) to aid viewing - be sure to select the correct version.


# GENERAL
## GET/version
1. The version endpoint reports the version of the swagger which the service instance is implemented to satisfy. Bear in mind that the version reported by a service instance will most likely 
be behind that of the swagger-current.yml in this repo, as the swagger-current version reflects that of a future release candidate, not that of the instance deployed to a particular environment.

# CONTACT_CENTRE
## GET/addresses

## GET/addresses/postcode

## POST/cases

## POST/cases/{caseId}/invalidate

## GET/cases/uprn/{uprn}

## GET/cases/ccs/postcode/{postcode}
1. If the postcode used is not within a CCS catchment/sample, the endpoint will respond with a BAD_REQUEST code and the message 
"The requested postcode is not within the CCS sample"

## PUT/cases/{caseId}

## GET/cases/{caseId}

## GET/cases/ref/{reference}

## GET/cases/{caseId}/launch
1. For certain cases it will occasionally not be possible to create the launch url due to downstream components needing to catch up. 
On the rare occasion that a 202 response is returned, after a short pause, subsequent requests with the same case id will always get a 200.
2. It will not be possible to launch a questionnaire for CE Managers in Northern Ireland. If such a request is made a BAD_REQUEST response will be returned
containing the message "All Northern Ireland calls from CE Managers are to be escalated to the NI management team"
3. It will not be allowed to launch a CE manager questionnaire if the Case is of type 'CE' and the address associated with the case is an individual unit ie a resident. 
If such a request is made a BAD_REQUEST response will be returned with the message "A CE Manager form can only be launched against an establishment address not a UNIT."

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

