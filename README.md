# Voting System in Spring Boot

### Overview 
The Voting System is a web application developed using Spring Boot. It allows users to create, manage, and participate in voting polls. The application provides a user-friendly interface for both administrators and participants, ensuring a seamless voting experience.

## Features
- **User Authentication**: Secure login system for both Admin and Voter roles.
- **Admin Registration**: Admins can register and manage the system.
- **Voter Management**: Admins can add, edit, and delete voter details.
- **Nominee Management**: Admins can add, edit, and delete nominees.
- **Voting Mechanism**: Voters can view nominee details and cast their votes.
- **User Details**: Voters can see their own details and view all nominees.
- **Real-time Results**: Display live voting results.
- **Responsive Design**: Mobile-friendly interface for easy access on any device.

## Technologies Used
- **Backend**: Spring Boot
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript
- **Database**: MySQL
- **Security**: Spring Security
- **Email**: JavaMailSender
- **Build Tool**: Maven

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/voting-system.git
    cd voting-system
    ```

2. **Configure the database**:
   Update the `application.properties` file with your MySQL database credentials.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/voting_system
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    ```

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**:
   Open your web browser and navigate to `http://localhost:8080`.

## Usage

### Admin Role

1. **Register and Login**:
   - Admins can register using the admin sign-up form.
   - Registered admins can log in using their credentials.

2. **Manage Voters**:
   - Add new voter details.
   - Edit existing voter details.
   - Delete voter details if needed.

3. **Manage Nominees**:
   - Add new nominees.
   - Edit existing nominee details.
   - Delete nominees.

### Voter Role

1. **Login**:
   - Voters can log in using their credentials.

2. **View Details**:
   - Voters can view their own details.

3. **View Nominees**:
   - Voters can see the details of all nominees.

4. **Cast Vote**:
   - Voters can cast their vote for any nominee.

## Contribution
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code follows the project's coding standards and includes appropriate tests.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact
For any questions or feedback, please contact us at support@votingsystem.com.
