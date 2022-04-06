package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import java.util.Collection;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface ApiextensionsV1WebhookClientConfigFluent<A extends ApiextensionsV1WebhookClientConfigFluent<A>> extends Fluent<A>{
  public A withCaBundle(byte... caBundle);
  public byte[] getCaBundle();
  public A addToCaBundle(Integer index,Byte item);
  public A setToCaBundle(java.lang.Integer index,java.lang.Byte item);
  public A addToCaBundle(java.lang.Byte... items);
  public A addAllToCaBundle(Collection<java.lang.Byte> items);
  public A removeFromCaBundle(java.lang.Byte... items);
  public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items);
  public Boolean hasCaBundle();
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @Deprecated
  public ApiextensionsV1ServiceReference getService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference buildService();
  public A withService(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference service);
  public java.lang.Boolean hasService();
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference item);
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewService();
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference item);
  public String getUrl();
  public A withUrl(java.lang.String url);
  public java.lang.Boolean hasUrl();
  public interface ServiceNested<N> extends Nested<N>,ApiextensionsV1ServiceReferenceFluent<ApiextensionsV1WebhookClientConfigFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}