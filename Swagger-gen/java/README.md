# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BasicerrorcontrollerApi;

import java.io.File;
import java.util.*;

public class BasicerrorcontrollerApiExample {

    public static void main(String[] args) {
        
        BasicerrorcontrollerApi apiInstance = new BasicerrorcontrollerApi();
        try {
            Map<String, Object> result = apiInstance.errorUsingDELETE();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BasicerrorcontrollerApi#errorUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasicerrorcontrollerApi* | [**errorUsingDELETE**](docs/BasicerrorcontrollerApi.md#errorUsingDELETE) | **DELETE** /error | error
*BasicerrorcontrollerApi* | [**errorUsingGET**](docs/BasicerrorcontrollerApi.md#errorUsingGET) | **GET** /error | error
*BasicerrorcontrollerApi* | [**errorUsingHEAD**](docs/BasicerrorcontrollerApi.md#errorUsingHEAD) | **HEAD** /error | error
*BasicerrorcontrollerApi* | [**errorUsingOPTIONS**](docs/BasicerrorcontrollerApi.md#errorUsingOPTIONS) | **OPTIONS** /error | error
*BasicerrorcontrollerApi* | [**errorUsingPATCH**](docs/BasicerrorcontrollerApi.md#errorUsingPATCH) | **PATCH** /error | error
*BasicerrorcontrollerApi* | [**errorUsingPOST**](docs/BasicerrorcontrollerApi.md#errorUsingPOST) | **POST** /error | error
*BasicerrorcontrollerApi* | [**errorUsingPUT**](docs/BasicerrorcontrollerApi.md#errorUsingPUT) | **PUT** /error | error
*DeviceEntityEntityApi* | [**deleteDeviceEntityUsingDELETE**](docs/DeviceEntityEntityApi.md#deleteDeviceEntityUsingDELETE) | **DELETE** /deviceEntities/{id} | deleteDeviceEntity
*DeviceEntityEntityApi* | [**deviceEntityMachineEntityUsingDELETE**](docs/DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingDELETE) | **DELETE** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
*DeviceEntityEntityApi* | [**deviceEntityMachineEntityUsingGET**](docs/DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingGET) | **GET** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
*DeviceEntityEntityApi* | [**deviceEntityMachineEntityUsingPATCH**](docs/DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingPATCH) | **PATCH** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
*DeviceEntityEntityApi* | [**deviceEntityMachineEntityUsingPOST**](docs/DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingPOST) | **POST** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
*DeviceEntityEntityApi* | [**deviceEntityMachineEntityUsingPUT**](docs/DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingPUT) | **PUT** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
*DeviceEntityEntityApi* | [**findAllByMachineEntityIsNullDeviceEntityUsingGET**](docs/DeviceEntityEntityApi.md#findAllByMachineEntityIsNullDeviceEntityUsingGET) | **GET** /deviceEntities/search/findAllByMachineEntityIsNull | findAllByMachineEntityIsNullDeviceEntity
*DeviceEntityEntityApi* | [**findAllDeviceEntityUsingGET**](docs/DeviceEntityEntityApi.md#findAllDeviceEntityUsingGET) | **GET** /deviceEntities | findAllDeviceEntity
*DeviceEntityEntityApi* | [**findByIdDeviceEntityUsingGET**](docs/DeviceEntityEntityApi.md#findByIdDeviceEntityUsingGET) | **GET** /deviceEntities/{id} | findByIdDeviceEntity
*DeviceEntityEntityApi* | [**saveDeviceEntityUsingPATCH**](docs/DeviceEntityEntityApi.md#saveDeviceEntityUsingPATCH) | **PATCH** /deviceEntities/{id} | saveDeviceEntity
*DeviceEntityEntityApi* | [**saveDeviceEntityUsingPOST**](docs/DeviceEntityEntityApi.md#saveDeviceEntityUsingPOST) | **POST** /deviceEntities | saveDeviceEntity
*DeviceEntityEntityApi* | [**saveDeviceEntityUsingPUT**](docs/DeviceEntityEntityApi.md#saveDeviceEntityUsingPUT) | **PUT** /deviceEntities/{id} | saveDeviceEntity
*MachineEntityEntityApi* | [**deleteMachineEntityUsingDELETE**](docs/MachineEntityEntityApi.md#deleteMachineEntityUsingDELETE) | **DELETE** /machineEntities/{id} | deleteMachineEntity
*MachineEntityEntityApi* | [**findAllMachineEntityUsingGET**](docs/MachineEntityEntityApi.md#findAllMachineEntityUsingGET) | **GET** /machineEntities | findAllMachineEntity
*MachineEntityEntityApi* | [**findByIdMachineEntityUsingGET**](docs/MachineEntityEntityApi.md#findByIdMachineEntityUsingGET) | **GET** /machineEntities/{id} | findByIdMachineEntity
*MachineEntityEntityApi* | [**findByVinMachineEntityUsingGET**](docs/MachineEntityEntityApi.md#findByVinMachineEntityUsingGET) | **GET** /machineEntities/search/findByVin | findByVinMachineEntity
*MachineEntityEntityApi* | [**machineEntityDeviceEntityUsingDELETE**](docs/MachineEntityEntityApi.md#machineEntityDeviceEntityUsingDELETE) | **DELETE** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
*MachineEntityEntityApi* | [**machineEntityDeviceEntityUsingGET**](docs/MachineEntityEntityApi.md#machineEntityDeviceEntityUsingGET) | **GET** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
*MachineEntityEntityApi* | [**machineEntityDeviceEntityUsingPATCH**](docs/MachineEntityEntityApi.md#machineEntityDeviceEntityUsingPATCH) | **PATCH** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
*MachineEntityEntityApi* | [**machineEntityDeviceEntityUsingPOST**](docs/MachineEntityEntityApi.md#machineEntityDeviceEntityUsingPOST) | **POST** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
*MachineEntityEntityApi* | [**machineEntityDeviceEntityUsingPUT**](docs/MachineEntityEntityApi.md#machineEntityDeviceEntityUsingPUT) | **PUT** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
*MachineEntityEntityApi* | [**saveMachineEntityUsingPATCH**](docs/MachineEntityEntityApi.md#saveMachineEntityUsingPATCH) | **PATCH** /machineEntities/{id} | saveMachineEntity
*MachineEntityEntityApi* | [**saveMachineEntityUsingPOST**](docs/MachineEntityEntityApi.md#saveMachineEntityUsingPOST) | **POST** /machineEntities | saveMachineEntity
*MachineEntityEntityApi* | [**saveMachineEntityUsingPUT**](docs/MachineEntityEntityApi.md#saveMachineEntityUsingPUT) | **PUT** /machineEntities/{id} | saveMachineEntity
*ProfilecontrollerApi* | [**listAllFormsOfMetadataUsingGET**](docs/ProfilecontrollerApi.md#listAllFormsOfMetadataUsingGET) | **GET** /profile | listAllFormsOfMetadata
*ProfilecontrollerApi* | [**profileOptionsUsingOPTIONS**](docs/ProfilecontrollerApi.md#profileOptionsUsingOPTIONS) | **OPTIONS** /profile | profileOptions


## Documentation for Models

 - [CollectionModelDeviceEntity](docs/CollectionModelDeviceEntity.md)
 - [CollectionModelMachineEntity](docs/CollectionModelMachineEntity.md)
 - [DeviceConfigurationEntity](docs/DeviceConfigurationEntity.md)
 - [DeviceEntity](docs/DeviceEntity.md)
 - [EntityModelDeviceEntity](docs/EntityModelDeviceEntity.md)
 - [EntityModelMachineEntity](docs/EntityModelMachineEntity.md)
 - [Links](docs/Links.md)
 - [MachineEntity](docs/MachineEntity.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [RepresentationModelobject](docs/RepresentationModelobject.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



