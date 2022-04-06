package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TopologySpreadConstraintFluent<A extends V1TopologySpreadConstraintFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getLabelSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector();
  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector);
  public Boolean hasLabelSelector();
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector();
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editLabelSelector();
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelector();
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public Integer getMaxSkew();
  public A withMaxSkew(java.lang.Integer maxSkew);
  public java.lang.Boolean hasMaxSkew();
  public String getTopologyKey();
  public A withTopologyKey(java.lang.String topologyKey);
  public java.lang.Boolean hasTopologyKey();
  public V1TopologySpreadConstraint.WhenUnsatisfiableEnum getWhenUnsatisfiable();
  public A withWhenUnsatisfiable(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint.WhenUnsatisfiableEnum whenUnsatisfiable);
  public java.lang.Boolean hasWhenUnsatisfiable();
  public interface LabelSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1TopologySpreadConstraintFluent.LabelSelectorNested<N>>{
    public N and();
    public N endLabelSelector();
    
  }
  
}