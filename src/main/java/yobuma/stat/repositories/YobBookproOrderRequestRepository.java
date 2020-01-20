package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproOrderRequest;

@Repository(value = "orderRequestRepository")
public interface YobBookproOrderRequestRepository extends JpaRepository<YobBookproOrderRequest, Integer> {

}
