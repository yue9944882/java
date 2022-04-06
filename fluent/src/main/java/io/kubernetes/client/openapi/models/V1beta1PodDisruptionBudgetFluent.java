package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1PodDisruptionBudgetFluent<A extends V1beta1PodDisruptionBudgetFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public V1beta1PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1PodDisruptionBudgetSpec getSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec spec);
  public java.lang.Boolean hasSpec();
  public V1beta1PodDisruptionBudgetFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec item);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1PodDisruptionBudgetStatus getStatus();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus status);
  public java.lang.Boolean hasStatus();
  public V1beta1PodDisruptionBudgetFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus item);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1beta1PodDisruptionBudgetFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1beta1PodDisruptionBudgetSpecFluent<V1beta1PodDisruptionBudgetFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1beta1PodDisruptionBudgetStatusFluent<V1beta1PodDisruptionBudgetFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}