package arquitectura.software.mssale.service;

import arquitectura.software.mssale.entity.Sale;
import arquitectura.software.mssale.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public Optional<Sale> getById(Integer id){
        return saleRepository.findById(id);
    }

    public void delete (int id) {
        saleRepository.deleteById(id);
    }
}
