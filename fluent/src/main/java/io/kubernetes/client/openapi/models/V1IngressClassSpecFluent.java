package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressClassSpecFluent<A extends V1IngressClassSpecFluent<A>> extends Fluent<A>{
  public String getController();
  public A withController(java.lang.String controller);
  public Boolean hasController();
  
  /**
   * This method has been deprecated, please use method buildParameters instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressClassParametersReference getParameters();
  public io.kubernetes.client.openapi.models.V1IngressClassParametersReference buildParameters();
  public A withParameters(io.kubernetes.client.openapi.models.V1IngressClassParametersReference parameters);
  public java.lang.Boolean hasParameters();
  public V1IngressClassSpecFluent.ParametersNested<A> withNewParameters();
  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> withNewParametersLike(io.kubernetes.client.openapi.models.V1IngressClassParametersReference item);
  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editParameters();
  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editOrNewParameters();
  public io.kubernetes.client.openapi.models.V1IngressClassSpecFluent.ParametersNested<A> editOrNewParametersLike(io.kubernetes.client.openapi.models.V1IngressClassParametersReference item);
  public interface ParametersNested<N> extends Nested<N>,V1IngressClassParametersReferenceFluent<V1IngressClassSpecFluent.ParametersNested<N>>{
    public N and();
    public N endParameters();
    
  }
  
}