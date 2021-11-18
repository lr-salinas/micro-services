package arquitectura.software.mssale.api;

import arquitectura.software.mssale.config.SaleConfig;
import arquitectura.software.mssale.entity.Sale;
import arquitectura.software.mssale.repository.SaleRepository;
import arquitectura.software.mssale.service.CustomerService;
import arquitectura.software.mssale.service.ProductService;
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
@CrossOrigin(origins = "https://localhost:4200")
@RequestMapping("/v1/api/sale")
public class SaleController {

    private static Logger LOGGER = LoggerFactory.getLogger(SaleController.class);

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SaleConfig saleConfig;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/testCust",
            method = RequestMethod.GET)
    public String testCustomer(){
        LOGGER.info("Probando endpoint ms-customer");
       String result = customerService.testCustomer();
       LOGGER.info("Resultado de la invocacion: {}", result);
        return "test customer";
    }

    @RequestMapping(path = "/testProd",
            method = RequestMethod.GET)
    public String testProduct(){
        LOGGER.info("Probando endpoint ms-product");
        String result = productService.testProduct();
        LOGGER.info("Resultado de la invocacion: {}", result);
        return "test product";
    }


   @RequestMapping(path = "/buy",
           method = RequestMethod.POST)
   public Sale saveSale(@RequestBody Sale sale){

       return saleRepository.save(sale);
   }

    @RequestMapping(path = "/products",
            method = RequestMethod.GET)
    public List<Sale> getProducts(){
        List<Sale> products = saleRepository.findAll();
        return products;
    }

    @RequestMapping(
            method = RequestMethod.DELETE)
    public Sale deleteProduct(@RequestParam Integer saleId) throws Exception {
        Optional<Sale> saleOptional = saleRepository.findById(saleId);
        if(saleOptional.isPresent()){
            Sale sale = saleOptional.get();
            return sale;
        }else {
            throw new Exception("No se encuentra el producto");

        }

    }

}

