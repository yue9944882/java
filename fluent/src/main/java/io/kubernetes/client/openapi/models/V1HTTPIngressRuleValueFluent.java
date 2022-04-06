package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1HTTPIngressRuleValueFluent<A extends V1HTTPIngressRuleValueFluent<A>> extends Fluent<A>{
  public A addToPaths(Integer index,V1HTTPIngressPath item);
  public A setToPaths(java.lang.Integer index,io.kubernetes.client.openapi.models.V1HTTPIngressPath item);
  public A addToPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);
  public A addAllToPaths(Collection<io.kubernetes.client.openapi.models.V1HTTPIngressPath> items);
  public A removeFromPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);
  public A removeAllFromPaths(java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPIngressPath> items);
  public A removeMatchingFromPaths(Predicate<V1HTTPIngressPathBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPaths instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> getPaths();
  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> buildPaths();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildPath(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildFirstPath();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildLastPath();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> predicate);
  public Boolean hasMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> predicate);
  public A withPaths(java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> paths);
  public A withPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... paths);
  public java.lang.Boolean hasPaths();
  public V1HTTPIngressRuleValueFluent.PathsNested<A> addNewPath();
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(io.kubernetes.client.openapi.models.V1HTTPIngressPath item);
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1HTTPIngressPath item);
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> editPath(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath();
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> editLastPath();
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> predicate);
  public interface PathsNested<N> extends Nested<N>,V1HTTPIngressPathFluent<V1HTTPIngressRuleValueFluent.PathsNested<N>>{
    public N and();
    public N endPath();
    
  }
  
}