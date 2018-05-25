package ScrumModule.ScrumModule;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="scrumemployee",path="scrumemployee")
public interface ScrumEmployeeRepository extends MongoRepository<ScrumEmployee,String>{

}
