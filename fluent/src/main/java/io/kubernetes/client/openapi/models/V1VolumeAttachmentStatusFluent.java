package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1VolumeAttachmentStatusFluent<A extends V1VolumeAttachmentStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAttachError instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeError getAttachError();
  public io.kubernetes.client.openapi.models.V1VolumeError buildAttachError();
  public A withAttachError(io.kubernetes.client.openapi.models.V1VolumeError attachError);
  public Boolean hasAttachError();
  public V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachError();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editAttachError();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachError();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
  public java.lang.Boolean getAttached();
  public A withAttached(java.lang.Boolean attached);
  public java.lang.Boolean hasAttached();
  public A addToAttachmentMetadata(String key,java.lang.String value);
  public A addToAttachmentMetadata(Map<java.lang.String,java.lang.String> map);
  public A removeFromAttachmentMetadata(java.lang.String key);
  public A removeFromAttachmentMetadata(java.util.Map<java.lang.String,java.lang.String> map);
  public java.util.Map<java.lang.String,java.lang.String> getAttachmentMetadata();
  public <K,V>A withAttachmentMetadata(java.util.Map<java.lang.String,java.lang.String> attachmentMetadata);
  public java.lang.Boolean hasAttachmentMetadata();
  
  /**
   * This method has been deprecated, please use method buildDetachError instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeError getDetachError();
  public io.kubernetes.client.openapi.models.V1VolumeError buildDetachError();
  public A withDetachError(io.kubernetes.client.openapi.models.V1VolumeError detachError);
  public java.lang.Boolean hasDetachError();
  public V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachError();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editDetachError();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachError();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
  public A withAttached();
  public interface AttachErrorNested<N> extends Nested<N>,V1VolumeErrorFluent<V1VolumeAttachmentStatusFluent.AttachErrorNested<N>>{
    public N and();
    public N endAttachError();
    
  }
  public interface DetachErrorNested<N> extends io.kubernetes.client.fluent.Nested<N>,V1VolumeErrorFluent<V1VolumeAttachmentStatusFluent.DetachErrorNested<N>>{
    public N and();
    public N endDetachError();
    
  }
  
}