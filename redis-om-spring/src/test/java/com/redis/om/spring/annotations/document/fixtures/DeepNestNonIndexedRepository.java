package com.redis.om.spring.annotations.document.fixtures;

import com.redis.om.spring.repository.RedisDocumentRepository;

import java.util.Optional;

@SuppressWarnings("unused") public interface DeepNestNonIndexedRepository extends RedisDocumentRepository<DeepNestNonIndexed, String> {
}
