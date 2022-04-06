package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NetworkPolicyIngressRuleBuilder extends V1NetworkPolicyIngressRuleFluentImpl<V1NetworkPolicyIngressRuleBuilder> implements VisitableBuilder<V1NetworkPolicyIngressRule,io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>{
  public V1NetworkPolicyIngressRuleBuilder() {
    this(false);
  }
  public V1NetworkPolicyIngressRuleBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyIngressRule(), validationEnabled);
  }
  public V1NetworkPolicyIngressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyIngressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyIngressRule(), validationEnabled);
  }
  public V1NetworkPolicyIngressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyIngressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFrom(instance.getFrom());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyIngressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule instance) {
    this(instance,false);
  }
  public V1NetworkPolicyIngressRuleBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withFrom(instance.getFrom());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule build() {
    V1NetworkPolicyIngressRule buildable = new V1NetworkPolicyIngressRule();
    buildable.setFrom(fluent.getFrom());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicyIngressRuleBuilder that = (V1NetworkPolicyIngressRuleBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}