package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeNodeAffinityFluent<A extends V1VolumeNodeAffinityFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildRequired instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getRequired();
  public io.kubernetes.client.openapi.models.V1NodeSelector buildRequired();
  public A withRequired(io.kubernetes.client.openapi.models.V1NodeSelector required);
  public Boolean hasRequired();
  public V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired();
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item);
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editRequired();
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired();
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item);
  public interface RequiredNested<N> extends Nested<N>,V1NodeSelectorFluent<V1VolumeNodeAffinityFluent.RequiredNested<N>>{
    public N and();
    public N endRequired();
    
  }
  
}