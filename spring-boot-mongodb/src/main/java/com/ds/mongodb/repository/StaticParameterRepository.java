package com.ds.mongodb.repository;

import com.ds.mongodb.model.StaticParameter;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author duosheng
 * @since 2018/5/12
 */
public interface StaticParameterRepository extends MongoRepository<StaticParameter, Long> {

    StaticParameter findByProductNo(String productNo);
}
