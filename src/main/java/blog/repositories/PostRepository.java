package blog.repositories;

import blog.models.Post;
import blog.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Set;

public interface PostRepository extends MongoRepository<Post, String> {
    Set<Post> findByAuthor(User Author);
}