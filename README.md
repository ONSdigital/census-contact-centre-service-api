This is the Census Contact Centre Service public API model project.

It simply contains the representation objects sent/returned to/from the Contact Centre Service REST endpoints and
its swagger API

# Creating a release artifact
There are no additional steps required to generate a release artifact. Travis takes care of all of this.

## When is a release artifact generated
A release artifact is generated by travis when the branch you are working on has been merged back.

## What does travis do when my code is merged back
1. Travis will do a `mvn -B test`. This will build and test the code as usual
1. Travis will run `mvn -B release:prepare` which will prepare the project to be released
1. Travis will run `mvn -B release:perform` which will create a release artifact and bump the version ready for development again

## What does the version bump look like?
If you are developing on version `0.0.1-SNAPSHOT` `mvn -B release:prepare` and `mvn -B release:perform` will create an artifact of version `0.0.1` in artifactory and bump the version to `0.0.2-SNAPSHOT` ready for the next changes to worked on and released.

# Code Styler
To use the code styler please goto this url (https://github.com/google/google-java-format) and follow the Intellij instructions or Eclipse depending on what you use
