package br.com.mercury.products_common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Variant extends Entity {
    private String description;
    private BigDecimal price;
    private List<VariantPicture> pictures;

    public List<VariantPicture> getPictures() {
        if (Objects.isNull(pictures)) {
            return List.of();
        }
        return pictures;
    }
}
