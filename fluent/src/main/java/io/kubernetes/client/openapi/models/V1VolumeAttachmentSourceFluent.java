package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeAttachmentSourceFluent<A extends V1VolumeAttachmentSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeSpec getInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec buildInlineVolumeSpec();
  public A withInlineVolumeSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec inlineVolumeSpec);
  public Boolean hasInlineVolumeSpec();
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);
  public String getPersistentVolumeName();
  public A withPersistentVolumeName(java.lang.String persistentVolumeName);
  public java.lang.Boolean hasPersistentVolumeName();
  public interface InlineVolumeSpecNested<N> extends Nested<N>,V1PersistentVolumeSpecFluent<V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>>{
    public N and();
    public N endInlineVolumeSpec();
    
  }
  
}