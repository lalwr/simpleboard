package examples.boot.simpleboard.repository;

import examples.boot.simpleboard.base.JpaQueryDslPredicateRepository;
import examples.boot.simpleboard.domain.User;

//@Respository를 붙이지 않아도 Respository가 자동으로 등록 된다
public interface UserRepository extends JpaQueryDslPredicateRepository<User, Long>{

    public User findUserByEmail(String email);
}
// spring data method query