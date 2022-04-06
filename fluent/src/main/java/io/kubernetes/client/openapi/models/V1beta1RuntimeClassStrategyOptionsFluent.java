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
public interface V1beta1RuntimeClassStrategyOptionsFluent<A extends V1beta1RuntimeClassStrategyOptionsFluent<A>> extends Fluent<A>{
  public A addToAllowedRuntimeClassNames(Integer index,String item);
  public A setToAllowedRuntimeClassNames(java.lang.Integer index,java.lang.String item);
  public A addToAllowedRuntimeClassNames(java.lang.String... items);
  public A addAllToAllowedRuntimeClassNames(Collection<java.lang.String> items);
  public A removeFromAllowedRuntimeClassNames(java.lang.String... items);
  public A removeAllFromAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getAllowedRuntimeClassNames();
  public java.lang.String getAllowedRuntimeClassName(java.lang.Integer index);
  public java.lang.String getFirstAllowedRuntimeClassName();
  public java.lang.String getLastAllowedRuntimeClassName();
  public java.lang.String getMatchingAllowedRuntimeClassName(Predicate<java.lang.String> predicate);
  public Boolean hasMatchingAllowedRuntimeClassName(java.util.function.Predicate<java.lang.String> predicate);
  public A withAllowedRuntimeClassNames(java.util.List<java.lang.String> allowedRuntimeClassNames);
  public A withAllowedRuntimeClassNames(java.lang.String... allowedRuntimeClassNames);
  public java.lang.Boolean hasAllowedRuntimeClassNames();
  public java.lang.String getDefaultRuntimeClassName();
  public A withDefaultRuntimeClassName(java.lang.String defaultRuntimeClassName);
  public java.lang.Boolean hasDefaultRuntimeClassName();
  
}