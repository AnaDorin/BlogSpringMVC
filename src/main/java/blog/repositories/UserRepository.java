package blog.repositories;

import blog.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

    User findByFullname(String fullname);

    User findUserByEmail(String email);
}
