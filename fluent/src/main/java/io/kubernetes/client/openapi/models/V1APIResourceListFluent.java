package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1APIResourceListFluent<A extends V1APIResourceListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public Boolean hasApiVersion();
  public java.lang.String getGroupVersion();
  public A withGroupVersion(java.lang.String groupVersion);
  public java.lang.Boolean hasGroupVersion();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  public A addToResources(Integer index,V1APIResource item);
  public A setToResources(java.lang.Integer index,io.kubernetes.client.openapi.models.V1APIResource item);
  public A addToResources(io.kubernetes.client.openapi.models.V1APIResource... items);
  public A addAllToResources(Collection<io.kubernetes.client.openapi.models.V1APIResource> items);
  public A removeFromResources(io.kubernetes.client.openapi.models.V1APIResource... items);
  public A removeAllFromResources(java.util.Collection<io.kubernetes.client.openapi.models.V1APIResource> items);
  public A removeMatchingFromResources(Predicate<V1APIResourceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1APIResource> getResources();
  public java.util.List<io.kubernetes.client.openapi.models.V1APIResource> buildResources();
  public io.kubernetes.client.openapi.models.V1APIResource buildResource(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1APIResource buildFirstResource();
  public io.kubernetes.client.openapi.models.V1APIResource buildLastResource();
  public io.kubernetes.client.openapi.models.V1APIResource buildMatchingResource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
  public java.lang.Boolean hasMatchingResource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
  public A withResources(java.util.List<io.kubernetes.client.openapi.models.V1APIResource> resources);
  public A withResources(io.kubernetes.client.openapi.models.V1APIResource... resources);
  public java.lang.Boolean hasResources();
  public V1APIResourceListFluent.ResourcesNested<A> addNewResource();
  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> addNewResourceLike(io.kubernetes.client.openapi.models.V1APIResource item);
  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> setNewResourceLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1APIResource item);
  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editResource(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editFirstResource();
  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editLastResource();
  public io.kubernetes.client.openapi.models.V1APIResourceListFluent.ResourcesNested<A> editMatchingResource(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIResourceBuilder> predicate);
  public interface ResourcesNested<N> extends Nested<N>,V1APIResourceFluent<V1APIResourceListFluent.ResourcesNested<N>>{
    public N and();
    public N endResource();
    
  }
  
}