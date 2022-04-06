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
public interface V1TokenReviewSpecFluent<A extends V1TokenReviewSpecFluent<A>> extends Fluent<A>{
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
  public java.lang.String getToken();
  public A withToken(java.lang.String token);
  public java.lang.Boolean hasToken();
  
}