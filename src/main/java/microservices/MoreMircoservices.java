package microservices;

public class MoreMircoservices {

            /*

                                    Microservices (even more)
                                    - A service built around a specific business capability which can be independently developed.
                                    - Pros and Cons
                                     - Advantages
                                      - Comprehending smaller codebase is easy
                                      - Can independently scale up highly used services
                                      - Each team can focus on one (or few) MicroService(s)
                                      - Technology updates/rewrites become simpler
                                     - Challenges
                                      - Getting correct sub-domain boundaries, in the beginning, is hard
                                      - Need more skilled developers to handle distributed application complexities
                                      - Managing MicroServices based applications without proper DevOps culture is next to impossible
                                      - Local developer environment setup might become complex to test cross-service communications.
                                    - Can hold multiple instances
                                    - Spring Boot
                                     - Popular framework
                                     - Resource: https://www.ibm.com/cloud/learn/java-spring-boot#:~:text=Spring%20Boot%20helps%20developers%20create,app%20during%20the%20initialization%20process.
                                    - SpringCloud
                                     - Resource: https://projects.spring.io/spring-cloud/
                                     - Config Server
                                      - Provides configuration values oor all of our configuration parameters
                                    - Service Registration
                                     - This helps invokes a service using some logical service ID instead of using specific IP Address and port numbers
                                    - API Gateway
                                     - Also known as Edge Services
                                     - Providing a unified interface for a set of microservices so that clients no need to know about all of te details of microservices internals
                                     - Advantages and Challenges
                                      - Pros
                                       - Provides easier interface to clients
                                       - Can ve used to prevent exposing the internal microservices structure to clients
                                       - Allows refactoring microservices without forcing the clients to factor consuming logic
                                       - Can centralize cross-cutting concerns like security, monitoring, rate limiting etc
                                      - Cons
                                       - It could become a single point of failure if proper measures are not taken to make it highly available
                                       - Knowledge of various microservice API may creep into API Gateway
                                    - Won't get right the first time (try again!)
                                    - Small Services
                                     - Can be owned by a team

      */

}
