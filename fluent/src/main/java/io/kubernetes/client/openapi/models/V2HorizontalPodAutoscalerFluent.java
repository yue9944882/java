package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerFluent<A extends V2HorizontalPodAutoscalerFluent<A>> extends Fluent<A>{
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
  public V2HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2HorizontalPodAutoscalerSpec getSpec();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec spec);
  public java.lang.Boolean hasSpec();
  public V2HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2HorizontalPodAutoscalerStatus getStatus();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus status);
  public java.lang.Boolean hasStatus();
  public V2HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V2HorizontalPodAutoscalerFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,V2HorizontalPodAutoscalerSpecFluent<V2HorizontalPodAutoscalerFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,V2HorizontalPodAutoscalerStatusFluent<V2HorizontalPodAutoscalerFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}