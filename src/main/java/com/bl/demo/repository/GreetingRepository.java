package com.bl.demo.repository;
import com.bl.demo.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long>{
    Optional<Greeting> findGreetingMessage(int id);
    List<Greeting> listAllGreetingMessage();
    Optional<Greeting> updateGreetingMessage(Greeting greeting, int id);
    void deleteGreetingMessage(int id);
}
