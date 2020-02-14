package ch.uzh.ifi.seal.yoshi.repository;

import ch.uzh.ifi.seal.yoshi.entity.community.Community;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends CrudRepository<Community, Long> {

    Community findById(long id);

    Community findByName(String name);

    boolean existsById(long id);
}
