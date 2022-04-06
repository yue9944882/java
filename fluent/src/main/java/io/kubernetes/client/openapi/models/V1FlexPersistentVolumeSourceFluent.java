package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1FlexPersistentVolumeSourceFluent<A extends V1FlexPersistentVolumeSourceFluent<A>> extends Fluent<A>{
  public String getDriver();
  public A withDriver(java.lang.String driver);
  public Boolean hasDriver();
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  public A addToOptions(java.lang.String key,java.lang.String value);
  public A addToOptions(Map<java.lang.String,java.lang.String> map);
  public A removeFromOptions(java.lang.String key);
  public A removeFromOptions(java.util.Map<java.lang.String,java.lang.String> map);
  public java.util.Map<java.lang.String,java.lang.String> getOptions();
  public <K,V>A withOptions(java.util.Map<java.lang.String,java.lang.String> options);
  public java.lang.Boolean hasOptions();
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
  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1FlexPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}