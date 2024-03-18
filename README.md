# _#GLOW Beauty Salon_

Welcome to GLOW Beauty Salon, an innovative software-driven beauty solution that combines ***Glamour, Luxury, Opulence, and Wonder.*** Step into our digital realm, where cutting-edge technology intertwines with exceptional beauty experiences.

Developed by Maisa Alzahrani and Aseel Keleeb as part of the Object-Oriented Programming (OOP) course at Umm Al-Qura University (UQU), GLOW aims to elevate salon experiences by providing a comprehensive and user-friendly platform for efficient reservation management. GLOW Beauty Salon was born out of our own experiences and frustrations with the complexities of booking salon appointments. We saw a need for a solution that simplifies the process and enhances the overall experience for salon-goers and beauty lovers.

GLOW Beauty Salon is developed using Java, leveraging its robust object-oriented programming features. It also makes use of core class libraries such as java.lang, java.util, and java.time to efficiently manage data structures, perform input/output operations, and handle date and time functionalities.

In total, our project consists of 13 classes, each serving a distinct purpose within the GLOW Beauty Salon system. These classes include Time, Date, Person, Customer, Stylist, Service, Nails, Face, Hair, Receipt, Review, Booking, and SalonBooking (main class). Additionally, we have incorporated a Java interface, BookingManagement, to standardize booking operations across the system.

To ensure functionality tailored to the salon's needs, we have developed custom Time and Date classes, implementing specific restrictions to accommodate our working hours and appointment dates. The Person class serves as a superclass for both the Customer and Stylist classes, encapsulating shared attributes and behaviors of individuals within the system. Similarly, the Service class acts as a superclass for Nails, Face, and Hair classes, streamlining the management of the diverse beauty services offered by the salon.

In addition, the Receipt class facilitates the generation of detailed receipts for salon reservations, capturing service specifics, total costs, and issuance timestamps. Conversely, the Review class empowers customers to provide feedback on their salon experience, including assessments and remarks on stylists and the salon overall. The Booking class manages appointments for customer services, encompassing details such as date, time, selected services, receipt, and review. It enables various functionalities like adding or deleting services, updating date/time, checking availability, calculating prices, and displaying booking details. Leveraging Customer, Stylist, Service, Receipt, and Review classes, it orchestrates booking-related information efficiently.

Within our system, we have utilized the BookingManagement interface, which includes one abstract method, calculatePrice(). This method is implemented in various classes to calculate prices for different services based on specific criteria. The Service class, being abstract, houses the abstract method calculatePrice() derived from the BookingManagement interface. Additionally, the Booking class also implements this method to calculate the total price for all services in a reservation.

The main class, SalonBooking, features nested switch-case statements to facilitate user interaction. Upon execution, users are prompted to choose between making a reservation or displaying existing ones. Within each case, further switch-case statements guide users through selecting services or managing their reservations. For detailed information, please refer to the source code and documentation.

While we dedicated considerable effort to the development process, time constraints limited our ability to fully realize all planned functionalities. Among the features we intended to implement but couldn't due to time constraints were the options to delete a specific service from a reservation and apply discounts. If given the opportunity to enhance this project further, we would prioritize implementing these functionalities, along with designing a graphical user interface (GUI) to elevate the overall user experience.

### **Sample Output**


### **Credits**
The team members involved in creating this work are:

• Aseel Keleeb - GitHub Profile: https://github.com/AseelKeleeb

• Budur Alghamdi - GitHub Profile: https://github.com/budu6655

• Noran Almughamisi - GitHub Profile: https://github.com/NoranAlmughamisi

• Teif Alhrbi

• Nrdeen Sahrah

Special thanks and credit are extended to our professor, Omniah Nagoor, whose invaluable assistance greatly contributed to the development of this project.

**_Copyright © 2023 Omniah Nagoor, Aseel Keleeb, Budur Alghamdi, Noran Almughamisi, Teif Alhrbi, and Nrdeen Sahrah. All rights reserved._**
