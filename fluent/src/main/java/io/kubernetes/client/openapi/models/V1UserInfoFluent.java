package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1UserInfoFluent<A extends V1UserInfoFluent<A>> extends Fluent<A>{
  public A addToExtra(String key,List<java.lang.String> value);
  public A addToExtra(Map<java.lang.String,java.util.List<java.lang.String>> map);
  public A removeFromExtra(java.lang.String key);
  public A removeFromExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
  public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getExtra();
  public <K,V>A withExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> extra);
  public Boolean hasExtra();
  public A addToGroups(Integer index,java.lang.String item);
  public A setToGroups(java.lang.Integer index,java.lang.String item);
  public A addToGroups(java.lang.String... items);
  public A addAllToGroups(Collection<java.lang.String> items);
  public A removeFromGroups(java.lang.String... items);
  public A removeAllFromGroups(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getGroups();
  public java.lang.String getGroup(java.lang.Integer index);
  public java.lang.String getFirstGroup();
  public java.lang.String getLastGroup();
  public java.lang.String getMatchingGroup(Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
  public A withGroups(java.util.List<java.lang.String> groups);
  public A withGroups(java.lang.String... groups);
  public java.lang.Boolean hasGroups();
  public java.lang.String getUid();
  public A withUid(java.lang.String uid);
  public java.lang.Boolean hasUid();
  public java.lang.String getUsername();
  public A withUsername(java.lang.String username);
  public java.lang.Boolean hasUsername();
  
}