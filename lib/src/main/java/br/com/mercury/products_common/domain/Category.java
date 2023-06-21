package br.com.mercury.products_common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Category extends Entity {
    private String name;
    private String description;
    private String icon;
}
