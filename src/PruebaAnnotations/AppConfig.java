package PruebaAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("PruebaAnnotations")
@PropertySource({"classpath:Trimestre1.properties", "classpath:Trimestre2.properties", "classpath:Trimestre3.properties", "classpath:Trimestre4.properties"})
public class AppConfig {

}
