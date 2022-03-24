# spring-framework-issue-28209
To demonstrate the issue described in https://github.com/spring-projects/spring-framework/issues/28209

## To show the issue:

Run `mvn clean spring-boot:run` - application fails to start up, with errors.

## To work around:

1. Switch ExampleInterface from using the lambda
2. Run `mvn clean spring-boot:run` command as above - application starts up properly.
