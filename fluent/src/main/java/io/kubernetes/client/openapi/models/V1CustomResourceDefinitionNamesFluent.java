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
public interface V1CustomResourceDefinitionNamesFluent<A extends V1CustomResourceDefinitionNamesFluent<A>> extends Fluent<A>{
  public A addToCategories(Integer index,String item);
  public A setToCategories(java.lang.Integer index,java.lang.String item);
  public A addToCategories(java.lang.String... items);
  public A addAllToCategories(Collection<java.lang.String> items);
  public A removeFromCategories(java.lang.String... items);
  public A removeAllFromCategories(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getCategories();
  public java.lang.String getCategory(java.lang.Integer index);
  public java.lang.String getFirstCategory();
  public java.lang.String getLastCategory();
  public java.lang.String getMatchingCategory(Predicate<java.lang.String> predicate);
  public Boolean hasMatchingCategory(java.util.function.Predicate<java.lang.String> predicate);
  public A withCategories(java.util.List<java.lang.String> categories);
  public A withCategories(java.lang.String... categories);
  public java.lang.Boolean hasCategories();
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  public java.lang.String getListKind();
  public A withListKind(java.lang.String listKind);
  public java.lang.Boolean hasListKind();
  public java.lang.String getPlural();
  public A withPlural(java.lang.String plural);
  public java.lang.Boolean hasPlural();
  public A addToShortNames(java.lang.Integer index,java.lang.String item);
  public A setToShortNames(java.lang.Integer index,java.lang.String item);
  public A addToShortNames(java.lang.String... items);
  public A addAllToShortNames(java.util.Collection<java.lang.String> items);
  public A removeFromShortNames(java.lang.String... items);
  public A removeAllFromShortNames(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getShortNames();
  public java.lang.String getShortName(java.lang.Integer index);
  public java.lang.String getFirstShortName();
  public java.lang.String getLastShortName();
  public java.lang.String getMatchingShortName(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingShortName(java.util.function.Predicate<java.lang.String> predicate);
  public A withShortNames(java.util.List<java.lang.String> shortNames);
  public A withShortNames(java.lang.String... shortNames);
  public java.lang.Boolean hasShortNames();
  public java.lang.String getSingular();
  public A withSingular(java.lang.String singular);
  public java.lang.Boolean hasSingular();
  
}