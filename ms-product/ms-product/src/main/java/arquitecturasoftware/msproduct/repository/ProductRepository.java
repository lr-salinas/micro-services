package arquitecturasoftware.msproduct.repository;

import arquitecturasoftware.msproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
