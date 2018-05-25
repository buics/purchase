package ScrumModule.ScrumModule;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="scrumproject",path="scrumproject")
public interface ScrumProjectRepository extends MongoRepository<ScrumProject,String>{

}
