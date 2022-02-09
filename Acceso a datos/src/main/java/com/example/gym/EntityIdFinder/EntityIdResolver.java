package com.example.gym.EntityIdFinder;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;

import javax.persistence.EntityManager;

public class EntityIdResolver implements ObjectIdResolver {
    private final EntityManager entityManager;

    public EntityIdResolver(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void bindItem(final ObjectIdGenerator.IdKey id,final Object pojo) {
    }

    @Override
    public Object resolveId(ObjectIdGenerator.IdKey id) {
        return this.entityManager.find(id.scope, id.key);
    }

    @Override
    public ObjectIdResolver newForDeserialization(Object o) {
        return this;
    }

    @Override
    public boolean canUseFor(ObjectIdResolver resolverType) {
        return false;
    }
}
