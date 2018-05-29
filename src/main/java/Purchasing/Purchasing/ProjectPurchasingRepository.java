package Purchasing.Purchasing;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "projectpurchasing",path="projectpurchasing")
public interface ProjectPurchasingRepository extends MongoRepository<ProjectPurchasing,String>{

}
