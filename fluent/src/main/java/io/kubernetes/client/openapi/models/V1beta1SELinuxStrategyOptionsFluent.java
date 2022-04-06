package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1SELinuxStrategyOptionsFluent<A extends V1beta1SELinuxStrategyOptionsFluent<A>> extends Fluent<A>{
  public String getRule();
  public A withRule(java.lang.String rule);
  public Boolean hasRule();
  
  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SELinuxOptions getSeLinuxOptions();
  public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions();
  public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions);
  public java.lang.Boolean hasSeLinuxOptions();
  public V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);
  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);
  public interface SeLinuxOptionsNested<N> extends Nested<N>,V1SELinuxOptionsFluent<V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<N>>{
    public N and();
    public N endSeLinuxOptions();
    
  }
  
}