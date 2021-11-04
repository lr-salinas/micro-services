package arquitecturasoftware.msproduct.api;

import arquitecturasoftware.msproduct.entity.Product;
import arquitecturasoftware.msproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(path = "/save",
                     method = RequestMethod.POST)
    public Product saveProduct (@RequestBody Product product){

        return productRepository.save(product);
    }

    @RequestMapping(path = "/all",
            method = RequestMethod.GET)
    public List<Product> getAllProduct(){
        List<Product> products = productRepository.findAll();
        return products;
    }

    @RequestMapping(
            method = RequestMethod.PUT)
    public Product getProduct(@RequestParam Integer productId) throws Exception {
        Optional<Product> productOptional = productRepository.findById(productId);
        if(productOptional.isPresent()){
            Product product = productOptional.get();
            return product;
        }else {
            throw new Exception("Producto no fue encontrado");
        }

    }


}
