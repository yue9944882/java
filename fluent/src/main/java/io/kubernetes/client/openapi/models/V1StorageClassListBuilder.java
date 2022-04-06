package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1StorageClassListBuilder extends V1StorageClassListFluentImpl<V1StorageClassListBuilder> implements VisitableBuilder<io.kubernetes.client.openapi.models.V1StorageClassList,io.kubernetes.client.openapi.models.V1StorageClassListBuilder>{
  public V1StorageClassListBuilder() {
    this(false);
  }
  public V1StorageClassListBuilder(Boolean validationEnabled) {
    this(new V1StorageClassList(), validationEnabled);
  }
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StorageClassListBuilder(io.kubernetes.client.openapi.models.V1StorageClassListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1StorageClassList(), validationEnabled);
  }
  public V1StorageClassListBuilder(io.kubernetes.client.openapi.models.V1StorageClassListFluent<?> fluent,io.kubernetes.client.openapi.models.V1StorageClassList instance) {
    this(fluent, instance, false);
  }
  public V1StorageClassListBuilder(io.kubernetes.client.openapi.models.V1StorageClassListFluent<?> fluent,io.kubernetes.client.openapi.models.V1StorageClassList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1StorageClassListBuilder(io.kubernetes.client.openapi.models.V1StorageClassList instance) {
    this(instance,false);
  }
  public V1StorageClassListBuilder(io.kubernetes.client.openapi.models.V1StorageClassList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1StorageClassListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1StorageClassList build() {
    V1StorageClassList buildable = new V1StorageClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StorageClassListBuilder that = (V1StorageClassListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}