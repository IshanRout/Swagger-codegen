package com.example.swagger.Repository;

import com.example.swagger.Model.KaiburrModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface KaiburrRepository extends MongoRepository<KaiburrModel , Integer> {
    List<KaiburrModel> findByName(String name);

}