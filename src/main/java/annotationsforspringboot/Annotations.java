package annotationsforspringboot;

public class Annotations {

     /*

                                    Annotations
                                    - @RestController annotation: (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html)
                                     - This marks the class as a controller where every method returns a domain object instead of a view.
                                     - It is shorthand for including both @Controller and @ResponseBody annotations.
                                    - @GetMapping annotation: (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html)
                                     - Ensures that HTTP GET requests to the Representation Class.
                                    - @RequestParam annotation: (https://www.baeldung.com/spring-request-param)
                                     - Extracts query parameters, form parameters, and even files from the request.
                                    - MappingJackson2HttpMessageConverter class: (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/converter/json/MappingJackson2HttpMessageConverter.html)
                                     - Implementation of HttpMessageConverter that can read and write JSON using Jackson 2.x's ObjectMapper.
                                    - @SpringBootApplication is a convenience annotation that adds all the following:
                                     - @Configuration annotation: (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html)
                                      - Tags the class as a source of bean definitions for the application context.
                                     - @EnableAutoConfiguration annotation: (https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/EnableAutoConfiguration.html)
                                      - Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings...
                                      - ...For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
                                       - Side Note: DispatcherServlet is the front controller in Spring web applications...
                                       - ...It's used to create web applications and REST services in Spring MVC. In a traditional Spring web application, this servlet is defined in the web.xml file.
                                     - @ComponentScan annotation: (https://www.baeldung.com/spring-component-scanning)
                                      - Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

      */

}
