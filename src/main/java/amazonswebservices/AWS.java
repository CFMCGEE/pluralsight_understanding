package amazonswebservices;

public class AWS {

         /*

                                    Amazon Web Services (AWS) (provider of Cloud Services)
                                    - Cloud Computing Services
                                     - Collection of Cloud Computing Services
                                     - Can work together or independently
                                     - Runs or supports a Computer Program
                                     - ^ Amazon Web Services, AWS, is a collection of services that interact together to enable an application to run.
                                    - Core Services of AWS
                                     - Elastic Compute Cloud (EC2)
                                      - Computing
                                       - Runs Applications
                                       - Virtual Desktop
                                       - 3rd Party Software
                                      - Cloud Compute
                                       - Computing services operating in remote data servers around the world
                                      - Elastic
                                       - Instance running computing operations can increase or decrease at will
                                      - EC2 Instance
                                       - Amazon Machine Image (AMI)
                                        - Operating systems and software used on an EC2 instance
                                       - Attributes for Instance
                                        - Families
                                        - Type
                                        - CPUs
                                        - Memory (GiB)
                                        - Instance Storage (GB)
                                        - EBS-Optimized Available
                                        - Network Performance
                                       - Number of Instances
                                        - Auto Scaling Group
                                         - Rules for automatically scaling EC2 instances up and down (based on what you set)
                                       - Storage (Elastic Block Storage (EBS))
                                        - Used for EC2 file systems
                                       - Security Group
                                        - Controls the IP-based communication rules for a single or group of EC2 instances
                                     - Simple Storage Service (S3)
                                      - Bucket
                                       - Used as the root resource for which you can add, delete or modify objects
                                       - Have the ability to be configured to trigger events when specific objects are added, modified or deleted
                                       - Able to preserve older versions of objects
                                       - Able to replicate objects across various regions
                                       - Assigned URLs when created (Bucket Region, Bucket Name, Object Path)
                                     - Relational Database Service (RDS)
                                      - Collection of AWS services for managed relational databases
                                      - Options
                                       - MYSQL
                                       - PostgreSQL
                                       - Microsoft SQLServer
                                       - MariaDB
                                       - Oracle Database
                                       - Amazon Aurora
                                      - Able to use with EC2 Instance
                                     - Route 53
                                      - DNS Management (Domain Name System Management)
                                      - Easily able to configure domain names to resolve to internal AWS Services
                                      - Domain Name System (DNS
                                       - System that translates human-readable URLS to IP addresses
                                      - Able to use with EC2 Instance
                                      - Core to letting users interact with services in AWS
                                      - Hosted Zone
                                       - Root domain name (www.example.com, www.google.com as examples)
                                       - Able to have subdomains (www.mail.example.com as an example)
                                      - Heath Check Service
                                       - Checks to see if the instance is working A-OK
                                    - Elastic Beanstalk (EB)
                                     - Makes it easy to run your code and scale it on AWS
                                     - Easy development with various tools (web console, AWS command line tool or SDK)
                                     - Configuration is set up once
                                     - Monitoring is easier
                                     - EB Structure
                                      - Application
                                       - Ability to have many application version
                                       - Environment
                                        - The rules and configuration that manage EC2 Instances
                                        - Each environment can use different platforms
                                        - Can be configured with EC2 Instance Types
                                       - Stored in S3 Bucket
                                       - Each application has a limit of 1,000
                                      - Monitoring Metrics
                                       - CPU Utilization
                                       - Number of Requests
                                       - Network Traffic
                                       - Logs
                                    - Lambda
                                     - Provides function code execution as a service (aka Function as a Service/serverless)
                                     - Executes code without much configuration unless memory is needed
                                     - No server management required
                                     - Only pay for when code is ran
                                     - Function
                                      - Bundle of code with a specific execution entry point
                                      - Platform (Node, Python, Java, etc)
                                      - Invocation Targets aka Triggers (API Gateway, CloudWatch or CloudFront)
                                      - Configuration Options
                                       - Execution Timeout
                                       - Memory Requirements
                                       - IAM Role
                                    - DynamoDB
                                     - Managed NOSQL database service which supports both documents and key value store models
                                     - Storing data doesn't care about the size of the Elastic Storage
                                     - No hardware changes
                                     - Only pay for what is used
                                     - Structure
                                     - Table (Primary Key needed)
                                      - Provisioned Throughput Capacity = Number of Read/Write Units per second)
                                    - Virtual Private Cloud (VPC)
                                     - Allows you to secure resources into groups that follow access rules and share a logical space
                                     - Able to help secure access
                                     - Still use security groups
                                     - Configure VPC routing tables
                                     - Use NAT Gateways for outbound traffic
                                     - Internal IP Address allocation
                                     - Structure
                                      - Public Subnet
                                       - Access to the internet
                                       - Uses NAT Gateways
                                      - Private Subnet
                                       - No access to the internet
                                     - Uses Routing Tables
                                      - Allows you to override certain IP ranges
                                      - Redirects traffic certain places
                                      - Controls what goes where
                                     - Network access control lists (ALCs)
                                      - Act as subnet-level firewalls
                                      - Allowing or disallowing IP ranges for both incoming and outgoing connections
                                      - Control who can come and go
                                    - CloudWatch
                                     - Monitoring service many services used in AWS
                                     - Monitoring Resources
                                     - Alarms
                                      - Metrics
                                       - EC2 - CPUUtilization
                                       - DynamoDB - ConsumedReadCapacityUnits
                                       - S3 - NumberOfObjects
                                       - Route53 - HealthCheckStatus
                                       - RedShift - DatabaseConnections
                                      - Actions
                                       - SMS Notification
                                       - Emails
                                       - Autoscale EC2 Instance
                                    - CloudFront
                                     - Content delivery network with the ability to serve files globally with very fast connections.
                                     - Works with Route 53, Load Balancer, EC2, S3
                                     - Distribution
                                      - A set of content to be served from CloudFront
                                      - Specification of location is required
                                      - Unique URL is used to access the content
                                      - Able to configure specific SSL Certification, HTTP Methods and Edge Locations
                                    - AWS Access Methods
                                     - Web Console
                                     - Software Development Kits (SDK)
                                      - Code libraries that shorten or simply complex operations
                                     - Command Line Interface (CLI)
                                      - Typically manually in a command line
                                      - Inside shell scripts or batch files
                                      - Command Structure
                                       - aws <service> <command> <arguments/flags/params>

      */

}
