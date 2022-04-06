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
public interface V1CSINodeSpecFluent<A extends V1CSINodeSpecFluent<A>> extends Fluent<A>{
  public A addToDrivers(Integer index,V1CSINodeDriver item);
  public A setToDrivers(java.lang.Integer index,io.kubernetes.client.openapi.models.V1CSINodeDriver item);
  public A addToDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);
  public A addAllToDrivers(Collection<io.kubernetes.client.openapi.models.V1CSINodeDriver> items);
  public A removeFromDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... items);
  public A removeAllFromDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1CSINodeDriver> items);
  public A removeMatchingFromDrivers(Predicate<V1CSINodeDriverBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildDrivers instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1CSINodeDriver> getDrivers();
  public java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> buildDrivers();
  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildDriver(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildFirstDriver();
  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildLastDriver();
  public io.kubernetes.client.openapi.models.V1CSINodeDriver buildMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
  public Boolean hasMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
  public A withDrivers(java.util.List<io.kubernetes.client.openapi.models.V1CSINodeDriver> drivers);
  public A withDrivers(io.kubernetes.client.openapi.models.V1CSINodeDriver... drivers);
  public java.lang.Boolean hasDrivers();
  public V1CSINodeSpecFluent.DriversNested<A> addNewDriver();
  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> addNewDriverLike(io.kubernetes.client.openapi.models.V1CSINodeDriver item);
  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> setNewDriverLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1CSINodeDriver item);
  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editDriver(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editFirstDriver();
  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editLastDriver();
  public io.kubernetes.client.openapi.models.V1CSINodeSpecFluent.DriversNested<A> editMatchingDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CSINodeDriverBuilder> predicate);
  public interface DriversNested<N> extends Nested<N>,V1CSINodeDriverFluent<V1CSINodeSpecFluent.DriversNested<N>>{
    public N and();
    public N endDriver();
    
  }
  
}