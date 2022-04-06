package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1AllowedFlexVolumeBuilder extends V1beta1AllowedFlexVolumeFluentImpl<V1beta1AllowedFlexVolumeBuilder> implements VisitableBuilder<V1beta1AllowedFlexVolume,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>{
  public V1beta1AllowedFlexVolumeBuilder() {
    this(false);
  }
  public V1beta1AllowedFlexVolumeBuilder(Boolean validationEnabled) {
    this(new V1beta1AllowedFlexVolume(), validationEnabled);
  }
  public V1beta1AllowedFlexVolumeBuilder(V1beta1AllowedFlexVolumeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1AllowedFlexVolumeBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1AllowedFlexVolume(), validationEnabled);
  }
  public V1beta1AllowedFlexVolumeBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance) {
    this(fluent, instance, false);
  }
  public V1beta1AllowedFlexVolumeBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDriver(instance.getDriver());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1AllowedFlexVolumeBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance) {
    this(instance,false);
  }
  public V1beta1AllowedFlexVolumeBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDriver(instance.getDriver());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume build() {
    V1beta1AllowedFlexVolume buildable = new V1beta1AllowedFlexVolume();
    buildable.setDriver(fluent.getDriver());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1AllowedFlexVolumeBuilder that = (V1beta1AllowedFlexVolumeBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}