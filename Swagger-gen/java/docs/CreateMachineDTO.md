
# CreateMachineDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  |  [optional]
**machineEntityState** | [**MachineEntityStateEnum**](#MachineEntityStateEnum) |  |  [optional]
**machineTypeEntity** | [**MachineTypeEntityEnum**](#MachineTypeEntityEnum) |  |  [optional]
**manufacturer** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**vin** | **String** |  |  [optional]


<a name="MachineEntityStateEnum"></a>
## Enum: MachineEntityStateEnum
Name | Value
---- | -----
MOVING | &quot;MOVING&quot;
STOPPED | &quot;STOPPED&quot;
WORKING | &quot;WORKING&quot;
REMOVED | &quot;REMOVED&quot;


<a name="MachineTypeEntityEnum"></a>
## Enum: MachineTypeEntityEnum
Name | Value
---- | -----
TRACTOR | &quot;TRACTOR&quot;
COMBINE | &quot;COMBINE&quot;
CAR | &quot;CAR&quot;
TRACK | &quot;TRACK&quot;
GRADER | &quot;GRADER&quot;



