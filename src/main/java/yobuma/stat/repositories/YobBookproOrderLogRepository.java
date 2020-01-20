package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproOrdersLog;

@Repository(value = "orderLogRepository")
public interface YobBookproOrderLogRepository extends JpaRepository<YobBookproOrdersLog, Integer> {

}
