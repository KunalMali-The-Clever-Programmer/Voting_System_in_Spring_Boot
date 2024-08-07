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
For any questions or feedback, please contact us at malikunal746@gmail.com.

### Output 
![Screenshot (38)](https://github.com/user-attachments/assets/b660a5ec-2bd3-44bc-9f2d-e947a0e1672e)
![Screenshot (39)](https://github.com/user-attachments/assets/3e323a76-db07-4613-8651-9114782b821d)
![Screenshot (40)](https://github.com/user-attachments/assets/60083f7c-9a74-48e4-94aa-fa057143331d)
![Screenshot (41)](https://github.com/user-attachments/assets/df0b2a62-4030-46fc-bc43-ce790719a0f8)
![Screenshot (42)](https://github.com/user-attachments/assets/e6a0e8bc-7ece-4b8d-80dd-3f6bbf91460a)
![Screenshot (43)](https://github.com/user-attachments/assets/ae254654-0b73-4e24-af27-bcbf6fbf038e)
![Screenshot (44)](https://github.com/user-attachments/assets/682d85f6-1e18-4a33-8182-8acc1d70b5bc)
![Screenshot (45)](https://github.com/user-attachments/assets/90e54d88-98e6-4ab1-8271-7d86f6246d2c)
![Screenshot (45)](https://github.com/user-attachments/assets/763810c2-89e8-4b7b-a738-5ca6b891db60)
![Screenshot (47)](https://github.com/user-attachments/assets/258df41d-bd60-4bb6-ab70-6047f6bc856d)
![Screenshot (48)](https://github.com/user-attachments/assets/da9ba65c-e00e-42ba-a6c5-01b57bd9423b)
![Screenshot (49)](https://github.com/user-attachments/assets/c19c11d7-a769-4f9e-8f32-eba569a3fadc)
