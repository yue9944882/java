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
public interface V1ExecActionFluent<A extends V1ExecActionFluent<A>> extends Fluent<A>{
  public A addToCommand(Integer index,String item);
  public A setToCommand(java.lang.Integer index,java.lang.String item);
  public A addToCommand(java.lang.String... items);
  public A addAllToCommand(Collection<java.lang.String> items);
  public A removeFromCommand(java.lang.String... items);
  public A removeAllFromCommand(java.util.Collection<java.lang.String> items);
  public List<java.lang.String> getCommand();
  public java.lang.String getCommand(java.lang.Integer index);
  public java.lang.String getFirstCommand();
  public java.lang.String getLastCommand();
  public java.lang.String getMatchingCommand(Predicate<java.lang.String> predicate);
  public Boolean hasMatchingCommand(java.util.function.Predicate<java.lang.String> predicate);
  public A withCommand(java.util.List<java.lang.String> command);
  public A withCommand(java.lang.String... command);
  public java.lang.Boolean hasCommand();
  
}