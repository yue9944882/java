package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceDefinitionVersionFluent<A extends V1CustomResourceDefinitionVersionFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceDefinitionVersionFluent() {
  }
  
  public V1CustomResourceDefinitionVersionFluent(V1CustomResourceDefinitionVersion instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1CustomResourceColumnDefinitionBuilder> additionalPrinterColumns;
  private Boolean deprecated;
  private String deprecationWarning;
  private String name;
  private V1CustomResourceValidationBuilder schema;
  private Boolean served;
  private Boolean storage;
  private V1CustomResourceSubresourcesBuilder subresources;
  
  protected void copyInstance(V1CustomResourceDefinitionVersion instance) {
    instance = (instance != null ? instance : new V1CustomResourceDefinitionVersion());
    if (instance != null) {
          this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
          this.withDeprecated(instance.getDeprecated());
          this.withDeprecationWarning(instance.getDeprecationWarning());
          this.withName(instance.getName());
          this.withSchema(instance.getSchema());
          this.withServed(instance.getServed());
          this.withStorage(instance.getStorage());
          this.withSubresources(instance.getSubresources());
        }
  }
  
  public A addToAdditionalPrinterColumns(int index,V1CustomResourceColumnDefinition item) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);
    if (index < 0 || index >= additionalPrinterColumns.size()) { _visitables.get("additionalPrinterColumns").add(builder); additionalPrinterColumns.add(builder); } else { _visitables.get("additionalPrinterColumns").add(index, builder); additionalPrinterColumns.add(index, builder);}
    return (A)this;
  }
  
  public A setToAdditionalPrinterColumns(int index,V1CustomResourceColumnDefinition item) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);
    if (index < 0 || index >= additionalPrinterColumns.size()) { _visitables.get("additionalPrinterColumns").add(builder); additionalPrinterColumns.add(builder); } else { _visitables.get("additionalPrinterColumns").set(index, builder); additionalPrinterColumns.set(index, builder);}
    return (A)this;
  }
  
  public A addToAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
  }
  
  public A addAllToAdditionalPrinterColumns(Collection<V1CustomResourceColumnDefinition> items) {
    if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<V1CustomResourceColumnDefinitionBuilder>();}
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
  }
  
  public A removeFromAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... items) {
    if (this.additionalPrinterColumns == null) return (A)this;
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").remove(builder); this.additionalPrinterColumns.remove(builder);} return (A)this;
  }
  
  public A removeAllFromAdditionalPrinterColumns(Collection<V1CustomResourceColumnDefinition> items) {
    if (this.additionalPrinterColumns == null) return (A)this;
    for (V1CustomResourceColumnDefinition item : items) {V1CustomResourceColumnDefinitionBuilder builder = new V1CustomResourceColumnDefinitionBuilder(item);_visitables.get("additionalPrinterColumns").remove(builder); this.additionalPrinterColumns.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromAdditionalPrinterColumns(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
    if (additionalPrinterColumns == null) return (A) this;
    final Iterator<V1CustomResourceColumnDefinitionBuilder> each = additionalPrinterColumns.iterator();
    final List visitables = _visitables.get("additionalPrinterColumns");
    while (each.hasNext()) {
      V1CustomResourceColumnDefinitionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1CustomResourceColumnDefinition> buildAdditionalPrinterColumns() {
    return this.additionalPrinterColumns != null ? build(additionalPrinterColumns) : null;
  }
  
  public V1CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index) {
    return this.additionalPrinterColumns.get(index).build();
  }
  
  public V1CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn() {
    return this.additionalPrinterColumns.get(0).build();
  }
  
  public V1CustomResourceColumnDefinition buildLastAdditionalPrinterColumn() {
    return this.additionalPrinterColumns.get(additionalPrinterColumns.size() - 1).build();
  }
  
  public V1CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
      for (V1CustomResourceColumnDefinitionBuilder item : additionalPrinterColumns) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
      for (V1CustomResourceColumnDefinitionBuilder item : additionalPrinterColumns) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAdditionalPrinterColumns(List<V1CustomResourceColumnDefinition> additionalPrinterColumns) {
    if (this.additionalPrinterColumns != null) {
      this._visitables.get("additionalPrinterColumns").clear();
    }
    if (additionalPrinterColumns != null) {
        this.additionalPrinterColumns = new ArrayList();
        for (V1CustomResourceColumnDefinition item : additionalPrinterColumns) {
          this.addToAdditionalPrinterColumns(item);
        }
    } else {
      this.additionalPrinterColumns = null;
    }
    return (A) this;
  }
  
  public A withAdditionalPrinterColumns(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition... additionalPrinterColumns) {
    if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.clear(); _visitables.remove("additionalPrinterColumns"); }
    if (additionalPrinterColumns != null) {for (V1CustomResourceColumnDefinition item :additionalPrinterColumns){ this.addToAdditionalPrinterColumns(item);}} return (A) this;
  }
  
  public boolean hasAdditionalPrinterColumns() {
    return this.additionalPrinterColumns != null && !this.additionalPrinterColumns.isEmpty();
  }
  
  public AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn() {
    return new AdditionalPrinterColumnsNested(-1, null);
  }
  
  public AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(V1CustomResourceColumnDefinition item) {
    return new AdditionalPrinterColumnsNested(-1, item);
  }
  
  public AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,V1CustomResourceColumnDefinition item) {
    return new AdditionalPrinterColumnsNested(index, item);
  }
  
  public AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index) {
    if (additionalPrinterColumns.size() <= index) throw new RuntimeException("Can't edit additionalPrinterColumns. Index exceeds size.");
    return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
  }
  
  public AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn() {
    if (additionalPrinterColumns.size() == 0) throw new RuntimeException("Can't edit first additionalPrinterColumns. The list is empty.");
    return setNewAdditionalPrinterColumnLike(0, buildAdditionalPrinterColumn(0));
  }
  
  public AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn() {
    int index = additionalPrinterColumns.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last additionalPrinterColumns. The list is empty.");
    return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
  }
  
  public AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(Predicate<V1CustomResourceColumnDefinitionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<additionalPrinterColumns.size();i++) { 
    if (predicate.test(additionalPrinterColumns.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching additionalPrinterColumns. No match found.");
    return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public A withDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return (A) this;
  }
  
  public boolean hasDeprecated() {
    return this.deprecated != null;
  }
  
  public String getDeprecationWarning() {
    return this.deprecationWarning;
  }
  
  public A withDeprecationWarning(String deprecationWarning) {
    this.deprecationWarning = deprecationWarning;
    return (A) this;
  }
  
  public boolean hasDeprecationWarning() {
    return this.deprecationWarning != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public V1CustomResourceValidation buildSchema() {
    return this.schema != null ? this.schema.build() : null;
  }
  
  public A withSchema(V1CustomResourceValidation schema) {
    this._visitables.remove(this.schema);
    if (schema != null) {
        this.schema = new V1CustomResourceValidationBuilder(schema);
        this._visitables.get("schema").add(this.schema);
    } else {
        this.schema = null;
        this._visitables.get("schema").remove(this.schema);
    }
    return (A) this;
  }
  
  public boolean hasSchema() {
    return this.schema != null;
  }
  
  public SchemaNested<A> withNewSchema() {
    return new SchemaNested(null);
  }
  
  public SchemaNested<A> withNewSchemaLike(V1CustomResourceValidation item) {
    return new SchemaNested(item);
  }
  
  public SchemaNested<A> editSchema() {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(null));
  }
  
  public SchemaNested<A> editOrNewSchema() {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(new V1CustomResourceValidationBuilder().build()));
  }
  
  public SchemaNested<A> editOrNewSchemaLike(V1CustomResourceValidation item) {
    return withNewSchemaLike(java.util.Optional.ofNullable(buildSchema()).orElse(item));
  }
  
  public Boolean getServed() {
    return this.served;
  }
  
  public A withServed(Boolean served) {
    this.served = served;
    return (A) this;
  }
  
  public boolean hasServed() {
    return this.served != null;
  }
  
  public Boolean getStorage() {
    return this.storage;
  }
  
  public A withStorage(Boolean storage) {
    this.storage = storage;
    return (A) this;
  }
  
  public boolean hasStorage() {
    return this.storage != null;
  }
  
  public V1CustomResourceSubresources buildSubresources() {
    return this.subresources != null ? this.subresources.build() : null;
  }
  
  public A withSubresources(V1CustomResourceSubresources subresources) {
    this._visitables.remove(this.subresources);
    if (subresources != null) {
        this.subresources = new V1CustomResourceSubresourcesBuilder(subresources);
        this._visitables.get("subresources").add(this.subresources);
    } else {
        this.subresources = null;
        this._visitables.get("subresources").remove(this.subresources);
    }
    return (A) this;
  }
  
  public boolean hasSubresources() {
    return this.subresources != null;
  }
  
  public SubresourcesNested<A> withNewSubresources() {
    return new SubresourcesNested(null);
  }
  
  public SubresourcesNested<A> withNewSubresourcesLike(V1CustomResourceSubresources item) {
    return new SubresourcesNested(item);
  }
  
  public SubresourcesNested<A> editSubresources() {
    return withNewSubresourcesLike(java.util.Optional.ofNullable(buildSubresources()).orElse(null));
  }
  
  public SubresourcesNested<A> editOrNewSubresources() {
    return withNewSubresourcesLike(java.util.Optional.ofNullable(buildSubresources()).orElse(new V1CustomResourceSubresourcesBuilder().build()));
  }
  
  public SubresourcesNested<A> editOrNewSubresourcesLike(V1CustomResourceSubresources item) {
    return withNewSubresourcesLike(java.util.Optional.ofNullable(buildSubresources()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceDefinitionVersionFluent that = (V1CustomResourceDefinitionVersionFluent) o;
    if (!java.util.Objects.equals(additionalPrinterColumns, that.additionalPrinterColumns)) return false;
    if (!java.util.Objects.equals(deprecated, that.deprecated)) return false;
    if (!java.util.Objects.equals(deprecationWarning, that.deprecationWarning)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(schema, that.schema)) return false;
    if (!java.util.Objects.equals(served, that.served)) return false;
    if (!java.util.Objects.equals(storage, that.storage)) return false;
    if (!java.util.Objects.equals(subresources, that.subresources)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(additionalPrinterColumns,  deprecated,  deprecationWarning,  name,  schema,  served,  storage,  subresources,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (additionalPrinterColumns != null && !additionalPrinterColumns.isEmpty()) { sb.append("additionalPrinterColumns:"); sb.append(additionalPrinterColumns + ","); }
    if (deprecated != null) { sb.append("deprecated:"); sb.append(deprecated + ","); }
    if (deprecationWarning != null) { sb.append("deprecationWarning:"); sb.append(deprecationWarning + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (schema != null) { sb.append("schema:"); sb.append(schema + ","); }
    if (served != null) { sb.append("served:"); sb.append(served + ","); }
    if (storage != null) { sb.append("storage:"); sb.append(storage + ","); }
    if (subresources != null) { sb.append("subresources:"); sb.append(subresources); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDeprecated() {
    return withDeprecated(true);
  }
  
  public A withServed() {
    return withServed(true);
  }
  
  public A withStorage() {
    return withStorage(true);
  }
  public class AdditionalPrinterColumnsNested<N> extends V1CustomResourceColumnDefinitionFluent<AdditionalPrinterColumnsNested<N>> implements Nested<N>{
    AdditionalPrinterColumnsNested(int index,V1CustomResourceColumnDefinition item) {
      this.index = index;
      this.builder = new V1CustomResourceColumnDefinitionBuilder(this, item);
    }
    V1CustomResourceColumnDefinitionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1CustomResourceDefinitionVersionFluent.this.setToAdditionalPrinterColumns(index,builder.build());
    }
    
    public N endAdditionalPrinterColumn() {
      return and();
    }
    
  
  }
  public class SchemaNested<N> extends V1CustomResourceValidationFluent<SchemaNested<N>> implements Nested<N>{
    SchemaNested(V1CustomResourceValidation item) {
      this.builder = new V1CustomResourceValidationBuilder(this, item);
    }
    V1CustomResourceValidationBuilder builder;
    
    public N and() {
      return (N) V1CustomResourceDefinitionVersionFluent.this.withSchema(builder.build());
    }
    
    public N endSchema() {
      return and();
    }
    
  
  }
  public class SubresourcesNested<N> extends V1CustomResourceSubresourcesFluent<SubresourcesNested<N>> implements Nested<N>{
    SubresourcesNested(V1CustomResourceSubresources item) {
      this.builder = new V1CustomResourceSubresourcesBuilder(this, item);
    }
    V1CustomResourceSubresourcesBuilder builder;
    
    public N and() {
      return (N) V1CustomResourceDefinitionVersionFluent.this.withSubresources(builder.build());
    }
    
    public N endSubresources() {
      return and();
    }
    
  
  }

}