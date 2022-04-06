package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1ResourceQuotaSpecFluent<A extends V1ResourceQuotaSpecFluent<A>> extends Fluent<A>{
  public A addToHard(String key,Quantity value);
  public A addToHard(Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public A removeFromHard(java.lang.String key);
  public A removeFromHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
  public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getHard();
  public <K,V>A withHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> hard);
  public Boolean hasHard();
  
  /**
   * This method has been deprecated, please use method buildScopeSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScopeSelector getScopeSelector();
  public io.kubernetes.client.openapi.models.V1ScopeSelector buildScopeSelector();
  public A withScopeSelector(io.kubernetes.client.openapi.models.V1ScopeSelector scopeSelector);
  public java.lang.Boolean hasScopeSelector();
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector();
  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item);
  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editScopeSelector();
  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelector();
  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item);
  public A addToScopes(Integer index,java.lang.String item);
  public A setToScopes(java.lang.Integer index,java.lang.String item);
  public A addToScopes(java.lang.String... items);
  public A addAllToScopes(Collection<java.lang.String> items);
  public A removeFromScopes(java.lang.String... items);
  public A removeAllFromScopes(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getScopes();
  public java.lang.String getScope(java.lang.Integer index);
  public java.lang.String getFirstScope();
  public java.lang.String getLastScope();
  public java.lang.String getMatchingScope(Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingScope(java.util.function.Predicate<java.lang.String> predicate);
  public A withScopes(java.util.List<java.lang.String> scopes);
  public A withScopes(java.lang.String... scopes);
  public java.lang.Boolean hasScopes();
  public interface ScopeSelectorNested<N> extends Nested<N>,V1ScopeSelectorFluent<V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>>{
    public N and();
    public N endScopeSelector();
    
  }
  
}