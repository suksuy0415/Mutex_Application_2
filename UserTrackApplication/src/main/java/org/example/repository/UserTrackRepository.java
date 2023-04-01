package org.example.repository;

import org.example.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserTrackRepository extends MongoRepository<User,String> {
}
