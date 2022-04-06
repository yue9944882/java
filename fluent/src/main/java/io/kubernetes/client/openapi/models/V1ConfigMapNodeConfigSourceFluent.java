package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ConfigMapNodeConfigSourceFluent<A extends V1ConfigMapNodeConfigSourceFluent<A>> extends Fluent<A>{
  public String getKubeletConfigKey();
  public A withKubeletConfigKey(java.lang.String kubeletConfigKey);
  public Boolean hasKubeletConfigKey();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  public java.lang.String getNamespace();
  public A withNamespace(java.lang.String namespace);
  public java.lang.Boolean hasNamespace();
  public java.lang.String getResourceVersion();
  public A withResourceVersion(java.lang.String resourceVersion);
  public java.lang.Boolean hasResourceVersion();
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  
}