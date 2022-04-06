package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EnvVarFluent<A extends V1EnvVarFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(java.lang.String name);
  public Boolean hasName();
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EnvVarSource getValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarSource buildValueFrom();
  public A withValueFrom(io.kubernetes.client.openapi.models.V1EnvVarSource valueFrom);
  public java.lang.Boolean hasValueFrom();
  public V1EnvVarFluent.ValueFromNested<A> withNewValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item);
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item);
  public interface ValueFromNested<N> extends Nested<N>,V1EnvVarSourceFluent<V1EnvVarFluent.ValueFromNested<N>>{
    public N and();
    public N endValueFrom();
    
  }
  
}