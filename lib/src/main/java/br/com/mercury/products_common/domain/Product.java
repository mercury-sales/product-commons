package br.com.mercury.products_common.domain;

import br.com.mercury.products_common.business.EntityInitializer;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Objects;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Product extends Entity {
    private String name;
    private String description;
    private Category category;
    private List<Variant> variants;

    public List<Variant> getVariants() {
        if (Objects.isNull(variants)) {
            return List.of();
        }
        return variants;
    }

    public Product initializeVariants(String username) {
        this.variants.forEach(variant -> EntityInitializer.initializeEntity(variant, username));
        return this;
    }

    public Product updateVariants(String username) {
        this.variants.forEach(variant -> {
            if (Objects.isNull(variant.getId())) {
                EntityInitializer.initializeEntity(variant, username);
                return;
            }
            EntityInitializer.updateEntity(variant, username);
        });
        return this;
    }
}
