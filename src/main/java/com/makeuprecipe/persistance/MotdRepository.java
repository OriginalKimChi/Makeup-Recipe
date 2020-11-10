package com.makeuprecipe.persistance;

import com.makeuprecipe.domain.Motd;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MotdRepository extends MongoRepository<Motd, String> {
}
