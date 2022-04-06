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
public interface V1TopologySelectorTermFluent<A extends V1TopologySelectorTermFluent<A>> extends Fluent<A>{
  public A addToMatchLabelExpressions(Integer index,V1TopologySelectorLabelRequirement item);
  public A setToMatchLabelExpressions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
  public A addToMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);
  public A addAllToMatchLabelExpressions(Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> items);
  public A removeFromMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);
  public A removeAllFromMatchLabelExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> items);
  public A removeMatchingFromMatchLabelExpressions(Predicate<V1TopologySelectorLabelRequirementBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchLabelExpressions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> getMatchLabelExpressions();
  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> buildMatchLabelExpressions();
  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildMatchLabelExpression(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildFirstMatchLabelExpression();
  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildLastMatchLabelExpression();
  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
  public Boolean hasMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
  public A withMatchLabelExpressions(java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement> matchLabelExpressions);
  public A withMatchLabelExpressions(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... matchLabelExpressions);
  public java.lang.Boolean hasMatchLabelExpressions();
  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression();
  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);
  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editFirstMatchLabelExpression();
  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression();
  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> predicate);
  public interface MatchLabelExpressionsNested<N> extends Nested<N>,V1TopologySelectorLabelRequirementFluent<V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>>{
    public N and();
    public N endMatchLabelExpression();
    
  }
  
}