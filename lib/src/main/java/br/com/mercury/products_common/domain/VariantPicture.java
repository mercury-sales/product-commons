package br.com.mercury.products_common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class VariantPicture extends Entity {
    private String pictureUrl;
    private String caption;
    private Boolean isMainPicture;
}
