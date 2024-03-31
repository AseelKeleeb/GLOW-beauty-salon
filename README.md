# _#GLOW Beauty Salon_

Welcome to GLOW Beauty Salon, an innovative software-driven beauty solution that combines ***Glamour, Luxury, Opulence, and Wonder.*** Step into our digital realm, where cutting-edge technology intertwines with exceptional beauty experiences.

Developed by Maisa Alzahrani and Aseel Keleeb as part of the Object-Oriented Programming (OOP) course at Umm Al-Qura University (UQU), GLOW aims to elevate salon experiences by providing a comprehensive and user-friendly platform for efficient reservation management. GLOW Beauty Salon was born out of our own experiences and frustrations with the complexities of booking salon appointments. We saw a need for a solution that simplifies the process and enhances the overall experience for salon-goers and beauty lovers.

### Technical Details

GLOW Beauty Salon is developed using Java, leveraging its robust object-oriented programming features. It also makes use of core class libraries such as java.lang, java.util, and java.time to efficiently manage data structures, perform input/output operations, and handle date and time functionalities.

In total, our project consists of 13 classes, each serving a distinct purpose within the GLOW Beauty Salon system. These classes include Time, Date, Person, Customer, Stylist, Service, Nails, Face, Hair, Receipt, Review, Booking, and SalonBooking (main class). Additionally, we have incorporated a Java interface, BookingManagement, to standardize booking operations across the system.

To ensure functionality tailored to the salon's needs, we have developed custom Time and Date classes, implementing specific restrictions to accommodate our working hours and appointment dates. The Person class serves as a superclass for both the Customer and Stylist classes, encapsulating shared attributes and behaviors of individuals within the system. Similarly, the Service class acts as a superclass for Nails, Face, and Hair classes, streamlining the management of the diverse beauty services offered by the salon.

In addition, the Receipt class facilitates the generation of detailed receipts for salon reservations, capturing service specifics, total costs, and issuance timestamps. Conversely, the Review class empowers customers to provide feedback on their salon experience, including assessments and remarks on stylists and the salon overall. The Booking class manages appointments for customer services, encompassing details such as date, time, selected services, receipt, and review. It enables various functionalities like adding or deleting services, updating date/time, checking availability, calculating prices, and displaying booking details. Leveraging Customer, Stylist, Service, Receipt, and Review classes, it orchestrates booking-related information efficiently.

Within our system, we have utilized the BookingManagement interface, which includes one abstract method, calculatePrice(). This method is implemented in various classes to calculate prices for different services based on specific criteria. The Service class, being abstract, houses the abstract method calculatePrice() derived from the BookingManagement interface. Additionally, the Booking class also implements this method to calculate the total price for all services in a reservation.

The main class, SalonBooking, features nested switch-case statements to facilitate user interaction. Upon execution, users are prompted to choose between making a reservation or displaying existing ones. Within each case, further switch-case statements guide users through selecting services or managing their reservations. For detailed information, please refer to the source code and documentation.

### Limitations

While we dedicated considerable effort to the development process, time constraints limited our ability to fully realize all planned functionalities. Among the features we intended to implement but couldn't due to time constraints were the options to delete a specific service from a reservation and apply discounts. If given the opportunity to enhance this project further, we would prioritize implementing these functionalities, along with designing a graphical user interface (GUI) to elevate the overall user experience.

### **Sample Output**
![GLOW-sample1](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/769c550c-c1ef-4188-869b-9e0bb8a119dd)
![GLOW-sample2](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/42a36275-299b-42c1-9898-221dacfdf9e8)
![GLOW-sample3](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/1b7f5d11-7343-4b12-876e-4c45d461a7c0)
![GLOW-sample4](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/3a67d2bb-6a03-490e-89b6-0cdbdf97593a)
![GLOW-sample5](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/b5dcf8f9-0f2c-4fec-8a7f-d79524a48bf3)
![GLOW-sample6](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/22063593-c936-4798-b9d0-77b339eb9740)
![GLOW-sample7](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/3daef493-fee1-43cb-aac7-0698fe9067e3)
![GLOW-sample8](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/99f05983-1654-4e3c-b1d3-b26b08f676e3)
![GLOW-sample9](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/8cca518d-36c5-4c1d-877d-5d59198675e2)
![GLOW-sample10](https://github.com/AseelKeleeb/GLOW-beauty-salon/assets/113793502/9665fdeb-7b94-42cb-80f4-48a53101be33)

### **Credits**
The team members involved in creating this work are:

• Aseel Keleeb - GitHub Profile: https://github.com/AseelKeleeb

• Maisa Alzahrani - GitHub Profile: https://github.com/maisaahmad

### Acknowledgments

We would like to express our sincere appreciation to Professor Bushra Al-Gotiml for her exceptional guidance, support, and expertise throughout the development of GLOW Beauty Salon. Her extensive knowledge of Object-Oriented Programming (OOP) and her dedication to teaching at Umm Al-Qura University (UQU) have been invaluable in shaping our understanding of software development principles. Professor Bushra Al-Gotiml's mentorship has played a vital role in our growth as aspiring software developers, and we are grateful for the opportunity to work on this project under her guidance.

Additionally, we would like to acknowledge the efforts of our fellow classmates who have provided valuable insights and suggestions during the development process. Their contributions have been immensely helpful in refining the GLOW Beauty Salon project.

**_Copyright © 2023 Maisa Alzahrani and Aseel Keleeb. All rights reserved._**
