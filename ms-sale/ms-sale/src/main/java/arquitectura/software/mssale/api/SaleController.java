package arquitectura.software.mssale.api;

import arquitectura.software.mssale.config.SaleConfig;
import arquitectura.software.mssale.entity.Sale;
import arquitectura.software.mssale.repository.SaleRepository;
import arquitectura.software.mssale.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/sale")
public class SaleController {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SaleService saleService;
    @Autowired
    private SaleConfig saleConfig;


   @RequestMapping(path = "/buy",
           method = RequestMethod.POST)
   public Sale saveSale(@RequestBody Sale sale){

       return saleRepository.save(sale);
   }

    @GetMapping(path = "/{id}")
    public Optional<Sale> getById(@PathVariable Integer id) {

        return (Optional<Sale>) saleService.getById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteProduct(@PathVariable ("id") int id) {
        saleService.delete(id);
    }

}

