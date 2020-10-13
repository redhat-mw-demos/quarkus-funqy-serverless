# Quakus-funqy-serverless project

This project uses Quarkus Funqy to deploy a function to AWS Lambda as well as OpenShift Serverless.

If you want to learn more about FUNQY AMAZON LAMBDA BINDING, please visit its website: https://quarkus.io/guides/funqy-amazon-lambda .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw quarkus:dev
```

## Only for AWS Lambda deployment

Add the following configuration in application.properties
```
quarkus.funqy.export=greeter
```

## Only for OpenShift Serverless deployment

Add the following configuration in application.properties
```
quarkus.container-image.build=true
quarkus.container-image.group=serverless-funqy
quarkus.container-image.registry=image-registry.openshift-image-registry.svc:5000
quarkus.kubernetes.deployment-target=knative
quarkus.kubernetes-client.trust-certs=true
quarkus.kubernetes.deploy=true
quarkus.openshift.expose=true
quarkus.openshift.labels.app.openshift.io/runtime=quarkus

// Only native compliation
quarkus.native.container-build=true
quarkus.native.builder-image=quay.io/quarkus/ubi-quarkus-mandrel:20.1-java11
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package -DskipTests
```

If you want to package a native executable, append `-Pnative` in the above maven command line.

# Demo Video for OpenShift Serverless
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/fQFVwoXWRto/0.jpg)](https://www.youtube.com/watch?v=fQFVwoXWRto)

# Only for AWS Lambda deployemnt

Run the `manage.sh` that is generated when you run `mvn clean package -DskipTests`:

```
LAMBDA_ROLE_ARN=<YOUR_ARN> sh target/manage.sh create
```

# Demo Video for AWS Lambda
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/BFG2LZIhzOw/0.jpg)](https://www.youtube.com/watch?v=BFG2LZIhzOw)
