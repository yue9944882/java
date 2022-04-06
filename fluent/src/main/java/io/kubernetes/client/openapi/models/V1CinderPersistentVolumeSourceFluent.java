package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CinderPersistentVolumeSourceFluent<A extends V1CinderPersistentVolumeSourceFluent<A>> extends Fluent<A>{
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
  public V1SecretReference getSecretRef();
  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();
  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);
  public java.lang.Boolean hasSecretRef();
  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public java.lang.String getVolumeID();
  public A withVolumeID(java.lang.String volumeID);
  public java.lang.Boolean hasVolumeID();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CinderPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}