package com.makeuprecipe.persistance;

import com.makeuprecipe.domain.Reply;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReplyRepository extends MongoRepository<Reply, String> {
}
