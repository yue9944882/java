package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyStatusBuilder extends V1NetworkPolicyStatusFluent<V1NetworkPolicyStatusBuilder> implements VisitableBuilder<V1NetworkPolicyStatus,V1NetworkPolicyStatusBuilder>{
  public V1NetworkPolicyStatusBuilder() {
    this(new V1NetworkPolicyStatus());
  }
  
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatusFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyStatus());
  }
  
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatusFluent<?> fluent,V1NetworkPolicyStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyStatusBuilder(V1NetworkPolicyStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyStatusFluent<?> fluent;
  
  public V1NetworkPolicyStatus build() {
    V1NetworkPolicyStatus buildable = new V1NetworkPolicyStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}