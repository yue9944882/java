package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StorageOSVolumeSourceFluent<A extends V1StorageOSVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(java.lang.String fsType);
  public Boolean hasFsType();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef();
  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef();
  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef);
  public java.lang.Boolean hasSecretRef();
  public V1StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
  public java.lang.String getVolumeName();
  public A withVolumeName(java.lang.String volumeName);
  public java.lang.Boolean hasVolumeName();
  public java.lang.String getVolumeNamespace();
  public A withVolumeNamespace(java.lang.String volumeNamespace);
  public java.lang.Boolean hasVolumeNamespace();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1StorageOSVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}