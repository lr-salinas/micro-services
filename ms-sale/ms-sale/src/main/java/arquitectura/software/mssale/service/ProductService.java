package arquitectura.software.mssale.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "ms-product")
public interface ProductService {

    @RequestMapping(path = "v1/api/product/testProd",
            method = RequestMethod.GET)
    String testProduct();
}
