import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringExample {
    String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringExample.class, args);
//        SpringApplication app = new SpringApplication(SpringExample.class);
//        app.setDefaultProperties(Collections
//                .singletonMap("server.port", "8083"));
//        app.run(args);
    }

}
