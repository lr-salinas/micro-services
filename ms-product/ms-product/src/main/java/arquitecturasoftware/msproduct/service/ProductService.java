package arquitecturasoftware.msproduct.service;

import arquitecturasoftware.msproduct.entity.Product;
import arquitecturasoftware.msproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void update (Product product) {
        productRepository.save(product);
    }

}
