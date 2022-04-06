package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TokenRequestSpecFluent<A extends V1TokenRequestSpecFluent<A>> extends Fluent<A>{
  public A addToAudiences(Integer index,String item);
  public A setToAudiences(java.lang.Integer index,java.lang.String item);
  public A addToAudiences(java.lang.String... items);
  public A addAllToAudiences(Collection<java.lang.String> items);
  public A removeFromAudiences(java.lang.String... items);
  public A removeAllFromAudiences(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getAudiences();
  public java.lang.String getAudience(java.lang.Integer index);
  public java.lang.String getFirstAudience();
  public java.lang.String getLastAudience();
  public java.lang.String getMatchingAudience(Predicate<java.lang.String> predicate);
  public Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate);
  public A withAudiences(java.util.List<java.lang.String> audiences);
  public A withAudiences(java.lang.String... audiences);
  public java.lang.Boolean hasAudiences();
  
  /**
   * This method has been deprecated, please use method buildBoundObjectRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1BoundObjectReference getBoundObjectRef();
  public io.kubernetes.client.openapi.models.V1BoundObjectReference buildBoundObjectRef();
  public A withBoundObjectRef(io.kubernetes.client.openapi.models.V1BoundObjectReference boundObjectRef);
  public java.lang.Boolean hasBoundObjectRef();
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRef();
  public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRefLike(io.kubernetes.client.openapi.models.V1BoundObjectReference item);
  public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editBoundObjectRef();
  public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRef();
  public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRefLike(io.kubernetes.client.openapi.models.V1BoundObjectReference item);
  public Long getExpirationSeconds();
  public A withExpirationSeconds(java.lang.Long expirationSeconds);
  public java.lang.Boolean hasExpirationSeconds();
  public interface BoundObjectRefNested<N> extends Nested<N>,V1BoundObjectReferenceFluent<V1TokenRequestSpecFluent.BoundObjectRefNested<N>>{
    public N and();
    public N endBoundObjectRef();
    
  }
  
}