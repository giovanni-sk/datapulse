package bj.highfiveuniverity.datapulse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.highfiveuniverity.datapulse.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
               
}
