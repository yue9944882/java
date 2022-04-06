package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1IngressTLSFluent<A extends V1IngressTLSFluent<A>> extends Fluent<A>{
  public A addToHosts(Integer index,String item);
  public A setToHosts(java.lang.Integer index,java.lang.String item);
  public A addToHosts(java.lang.String... items);
  public A addAllToHosts(Collection<java.lang.String> items);
  public A removeFromHosts(java.lang.String... items);
  public A removeAllFromHosts(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getHosts();
  public java.lang.String getHost(java.lang.Integer index);
  public java.lang.String getFirstHost();
  public java.lang.String getLastHost();
  public java.lang.String getMatchingHost(Predicate<java.lang.String> predicate);
  public Boolean hasMatchingHost(java.util.function.Predicate<java.lang.String> predicate);
  public A withHosts(java.util.List<java.lang.String> hosts);
  public A withHosts(java.lang.String... hosts);
  public java.lang.Boolean hasHosts();
  public java.lang.String getSecretName();
  public A withSecretName(java.lang.String secretName);
  public java.lang.Boolean hasSecretName();
  
}