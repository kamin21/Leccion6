package PruebaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("PruebaAnnotations")
public class App {

    @Autowired
    @Qualifier("InstitutoTrimestre1")
    private Instituto institutoTrimestre1;

    @Autowired
    @Qualifier("InstitutoTrimestre2")
    private Instituto institutoTrimestre2;

    @Autowired
    @Qualifier("InstitutoTrimestre3")
    private Instituto institutoTrimestre3;

    @Autowired
    @Qualifier("InstitutoTrimestre4")
    private Instituto institutoTrimestre4;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        App app = context.getBean(App.class);

        System.out.println("Trimestre 1:");
        app.institutoTrimestre1.mostrarNotasMedias();
 
        System.out.println("Trimestre 2:");
        app.institutoTrimestre2.mostrarNotasMedias();
        System.out.println("Trimestre 3:");
        app.institutoTrimestre3.mostrarNotasMedias();
        System.out.println("Trimestre 4:");
        app.institutoTrimestre4.mostrarNotasMedias();

        context.close();
    }

}
