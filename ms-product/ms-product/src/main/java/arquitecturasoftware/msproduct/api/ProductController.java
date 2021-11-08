package arquitecturasoftware.msproduct.api;

import arquitecturasoftware.msproduct.config.ProductConfig;
import arquitecturasoftware.msproduct.entity.Product;
import arquitecturasoftware.msproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import  arquitecturasoftware.msproduct.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductConfig productConfig;

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

   /* @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product,
                                  @PathVariable int id) {
        return productService.updateProduct(id, product);
    }*/

    @PutMapping(path = "/update")
    public void updateProduct(@RequestBody Product product) {

        productService.update(product);
    }


}
