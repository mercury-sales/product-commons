package br.com.mercury.products_common.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public abstract class Entity {
    private UUID id;
    private String createdBy;
    private LocalDateTime createdAt;
    private Boolean active;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
