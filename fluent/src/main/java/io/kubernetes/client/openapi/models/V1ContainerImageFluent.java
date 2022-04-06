package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1ContainerImageFluent<A extends V1ContainerImageFluent<A>> extends Fluent<A>{
  public A addToNames(Integer index,String item);
  public A setToNames(java.lang.Integer index,java.lang.String item);
  public A addToNames(java.lang.String... items);
  public A addAllToNames(Collection<java.lang.String> items);
  public A removeFromNames(java.lang.String... items);
  public A removeAllFromNames(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getNames();
  public java.lang.String getName(java.lang.Integer index);
  public java.lang.String getFirstName();
  public java.lang.String getLastName();
  public java.lang.String getMatchingName(Predicate<java.lang.String> predicate);
  public Boolean hasMatchingName(java.util.function.Predicate<java.lang.String> predicate);
  public A withNames(java.util.List<java.lang.String> names);
  public A withNames(java.lang.String... names);
  public java.lang.Boolean hasNames();
  public Long getSizeBytes();
  public A withSizeBytes(java.lang.Long sizeBytes);
  public java.lang.Boolean hasSizeBytes();
  
}