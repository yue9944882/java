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
public interface V1LabelSelectorRequirementFluent<A extends V1LabelSelectorRequirementFluent<A>> extends Fluent<A>{
  public String getKey();
  public A withKey(java.lang.String key);
  public Boolean hasKey();
  public java.lang.String getOperator();
  public A withOperator(java.lang.String operator);
  public java.lang.Boolean hasOperator();
  public A addToValues(Integer index,java.lang.String item);
  public A setToValues(java.lang.Integer index,java.lang.String item);
  public A addToValues(java.lang.String... items);
  public A addAllToValues(Collection<java.lang.String> items);
  public A removeFromValues(java.lang.String... items);
  public A removeAllFromValues(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getValues();
  public java.lang.String getValue(java.lang.Integer index);
  public java.lang.String getFirstValue();
  public java.lang.String getLastValue();
  public java.lang.String getMatchingValue(Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingValue(java.util.function.Predicate<java.lang.String> predicate);
  public A withValues(java.util.List<java.lang.String> values);
  public A withValues(java.lang.String... values);
  public java.lang.Boolean hasValues();
  
}