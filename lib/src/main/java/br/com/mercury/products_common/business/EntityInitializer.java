package br.com.mercury.products_common.business;

import br.com.mercury.products_common.domain.Entity;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.util.UUID;

@UtilityClass
public class EntityInitializer {
    public void initializeEntity(Entity entity, String username) {
        entity.setId(UUID.randomUUID());
        entity.setCreatedAt(LocalDateTime.now());
        entity.setCreatedBy(username);
    }

    public void updateEntity(Entity entity, String username) {
        entity.setUpdatedAt(LocalDateTime.now());
        entity.setUpdatedBy(username);
    }
}
