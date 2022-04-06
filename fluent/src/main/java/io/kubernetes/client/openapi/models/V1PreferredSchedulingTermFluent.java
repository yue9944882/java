package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PreferredSchedulingTermFluent<A extends V1PreferredSchedulingTermFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildPreference instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelectorTerm getPreference();
  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildPreference();
  public A withPreference(io.kubernetes.client.openapi.models.V1NodeSelectorTerm preference);
  public Boolean hasPreference();
  public V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreference();
  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> withNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> editPreference();
  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreference();
  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluent.PreferenceNested<A> editOrNewPreferenceLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
  public Integer getWeight();
  public A withWeight(java.lang.Integer weight);
  public java.lang.Boolean hasWeight();
  public interface PreferenceNested<N> extends Nested<N>,V1NodeSelectorTermFluent<V1PreferredSchedulingTermFluent.PreferenceNested<N>>{
    public N and();
    public N endPreference();
    
  }
  
}