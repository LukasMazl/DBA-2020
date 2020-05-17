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
*IotdevicecontrollerApi* | [**createDeviceUsingPOST**](docs/IotdevicecontrollerApi.md#createDeviceUsingPOST) | **POST** /api/v1/device/create | createDevice
*IotdevicecontrollerApi* | [**deleteDeviceUsingPOST**](docs/IotdevicecontrollerApi.md#deleteDeviceUsingPOST) | **POST** /api/v1/device/delete/{serialNumber} | deleteDevice
*IotdevicecontrollerApi* | [**getAllFreeDeviceUsingPOST**](docs/IotdevicecontrollerApi.md#getAllFreeDeviceUsingPOST) | **POST** /api/v1/device/allFree | getAllFreeDevice
*IotdevicecontrollerApi* | [**getDeviceConfigurationUsingPOST**](docs/IotdevicecontrollerApi.md#getDeviceConfigurationUsingPOST) | **POST** /api/v1/device/configuration/{serialNumber} | getDeviceConfiguration
*IotdevicecontrollerApi* | [**recordNewStateUsingPOST**](docs/IotdevicecontrollerApi.md#recordNewStateUsingPOST) | **POST** /api/v1/device/record | recordNewState
*IotdevicecontrollerApi* | [**setDeviceConfigurationUsingPOST**](docs/IotdevicecontrollerApi.md#setDeviceConfigurationUsingPOST) | **POST** /api/v1/device/configuration/set/{serialNumber} | setDeviceConfiguration
*IotdevicecontrollerApi* | [**takeDeviceUsingPOST**](docs/IotdevicecontrollerApi.md#takeDeviceUsingPOST) | **POST** /api/v1/device/setTaken | takeDevice
*IotdevicecontrollerApi* | [**updateDeviceUsingPOST**](docs/IotdevicecontrollerApi.md#updateDeviceUsingPOST) | **POST** /api/v1/device/update/{serialNumber} | updateDevice
*MachinecontrollerApi* | [**createMachineUsingPOST**](docs/MachinecontrollerApi.md#createMachineUsingPOST) | **POST** /api/v1/machine/create | createMachine
*MachinecontrollerApi* | [**deleteMachineUsingPOST**](docs/MachinecontrollerApi.md#deleteMachineUsingPOST) | **POST** /api/v1/machine/delete | deleteMachine
*MachinecontrollerApi* | [**updateMachineUsingPOST**](docs/MachinecontrollerApi.md#updateMachineUsingPOST) | **POST** /api/v1/machine/update/{vin-code} | updateMachine
*ReaddatacontrollerApi* | [**getAllMachinesUsingPOST**](docs/ReaddatacontrollerApi.md#getAllMachinesUsingPOST) | **POST** /api/v1/data/getAllMachines | getAllMachines
*ReaddatacontrollerApi* | [**getRecordsForMachineUsingPOST**](docs/ReaddatacontrollerApi.md#getRecordsForMachineUsingPOST) | **POST** /api/v1/data/machine/{vin} | getRecordsForMachine


## Documentation for Models

 - [AllFreeDeviceDTO](docs/AllFreeDeviceDTO.md)
 - [AllMachineDTO](docs/AllMachineDTO.md)
 - [CreateDeviceDTO](docs/CreateDeviceDTO.md)
 - [CreateDeviceResponse](docs/CreateDeviceResponse.md)
 - [CreateMachineDTO](docs/CreateMachineDTO.md)
 - [CreateMachineResponse](docs/CreateMachineResponse.md)
 - [DeleteDeviceResponse](docs/DeleteDeviceResponse.md)
 - [DeleteMachineDTO](docs/DeleteMachineDTO.md)
 - [DeteleMachineResponse](docs/DeteleMachineResponse.md)
 - [DeviceConfigurationDTO](docs/DeviceConfigurationDTO.md)
 - [DeviceConfigurationEntity](docs/DeviceConfigurationEntity.md)
 - [DeviceConfigurationResponse](docs/DeviceConfigurationResponse.md)
 - [DeviceEntity](docs/DeviceEntity.md)
 - [MachineDTO](docs/MachineDTO.md)
 - [MachineDataRecordDTO](docs/MachineDataRecordDTO.md)
 - [MachineDataRecordsDTO](docs/MachineDataRecordsDTO.md)
 - [MachineEntity](docs/MachineEntity.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [NewDeviceConfigurationDTO](docs/NewDeviceConfigurationDTO.md)
 - [RecordMachineStateDTO](docs/RecordMachineStateDTO.md)
 - [RecordNewStateResponse](docs/RecordNewStateResponse.md)
 - [TakeDeviceDTO](docs/TakeDeviceDTO.md)
 - [TakeDeviceResponse](docs/TakeDeviceResponse.md)
 - [UpdateDeviceDTO](docs/UpdateDeviceDTO.md)
 - [UpdateDeviceResponse](docs/UpdateDeviceResponse.md)
 - [UpdateMachineResponse](docs/UpdateMachineResponse.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



