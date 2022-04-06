package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ControllerRevisionFluent<A extends V1ControllerRevisionFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public Object getData();
  public A withData(java.lang.Object data);
  public java.lang.Boolean hasData();
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
  public V1ControllerRevisionFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1ControllerRevisionFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1ControllerRevisionFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1ControllerRevisionFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1ControllerRevisionFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public Long getRevision();
  public A withRevision(java.lang.Long revision);
  public java.lang.Boolean hasRevision();
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ControllerRevisionFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}