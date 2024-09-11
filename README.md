<h1 align="center">✨ Spring-Boot-Microservices-Banking-System ✨</h1>

<h2>📚 Contents</h2>

- [🔍 Overview](#-overview)
- [🏛️ System Design](#-system-design)
- [🚀 Microservice Details](#-microservice-details)
- [🚀 Setup Instructions](#-setup-instructions)
- [📖 Reference Materials](#-reference-materials)
- [⌛ Planned Features](#-planned-features)
- [🤝 How to Contribute](#-how-to-contribute)
- [📞 Reach Out](#-reach-out)

## 🔍 Overview
<p>
    This Banking System is crafted with a microservices approach using Spring Boot and related technologies such as Spring Data JPA, Spring Cloud, and Spring Security. Maven is utilized for managing dependencies. These technologies are pivotal in constructing core components like the Service Registry and API Gateway.<br><br>
    The architecture supports the development of standalone microservices such as the User Service for managing user details, the Account Service for handling account creation and management, the Fund Transfer Service for executing fund transfers, and the Transaction Service for processing and viewing transactions. The integration of these technologies facilitates efficient, scalable, and maintainable development, ensuring a robust banking application.
</p>

## 🏛️ System Design

- **Service Registry:** This system employs a discovery service to facilitate service registration and discovery. This design pattern allows microservices to find and communicate with each other dynamically, eliminating the need to hardcode service endpoints.

- **API Gateway:** An API Gateway acts as the unified entry point for all API requests. It also handles security aspects, including authentication and authorization, centralizing these functions for easier management.

- **Dedicated Databases:** Each microservice is equipped with its own database, specifically MySQL in this instance. This isolation of data helps maintain independent data schemas and supports the scaling of databases as needed.

<h2>🚀 Microservice Details</h2>

- **👤 User Service:** This service manages user operations, including registration, profile updates, and information retrieval. It also oversees authentication and authorization processes for secure access.

- **💼 Account Service:** The account service manages all account-related operations. Users can update account details, review linked accounts, access transaction histories, and close accounts as necessary.

- **💸 Fund Transfer Service:** This service handles fund transfers between accounts. It provides capabilities to initiate transfers, review transfer histories, and inspect individual transfer details.

- **💳 Transactions Service:** The transactions service offers functionalities to view transaction records by account or reference ID and perform deposits and withdrawals.

<h2>🚀 Setup Instructions</h2>

To set up and run the application locally, follow these steps:

- Ensure you have Java 17 installed. Download it from the official Oracle website if necessary.
- Choose an IDE such as Eclipse, Spring Tool Suite, or IntelliJ IDEA and set it up according to your preferences.
- Clone the repository containing the microservices using Git and navigate to the directory where it's cloned.
- Access each microservice directory within the cloned repository and run the services. You can do this via your IDE or by executing the relevant build commands (e.g., Maven or Gradle).
- Configure Keycloak for managing authentication and authorization. Follow the comprehensive guide available [here](https://devscribbles.hashnode.dev/mastering-microservices-authentication-and-authorization-with-keycloak) for detailed instructions.
- Ensure that all necessary microservices and APIs are operational to avoid disruptions in the application flow.

<h2>📖 Reference Materials</h2>
<h3>📖 API Guide</h3>

For detailed information on API endpoints and their usage, check out our [API Guide](https://app.theneo.io/student/spring-boot-microservices-banking-system). This guide offers an in-depth view of the API functionalities, simplifying interaction with the various services.

<h3>📚 JavaDocs</h3>

Explore the [JavaDocs](https://kartik1502.github.io/Spring-Boot-Microservices-Banking-System/) for comprehensive documentation on classes, methods, and attributes across all microservices. These documents are intended to aid developers in understanding and working with the codebase effectively.

<h2>🤝 How to Contribute</h2>

I welcome contributions to enhance this project! Feel free to report issues, submit pull requests, or share feedback. When submitting a pull request, please adhere to the basic PR guidelines.

Let’s collaborate to create a powerful and efficient banking system with Spring Boot microservices!

Happy Developing! 🏦💸


<h2>📞 Contact Information</h2>

If you have any questions, feedback, or need assistance with this project, please feel free to reach out to me:


[![GMAIL](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:Sumanthgollaprolu7@gmail.com)

