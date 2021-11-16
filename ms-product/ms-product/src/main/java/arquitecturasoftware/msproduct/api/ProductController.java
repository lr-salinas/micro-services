package arquitecturasoftware.msproduct.api;

import arquitecturasoftware.msproduct.config.ProductConfig;
import arquitecturasoftware.msproduct.entity.Product;
import arquitecturasoftware.msproduct.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/product")
public class ProductController {

    private static Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConfig productConfig;

    @RequestMapping(path = "/testProd",
            method = RequestMethod.GET)
    public String testProduct(){
        LOGGER.info("Iniciando prueba product");
        return "test product";
    }

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
    public Product updateProduct(@RequestParam Integer productId) throws Exception {
        Optional<Product> productOptional = productRepository.findById(productId);
        if(productOptional.isPresent()){
            Product product = productOptional.get();
            return product;
        }else {
            throw new Exception("No se encuentra el producto");

        }

    }



}
