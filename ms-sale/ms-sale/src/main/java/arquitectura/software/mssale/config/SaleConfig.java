package arquitectura.software.mssale.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SaleConfig {
    @Value("${arquitectura.software}")
    private  String arquitecturaSoftware;

    public String showConfiguration(){
        return String.format("Los datos del application.yml: arquitecturaSoftware: %s",arquitecturaSoftware);
    }
}
