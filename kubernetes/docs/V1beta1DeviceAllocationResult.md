

# V1beta1DeviceAllocationResult

DeviceAllocationResult is the result of allocating devices.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**List&lt;V1beta1DeviceAllocationConfiguration&gt;**](V1beta1DeviceAllocationConfiguration.md) | This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.  This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters. |  [optional] |
|**results** | [**List&lt;V1beta1DeviceRequestAllocationResult&gt;**](V1beta1DeviceRequestAllocationResult.md) | Results lists all allocated devices. |  [optional] |



