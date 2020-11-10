package com.makeuprecipe.persistance;

import com.makeuprecipe.domain.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository<Artist, String> {
}
