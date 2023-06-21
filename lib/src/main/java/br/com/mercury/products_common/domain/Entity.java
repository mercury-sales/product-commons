package br.com.mercury.products_common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Entity {
    private UUID id;
    private String createdBy;
    private LocalDateTime createdAt;
    private Boolean active;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
