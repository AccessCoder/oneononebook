package de.neuefische.backend.repository;

import de.neuefische.backend.model.Classbook;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OneOnOneRepository extends MongoRepository {
    List<Classbook> getAllClassbooks();



}
