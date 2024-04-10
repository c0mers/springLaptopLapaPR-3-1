package ntu.lapa.springdb.repository;

import ntu.lapa.springdb.entitys.Laptop;
import ntu.lapa.springdb.services.LaptopService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
