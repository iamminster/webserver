package minh.nguyen.eas.webserver.repository;

import org.springframework.data.repository.CrudRepository;

import minh.nguyen.eas.webserver.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
