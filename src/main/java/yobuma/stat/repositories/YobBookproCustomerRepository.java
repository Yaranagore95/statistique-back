package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproCustomer;

@Repository(value = "customerRepository")
public interface YobBookproCustomerRepository extends JpaRepository<YobBookproCustomer, Integer> {

    YobBookproCustomer findByEmail(String email);

    @Query(value = "SELECT y FROM YobBookproCustomer y WHERE y.user = :userId")
    YobBookproCustomer findByUser(@Param("userId") int userId);
}
