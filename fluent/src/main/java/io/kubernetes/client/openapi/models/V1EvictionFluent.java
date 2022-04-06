package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EvictionFluent<A extends V1EvictionFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  
  /**
   * This method has been deprecated, please use method buildDeleteOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DeleteOptions getDeleteOptions();
  public io.kubernetes.client.openapi.models.V1DeleteOptions buildDeleteOptions();
  public A withDeleteOptions(io.kubernetes.client.openapi.models.V1DeleteOptions deleteOptions);
  public java.lang.Boolean hasDeleteOptions();
  public V1EvictionFluent.DeleteOptionsNested<A> withNewDeleteOptions();
  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A> withNewDeleteOptionsLike(io.kubernetes.client.openapi.models.V1DeleteOptions item);
  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A> editDeleteOptions();
  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A> editOrNewDeleteOptions();
  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A> editOrNewDeleteOptionsLike(io.kubernetes.client.openapi.models.V1DeleteOptions item);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public V1EvictionFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public interface DeleteOptionsNested<N> extends Nested<N>,V1DeleteOptionsFluent<V1EvictionFluent.DeleteOptionsNested<N>>{
    public N and();
    public N endDeleteOptions();
    
  }
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1ObjectMetaFluent<V1EvictionFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}