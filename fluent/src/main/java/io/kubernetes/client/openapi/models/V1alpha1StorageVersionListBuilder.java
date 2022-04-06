package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1alpha1StorageVersionListBuilder extends V1alpha1StorageVersionListFluentImpl<V1alpha1StorageVersionListBuilder> implements VisitableBuilder<V1alpha1StorageVersionList,io.kubernetes.client.openapi.models.V1alpha1StorageVersionListBuilder>{
  public V1alpha1StorageVersionListBuilder() {
    this(false);
  }
  public V1alpha1StorageVersionListBuilder(Boolean validationEnabled) {
    this(new V1alpha1StorageVersionList(), validationEnabled);
  }
  public V1alpha1StorageVersionListBuilder(V1alpha1StorageVersionListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1StorageVersionListBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersionList(), validationEnabled);
  }
  public V1alpha1StorageVersionListBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionListFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1StorageVersionList instance) {
    this(fluent, instance, false);
  }
  public V1alpha1StorageVersionListBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionListFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1StorageVersionList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1StorageVersionListBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionList instance) {
    this(instance,false);
  }
  public V1alpha1StorageVersionListBuilder(io.kubernetes.client.openapi.models.V1alpha1StorageVersionList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1alpha1StorageVersionListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionList build() {
    V1alpha1StorageVersionList buildable = new V1alpha1StorageVersionList();
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
    V1alpha1StorageVersionListBuilder that = (V1alpha1StorageVersionListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}