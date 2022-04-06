package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeConfigSourceFluent<A extends V1NodeConfigSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapNodeConfigSource getConfigMap();
  public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource buildConfigMap();
  public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource configMap);
  public Boolean hasConfigMap();
  public V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap();
  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item);
  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap();
  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap();
  public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item);
  public interface ConfigMapNested<N> extends Nested<N>,V1ConfigMapNodeConfigSourceFluent<V1NodeConfigSourceFluent.ConfigMapNested<N>>{
    public N and();
    public N endConfigMap();
    
  }
  
}