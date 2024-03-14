
/**
 * This is a school project for the Object-Oriented Programming (OOP) course at Umm Al-Qura University (UQU).
 * The program consists of a collection of classes designed to improve users' salon experience through a beauty salon UI.
 * Our program's primary goal is to streamline salon reservations.
 * Users can select desired services, update reservation details (such as time or date),
 * choose a stylist within their budget, view stylist and service information, generate reservation receipts,
 * apply discounts if desired (discarded due to time constraints), and finally, cancel the reservation.
 *
 * Created by Maisa Alzahrani and Aseel Keleeb on January 12, 2023.
 * Students at Umm Al-Qura University (UQU) majoring in Computer Science.
 * This project was completed under the supervision of Dr. Bushra Al-Gotiml on February 16, 2023.
 * Copyright © 2023 Maisa Alzahrani and Aseel Keleeb. All rights reserved.
 *
 * @author Maisa Alzahrani, Aseel Keleeb
 */

/**
 * These are the import statements for the beauty salon reservation system.
 * The imported classes and packages provide necessary functionality and dependencies.
 *
 * Imported Packages:
 *     {@code java.util}: Provides utility classes and data structures for general-purpose use.
 *     {@code java.time.LocalTime}: Represents a time of day without a date or time zone.
 *     {@code java.time.LocalDate}: Represents a date without a time or time zone.
 */
import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;

/**
 * The Time class represents time-related functionalities for managing reservation and receipt times.
 * It provides methods to set and retrieve hours, minutes, and seconds for reservations and receipts.
 * Users can create instances to handle time-specific operations within the salon booking system.
 */
class Time {
    /**
     * Attributes for representing the second, minute, and hour components of time.
     * These attributes are used to store and retrieve the respective components of reservation and receipt times.
     */
    private int second, minute, hours;

    /**
     * Default constructor for Time.
     */
    public Time() {}

    /**
     * Constructor to set the reservation time, ensuring it falls within working hours.
     * @param hours The hour of the reservation (10-22).
     * @param minute The minute of the reservation (0-59).
     */
    public Time(int hours, int minute) {
        if(hours>=10&&hours<=22&&minute<=60&&minute>=0){
            this.minute = minute;
            this.hours = hours;}
        else{
            System.err.println("Out of work time!");}
    }

    /**
     * Constructor to create an object for receipt time.
     * @param hours The hour of the receipt.
     * @param minute The minute of the receipt.
     * @param second The second of the receipt.
     */
    public Time(int hours, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hours = hours;
    }

    //setters & getters
    /**
     * Getter for seconds.
     * @return The seconds of the time.
     */
    public int getSecond() {
        return second;
    }

    /**
     * Setter for seconds.
     * @param second The seconds to set.
     */
    public void setSecond(int second) {
        this.second = second;
    }

    /**
     * Getter for minutes.
     * @return The minutes of the time.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Setter for minutes.
     * Ensures that the input minute is within the range of 0 to 59 (inclusive).
     * @param minute The minute to set.
     */
    public void setMinute(int minute) {
        if(minute<=60&&minute>=0)
            this.minute = minute;
    }

    /**
     * Getter for hours.
     * @return The hours of the time.
     */
    public int getHours() {
        return hours;
    }

    /**
     * Setter for hours.
     * Ensures that the input hour is within the range of 10 to 22 (inclusive).
     * @param hours The hour to set.
     */
    public void setHours(int hours) {
        if(hours<=10&&hours>=22)
            this.hours = hours;
    }

    /**
     * Checks if the time falls within the specified work hours (10:00 - 22:00).
     * @return true if the time is within work hours, false otherwise.
     */
    public boolean check(){
        if(hours>=10&&hours<=22&&minute<=60&&minute>=0){
            return true;}
        else{
            return false;}
    }

    /**
     * Overrides the equals method to compare Time objects.
     * @param obj The object to compare. Must be an instance of the {@code Time} class.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj){
        Time t=(Time)obj;
        if (t.hours==this.hours && t.minute==this.minute)
            return true;
        else
            return false;
    }

    /**
     * Generates a string representation of the time.
     * @return The string representation of the time (HH:MM:SS).
     */
    @Override
    public String toString() {
        return "{" + hours + ":" + minute + ":" + second + '}';
    }
}//Time class

/**
 * The Date class manages date-related functionalities for handling reservation and receipt dates.
 * It allows setting and retrieving year, month, and day components for reservations and receipts.
 * Instances of this class assist in managing date-specific operations within the salon booking system.
 */
class Date {
    /**
     * Attributes for representing the year, month, and day components of a date.
     * These attributes are used to store and retrieve the respective components of reservation and receipt dates.
     */
    private int year;
    private int month;
    private int day;

    /**
     * Default constructor for Date initializing attributes to zero.
     */
    public Date(){
        year=day=month=0;
    }

    /**
     * Constructor to set the reservation date, ensuring the input date is valid.
     * @param day   The day of the reservation (1-31).
     * @param month The month of the reservation (1-12).
     * @param year  The year of the reservation (2023 or later).
     */
    public Date(int day,int month,int year){
        if(year>=2023&&month<=12&&month>=1&&day<=31&&day>=1){
            this.day=day;
            this.month=month;
            this.year=year;}
        else{
            System.err.println("The date you entered is not correct! Please try again.");
        }
    }

    //setters & getters
    /**
     * Getter for the year.
     * @return The year of the date.
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for the year.
     * @param year The year to set.
     *             The year must be equal to or greater than 2023 to be considered valid.
     */
    public void setYear(int year) {
        if(year>=2023){
            this.year = year; }
    }

    /**
     * Getter for the month.
     * @return The month of the date.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Setter for the month.
     * @param month The month to set.
     *              The month must be between 1 and 12 (inclusive) to be considered valid.
     */
    public void setMonth(int month) {
        if(month<=12&&month>=1){
            this.month = month;}
    }

    /**
     * Getter for the day.
     * @return The day of the date.
     */
    public int getDay() {
        return day;
    }

    /**
     * Setter for the day.
     * @param day The day to set.
     *            The day must be between 1 and 31 (inclusive) to be considered valid.
     */
    public void setDay(int day) {
        if(day<=31&&day>=1)
            this.day = day;
    }

    /**
     * Checks if the date falls within the specified valid range.
     * @return true if the date is within the valid range, otherwise false.
     */
    public boolean check(){
        if(year>=2023&&month<=12&&month>=1&&day<=31&&day>=1){
            return true;}
        else{
            return false;}
    }

    /**
     * Generates a string representation of the date.
     * @return The string representation of the date (DD/MM/YYYY).
     */
    @Override
    public String toString(){
        return day+"/"+month+"/"+year ;
    }

    /**
     * Overrides the equals method to compare Date objects.
     * @param obj The object to compare. Must be an instance of the Date class.
     * @return true if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object obj){
        Date d=(Date)obj;
        if (d.day==this.day && d.month==this.month && d.year==this.year)
            return true;
        else
            return false;
    }
}//Date class

/**
 * The Person class serves as the superclass for both Stylist and Customer classes.
 * It defines attributes and methods related to individuals (customers or stylists) in the salon system.
 */
class Person {
    /**
     * Attributes used to identify the name and phone number of the person (customer or stylist).
     */
    private String name;
    private String  phoneNumber="";

    /**
     * Default constructor for Person.
     */
    public Person() {}

    /**
     * Constructor to set the name and phone number of the person.
     * @param name        The name of the person.
     * @param phoneNumber The phone number of the person. Must be a 10-digit number.
     */
    public Person(String name, String phoneNumber) {
        this.name = name;

        // Validates and sets the phone number.
        if(phoneNumber.length()==10){
            this.phoneNumber = phoneNumber;
        }else{System.err.println("invalid phone Number :(");}
    }

    //setters & getters
    /**
     * Getter for the name.
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name.
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the phone number.
     * @return The phone number of the person.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for the phone number.
     * @param phoneNumber The phone number to set. Must be a 10-digit number.
     */
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()==10){
            this.phoneNumber = phoneNumber;
        }else{System.err.println("invalid phone Number :(");}
    }

    /**
     * Generates a string representation of the person's name and phone number.
     * @return String representation of the person.
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nPhone Number:  " + phoneNumber;
    }

    /**
     * Overrides the equals method to compare Person objects by name and phone number.
     * @param obj The object to compare. Should be an instance of the Person class.
     * @return True if the objects are equal (matching name and phone number), otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        Person c =(Person)obj;
        if (c.getName().equalsIgnoreCase(this.name)&&c.getPhoneNumber().equals(this.phoneNumber)){
            return true;
        } else {
            return false;
        }
    }
}//Person class

/**
 * The Customer class represents information specific to customers.
 * It extends the Person class and adds attributes related to customer details.
 */
class Customer extends Person {
    /**
     * Attribute used to identify the Credit Card Number of the customer.
     */
    private String CreditCardNo;

    /**
     * Default constructor for Customer.
     */
    public Customer() {}

    /**
     * Constructor to set the name, phone number, and credit card number of the customer.
     * @param name         The name of the customer.
     * @param phoneNumber  The phone number of the customer.
     * @param CreditCardNo The credit card number of the customer. Must be a 16-digit number.
     */
    public Customer(String name, String phoneNumber, String CreditCardNo) {
        super(name,phoneNumber);

        // Validates and sets the credit card number.
        if(CreditCardNo.length()==16){
            this.CreditCardNo= CreditCardNo;
        }else{System.err.println("Invalid Credit Card Number :(");}
    }

    //setters and getters
    /**
     * Getter for the Credit Card Number, masking most of the digits for privacy and security.
     * @return String representation of masked Credit Card Number.
     */
    public String getCreditCardNo() {
        String creditCard="**** **** **** "+CreditCardNo.substring(12);
        return creditCard;
    }

    /**
     * Setter for the Credit Card Number.
     * @param CreditCardNo The credit card number to set. Must be a 16-digit number.
     */
    public void setCreditCardNo(String CreditCardNo) {
        if(CreditCardNo.length()==16){
            this.CreditCardNo= CreditCardNo;
        }else{System.err.println("Invalid Credit Card Number :(");}
    }

    /**
     * Overrides the toString method to display customer information.
     * @return String representation of customer's name and phone number.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}//Customer class

/**
 * The Stylist class holds information specific to stylists.
 * It extends the Person class and includes attributes related to stylist details.
 */
class Stylist extends Person {
    /**
     * Attribute used to identify the stylist.
     */
    private String id;

    /**
     * Attribute used to define the job of the stylist.
     */
    private Service job;

    /**
     * Default constructor for Stylist.
     */
    public Stylist() {}

    /**
     * Constructor to set the name, phone number, stylist ID, and job of the stylist.
     * @param name       The name of the stylist.
     * @param phoneNumber The phone number of the stylist.
     * @param id         The ID of the stylist.
     * @param job        The job (service) assigned to the stylist.
     */
    public Stylist(String name,String phoneNumber,String id,Service job){
        super(name,phoneNumber);
        this.id = id;
        this.job = job;
    }

    //setters & getters
    /**
     * Getter for the stylist's ID.
     * @return String representing the stylist's ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for the stylist's ID.
     * @param id The ID to set for the stylist.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for the job (service) assigned to the stylist.
     * @return Service representing the stylist's job.
     */
    public Service getJob() {
        return job;
    }

    /**
     * Setter for the job (service) assigned to the stylist.
     * @param job The job (service) to set for the stylist.
     */
    public void setJob(Service job) {
        this.job = job;
    }

    /**
     * Overrides the toString method to display stylist information.
     * @return String representation of stylist's name, phone number, and ID.
     */
    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nPhone Number: " + super.getPhoneNumber()+"\nID: " + id ;
    }
}//Stylist class

/**
 * The BookingManagement interface declares a method for calculating the price of each service.
 * Implementing classes will define the logic for calculating service prices within the booking system.
 */
interface BookingManagement {
    /**
     * Calculates the price for each service.
     * Implementing classes will provide specific implementations for this method.
     */
    void calculatePrice();
}//BookingManagement interface

/**
 * The Service class represents various services provided to customers.
 * It defines attributes and methods related to customer services within the salon booking system.
 * This class is abstract and implements the BookingManagement interface to calculate service prices.
 * Subclasses will provide specific implementations for different service types.
 */
abstract class Service implements BookingManagement {
    /**
     * Attributes used to describe details of the customer's service.
     * These attributes are used to store and retrieve the price, date, time and stylist assigned to the service.
     */
    private double price;
    private Date date;
    private Time time;
    private Stylist stylist=new Stylist();
    //Maisa added this one
    /**
     * The customer for whom the service is scheduled.
     * We added this attribute to make the service to the customer
     */
    private Customer customer;

    /**
     * Default constructor for the Service class.
     */
    public Service(){}

    /**
     * Constructor to set the date and time for the service.
     * @param date The date of the service.
     * @param time The time of the service.
     */
    public Service(Date date,Time time){
        this.date=date;
        this.time=time;
    }

    /**
     * Constructor to set the date, time, and stylist for the service.
     * @param date    The date of the service.
     * @param time    The time of the service.
     * @param stylist The stylist for the service.
     */
    public Service(Date date,Time time,Stylist stylist){
        this.date=date;
        this.time=time;
        this.stylist=stylist;
    }

    //Maisa added this one
    /**
     * Constructor to set the price, date, time, and customer for the service.
     * @param price    The price of the service.
     * @param date     The date of the service.
     * @param time     The time of the service.
     * @param customer The customer for the service.
     */
    public Service(double price, Date date, Time time, Customer customer) {
        this.price = price;
        this.date = date;
        this.time = time;
        this.customer = customer;
    }

    //setters & getters
    /**
     * Getter for the stylist assigned to the service.
     * @return The Stylist object associated with the service.
     */
    public Stylist getStylist() {
        return stylist;
    }

    /**
     * Setter for the stylist assigned to the service.
     * @param stylist The Stylist object to assign to the service.
     */
    public void setStylist(Stylist stylist) {
        this.stylist = stylist;
    }

    /**
     * Getter for the date of the service.
     * @return The Date object representing the date of the service.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for the date of the service.
     * @param date The Date object to set for the service.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for the time of the service.
     * @return The Time object representing the time of the service.
     */
    public Time getTime() {
        return time;
    }

    /**
     * Setter for the time of the service.
     * @param time The Time object to set for the service.
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Getter for the price of the service.
     * @return The price of the service.
     */
    public double getPrice(){
        return price;
    }

    /**
     * Setter for the price of the service.
     * @param price The price to set for the service.
     */
    public void setPrice(double price){
        this.price=price;
    }

    /**
     * Getter for the customer for whom the service is scheduled.
     * @return The Customer object associated with the service.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for the customer for whom the service is scheduled.
     * @param customer The Customer object associated with the service.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Calculates the price for the service.
     * Implementing classes will provide specific implementations for this method.
     */
    @Override
    public abstract void calculatePrice();

    /**
     * Returns a string representation of the service attributes.
     * @return A string representation of the service.
     */
    @Override
    public String toString() {
        return "Service:\nStylist: " + stylist +"\nPrice: "+getPrice();
    }

    /**
     * Checks if the service is equal to another object.
     * @param obj The object to compare. Must be an instance of Service.
     * @return True if the service is equal to the object, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        Service s=(Service)obj;
        if (s.date.equals(this.date)&&s.time.equals(this.time)&&s.stylist.equals(this.stylist)){
            return true;
        } else {
            return false;
        }
    }
}//Service class

/**
 * The Nails class represents nail-related services offered by the salon.
 * It extends the Service class and includes specific attributes and methods for nail services.
 * This class provides functionalities to set nail shape, polish color, and determine if a pedicure is included.
 */
class Nails extends Service {
    /**
     * Attributes used to describe the details of a customer's nail service.
     * These attributes include the shape of the nails, the color of the nail polish,
     * and a flag indicating if a pedicure is included.
     */
    private String Shape,polishColor;
    private boolean pedicure;

    // Constructors
    /**
     * Default constructor for Nails services.
     */
    public Nails() {}

    /**
     * Constructor for creating a Nails service with the specified nail shape and polish color.
     * @param shape       The shape of the nails.
     * @param polishColor The color of the nail polish.
     */
    public Nails(String shape,String polishColor){
        this.polishColor= polishColor;
        this.Shape= shape;
    }

    /**
     * Constructor for creating a Nails service with the specified date, time, stylist, nail shape, and polish color.
     * @param date        The date for the appointment.
     * @param time        The time for the appointment.
     * @param stylist     The stylist assigned to the appointment.
     * @param shape       The shape of the nails.
     * @param polishColor The color of the nail polish.
     */
    public Nails(Date date,Time time,Stylist stylist,String shape,String polishColor){
        super(date,time,stylist);
        this.polishColor= polishColor;
        this.Shape= shape;
    }

    // setters and getters
    /**
     * Getter for the pedicure inclusion flag.
     * @return True if a pedicure is included, false otherwise.
     */
    public boolean getPedicure() {
        return pedicure;
    }

    /**
     * Setter for the pedicure inclusion flag.
     * @param pedicure True to include a pedicure, false otherwise.
     */
    public void setPedicure(boolean pedicure) {
        this.pedicure = pedicure;
    }

    /**
     * Getter for nail shape.
     * @return The shape of the nails.
     */
    public String getShape() {
        return Shape;
    }

    /**
     * Setter for nail shape.
     * @param shape The shape of the nails to set.
     */
    public void setShape(String shape) {
        this.Shape = shape;
    }

    /**
     * Getter for the nail polish color.
     * @return The polish color of the nails.
     */
    public String getPolishColor() {
        return polishColor;
    }

    /**
     * Setter for the nail polish color.
     * @param polishColor The polish color to set for the nails.
     */
    public void setPolishColor(String polishColor) {
        this.polishColor = polishColor;
    }

    /**
     * Calculates the price for the nails service based on the included features.
     * Overrides the calculatePrice method from the parent class.
     * The price is determined by setting a base price and adding an additional fee if a pedicure is included.
     */
    @Override
    public void calculatePrice() {
        super.setPrice(20);
        if(pedicure){
            super.setPrice(getPrice()+50);
        }else{
            super.setPrice(getPrice());
        }
    }

    /**
     * Provides a string representation of the Nails service.
     * Overrides the toString method from the parent class.
     * @return A string representation of the Nails service, including the nail shape, polish color, and price.
     */
    @Override
    public String toString() {
        return "Nails Service\nShape: " + Shape + "\nPolish Color: " + polishColor+"\nPrice: "+getPrice();
    }
}//Nails class

/**
 * The Face class represents face-related services offered by the salon.
 * It extends the Service class and includes specific attributes and methods for face services.
 * This class provides functionalities to set makeup type, makeup color, and determine if skincare is included.
 */
class Face extends Service {
    /**
     * Attributes used to describe the details of a customer's face service.
     * These attributes include the type of makeup, the color of the makeup,
     * and a flag indicating if skincare is included.
     *
     * The makeupType attribute should be one of the following:
     * 1 for special occasions, 2 for normal/everyday makeup, 3 for bridal makeup.
     */
    private String makeupColor;
    private int makeupType;
    private boolean skinCare;

    //Constructors
    /**
     * Default constructor for Face services.
     */
    public Face(){}

    /**
     * Constructor for creating a Face service with the specified makeup type and makeup color.
     * @param makeupType  The type of makeup (1 for special, 2 for normal, 3 for bridal).
     * @param makeupColor The color of the makeup.
     */
    public Face(int makeupType, String makeupColor) {
        this.makeupType = makeupType;
        this.makeupColor = makeupColor;
    }

    /**
     * Constructor for creating a Face service with the specified date, time, stylist, makeup type, and makeup color.
     * @param date        The date for the appointment.
     * @param time        The time for the appointment.
     * @param stylist     The stylist assigned to the appointment.
     * @param makeupType  The type of makeup (1 for special, 2 for normal, 3 for bridal).
     * @param makeupColor The color of the makeup.
     */
    public Face(Date date,Time time,Stylist stylist,int makeupType, String makeupColor) {
        super(date,time,stylist);
        this.makeupType = makeupType;
        this.makeupColor = makeupColor;
    }

    //setters and getters
    /**
     * Getter for skincare inclusion.
     * @return True if skincare is included, false otherwise.
     */
    public boolean isSkinCare() {
        return skinCare;
    }

    /**
     * Setter for skincare inclusion.
     * @param skinCare True to include skincare, false otherwise.
     */
    public void setSkinCare(boolean skinCare) {
        this.skinCare = skinCare;
    }

    /**
     * Getter for makeup type.
     * @return The type of makeup (1 for special, 2 for normal, 3 for bridal).
     */
    public int getMakeupType() {
        return makeupType;
    }

    /**
     * Setter for makeup type.
     * A switch-case statement is used to set the price for each makeup type.
     * @param makeupType The type of makeup to set (1 for special, 2 for normal, 3 for bridal).
     */
    public void setMakeupType(int makeupType) {
        switch(makeupType){
            case 1:// special occasions
                super.setPrice(200);
                break;
            case 2:// normal/everyday makeup
                super.setPrice(150);
                break;
            case 3:// bridal makeup
                super.setPrice(300);
                break;
            default:// neither
                System.out.println("Invalid input!!");
        }
    }

    /**
     * Getter for makeup color.
     * @return The color of the makeup.
     */
    public String getMakeupColor() {
        return makeupColor;
    }

    /**
     * Setter for makeup color.
     * @param makeupColor The color of the makeup to set.
     */
    public void setMakeupColor(String makeupColor) {
        this.makeupColor = makeupColor;
    }

    /**
     * Calculates the price for the Face service based on included features.
     * Overrides the calculatePrice method from the parent class.
     * The price is determined by setting a base price for each makeup type and
     * adding an additional fee if skincare is included.
     */
    @Override
    public void calculatePrice() {
        if(skinCare){
            super.setPrice(getPrice()+50);
        }else{
            super.setPrice(getPrice());
        }
    }

    /**
     * Provides a string representation of the Face service.
     * Overrides the toString method from the parent class.
     * @return A string representation of the Face service details, including the makeup type, makeup color,
     * skincare inclusion, and price.
     */
    @Override
    public String toString() {
        String t=new String();
        if (makeupType==1)
            t="Special";
        else if (makeupType==2)
            t="Normal";
        else
            t="Bridal";
        return "Face Service\nMakeup Type: " + t + "\nMakeup Color: " + makeupColor+"\nSkincare: "+skinCare+"\nPrice: "+getPrice();
    }
}//Face class

/**
 * The Hair class represents hair-related services offered by the salon.
 * It extends the Service class and includes specific attributes and methods for hair services.
 * This class provides functionalities to set hairstyle type, length, and calculate prices accordingly.
 */
class Hair extends Service{
    /**
     * Attributes used to describe the details of a hair service.
     * These attributes include the hairstyle type and the length of the hair.
     *
     * The style attribute should be one of the following:
     * 1 for special hairstyle, 2 for normal hairstyle, 3 for haircut and dye.
     *
     * The length attribute should be one of the following:
     * 1 for short hair, 2 for mid-length hair, 3 for long hair.
     */
    private int length,style;

    //Constructors
    /**
     * Default constructor for Hair services.
     */
    public Hair(){}

    /**
     * Constructor for Hair services with date, time, stylist, and hairstyle type.
     * @param date    The date for the appointment.
     * @param time    The time for the appointment.
     * @param stylist The stylist assigned to the appointment.
     * @param style   The type of hairstyle (1 for special, 2 for normal, 3 for cut and dye).
     */
    public Hair( Date date, Time time, Stylist stylist,int style) {
        super(date, time, stylist);
        this.style = style;
    }

    /**
     * Constructor for Hair services with date, time, stylist, hairstyle type, and hair length.
     * @param date    The date for the appointment.
     * @param time    The time for the appointment.
     * @param stylist The stylist assigned to the appointment.
     * @param style   The type of hairstyle (1 for special, 2 for normal, 3 for cut and dye).
     * @param length  The length of hair (1 for short, 2 for mid-length, 3 for long).
     */
    public Hair(Date date,Time time,Stylist stylist,int style,int length){
        super(date,time,stylist);
        this.style=style;
        this.length=length;
    }

    //setter & getters
    /**
     * Getter for hairstyle type.
     * @return The type of hairstyle (1 for special, 2 for normal, 3 for cut and dye).
     */
    public int getStyle() {
        return style;
    }

    /**
     * Setter for hairstyle type.
     * A switch-case statement is used to set the price for each hairstyle type.
     * @param style The type of hairstyle to set (1 for special, 2 for normal, 3 for cut and dye).
     */
    public void setStyle(int style) {
        switch(style){
            case 1://special hairstyle
                super.setPrice(250);
                break;
            case 2://normal hairstyle
                super.setPrice(150);
                break;
            case 3://haircut and dye
                super.setPrice(400);
                break;
            default://neither
                System.out.println("Invalid input!!");
        }
    }

    /**
     * Getter for hair length.
     * @return The length of hair (1 for short, 2 for mid-length, 3 for long).
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter for hair length.
     * @param length The length of hair to set (1 for short, 2 for mid-length, 3 for long).
     */
    public void setLength(int length) {
        this.length = length;
    }

    //Methods
    /**
     * Calculates the price for the Hair service based on the hair length.
     * Overrides the calculatePrice method from the parent class.
     * The price is determined by setting a base price for each hairstyle type and
     * adding an additional fee based on the hair length.
     */
    @Override
    public void calculatePrice() {
        switch(length){
            case 1://short
                super.setPrice(getPrice()+30);
                break;
            case 2://mid-length
                super.setPrice(getPrice()+50);
                break;
            case 3://long
                super.setPrice(getPrice()+70);
                break;
            default://neither
                System.out.println("Invalid input!!");
        }
    }

    /**
     * Provides a string representation of the Hair service.
     * Overrides the toString method from the parent class.
     * @return A string representation of the Hair service details, including the hairstyle type, hair length, and price.
     */
    @Override
    public String toString() {
        String l=new String();
        if(length==1)
            l="Short";
        else if(length==2)
            l="Mid-length";
        else
            l="Long";
        String s=new String();
        if (style==1)
            s="Special";
        else if (style==2)
            s="Normal";
        else
            s="Haircut/Hairdye";
        return "Hair Service\nStyle: " + s+ "\nLength: " + l+"\nprice: "+getPrice();
    }
}//Hair class

/**
 * The Receipt class represents a receipt generated for a customer's salon services.
 * It contains details about the services purchased, the total price, and the date and time of issuance.
 * The class provides methods to set and get the total price, add discounts, and display the receipt information.
 */
class Receipt  {
    /**
     * Attributes used to display the customer's receipt details.
     * These attributes include the full price of all services and the date and time of issuance.
     */
    private double fullPrice;
    private Time time;
    private Date date;

    /**
     * Default constructor that initializes the time and date of the receipt issuance.
     */
    public Receipt(){
        LocalTime t=LocalTime.now();
        int hour=t.getHour();
        int minute=t.getMinute();
        int second=t.getSecond();
        time=new Time(hour,minute,second);
        LocalDate d=LocalDate.now();
        int day=d.getDayOfMonth();
        int month=d.getMonthValue();
        int year=d.getYear();
        date=new Date(day,month,year);
    }

    /**
     * Constructor to set the total price and initialize the time and date of issuance.
     * @param fullPrice The total price of the services.
     */
    public Receipt(double fullPrice){
        this(); // Calls the default constructor to initialize time and date
        this.fullPrice=fullPrice;
    }

    /**
     * Setter for the total price on the receipt.
     * @param fullPrice The total price to set.
     */
    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * Getter for the total price on the receipt.
     * @return The total price.
     */
    public double getFullPrice() {
        return fullPrice;
    }

    /**
     * Method to apply a discount to the total price on the receipt.
     * @param percentage The percentage of discount to apply.
     */
    public void addDiscount(double percentage){
        double discount = (percentage/100)*fullPrice;
        this.fullPrice-=discount;
    }

    /**
     * Generates a string representation of the receipt.
     * @return A string representation of the receipt details, including the purchase amount and the date and time of issuance.
     */
    @Override
    public String toString() {
        return "GLOW BEAUTY SALON RECEIPT\nPurchase Amount: "+fullPrice+"\nThis receipt was issued in:\n"+date+"\t"+time;
    }
}//Receipt class

/**
 * The Review class represents a review for a stylist and the salon in general, capturing evaluation and notes.
 * It allows customers to provide feedback on the service/s they received.
 */
class Review {
    /**
     * Evaluation flag indicating if the service was satisfactory or not.
     */
    private boolean evaluation;

    /**
     * Additional notes or comments provided by the customer.
     */
    private String notes;

    /**
     * The customer who submitted the review.
     */
    private Customer customer;

    /**
     * The stylist being reviewed.
     */
    private Stylist stylist;

    /**
     * Default constructor to initialize the review.
     */
    public Review() {}

    /**
     * Constructor with parameters used to create a review instance.
     * @param evaluation The evaluation of the service (satisfactory or not).
     * @param notes Additional notes or comments by the customer.
     * @param customer The customer who submitted the review.
     * @param stylist The stylist being reviewed.
     */
    public Review(boolean evaluation, String notes, Customer customer, Stylist stylist) {
        this.evaluation = evaluation;
        this.notes = notes;
        this.customer = customer;
        this.stylist = stylist;
    }

    //setters and getters
    /**
     * Getter for the evaluation of the service.
     * @return The evaluation (true if liked, false if not).
     */
    public boolean isEvaluation() {
        return evaluation;
    }

    /**
     * Setter for the evaluation of the service.
     * @param evaluation The evaluation to set.
     */
    public void setEvaluation(boolean evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * Getter for the customer who submitted the review.
     * @return The customer who submitted the review.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for the customer who submitted the review.
     * @param customer The customer object to set.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getter for the stylist being reviewed.
     * @return The stylist being reviewed.
     */
    public Stylist getStylist() {
        return stylist;
    }

    /**
     * Setter for the stylist being reviewed.
     * @param stylist The stylist object to set.
     */
    public void setStylist(Stylist stylist) {
        this.stylist = stylist;
    }

    /**
     * Getter for the additional notes or comments provided by the customer.
     * @return The notes/comments.
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter for the additional notes or comments provided by the customer.
     * @param notes The notes/comments to set.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Generates a string representation of the review.
     * @return A string representation of the review details, including the stylist, evaluation, and notes.
     */
    @Override
    public String toString() {
        String rate=new String();
        if (evaluation){
            rate="Liked the service";
        }else{
            rate="Did not like the service";
        }
        return "Review\nStylist:\n" + stylist+"\nEvaluation: "+rate+"\nNotes: "+notes;
    }
}//Review class

/**
 * The Booking class represents a booking made for customer services with details of date, time, services, receipt, and review.
 * Manages various functionalities like adding/deleting services, updating date/time, checking availability,
 * calculating prices, and displaying booking details.
 * Utilizes Customer, Stylist, Service, Receipt, and Review classes to manage booking-related information.
 */
class Booking implements BookingManagement {
    /**
     * Attributes used to describe the details of a booking.
     * These attributes include the customer, stylist, services, date and time of the appointment,
     * total price, receipt, and review.
     */
    private Customer customer;
    private Stylist stylist;
    protected ArrayList<Service> allService;
    private Date date ;
    private Time time;
    private double price;
    private Receipt receipt;
    private Review review;

    /**
     * Default constructor creating and initializing booking objects and price.
     */
    public Booking() {
        allService = new ArrayList<>();
        customer=new Customer();
        stylist= new Stylist();
        date= new Date();
        time=new Time();
        receipt = new Receipt();
        review=new Review();
        this.price=0.0;
    }

    /**
     * Constructor with parameters used in the main class.
     * @param customer The customer for the booking.
     * @param stylist The stylist for the booking.
     * @param date The date for the booking.
     * @param time The time for the booking.
     */
    public Booking(Customer customer, Stylist stylist, Date date, Time time) {
        allService = new ArrayList<>();
        this.customer = customer;
        this.stylist = stylist;
        this.date = date;
        this.time = time;
    }

    //setters and getters
    /**
     * Getter for the price of the booking.
     * @return The price of the booking.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Note: The setter for the price attribute is intentionally omitted to ensure accurate calculation
     * of the total and prevent unauthorized modifications.
     */

    /**
     * Getter for the customer associated with the booking.
     * @return The customer associated with the booking.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for the customer for the booking.
     * @param c The customer to be set for the booking.
     */
    public void setCustomer(Customer c) {
        this.customer = c;
    }

    /**
     * Getter for the stylist associated with the booking.
     * @return The stylist associated with the booking.
     */
    public Stylist getStylist() {
        return stylist;
    }

    /**
     * Setter for the stylist for the booking.
     * @param s The stylist to be set for the booking.
     */
    public void setStylist(Stylist s) {
        this.stylist = s;
    }

    /**
     * Getter for the date of the booking.
     * @return The date of the booking.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for the date for the booking.
     * @param date The date to be set for the booking.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for the time of the booking.
     * @return The time of the booking.
     */
    public Time getTime() {
        return time;
    }

    /**
     * Setter for the time for the booking.
     * @param time The time to be set for the booking.
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Getter for the receipt associated with the booking.
     * @return The receipt associated with the booking.
     */
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * Setter for the receipt for the booking.
     * @param receipt The receipt to be set for the booking.
     */
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    /**
     * Getter for the review associated with the booking.
     * @return The review associated with the booking.
     */
    public Review getReview() {
        return review;
    }

    /**
     * Setter for the review for the booking.
     * @param review The review to be set for the booking.
     */
    public void setReview(Review review) {
        this.review = review;
    }

    // Methods
    /**
     * This method creates a receipt for the booking by calculating the price and initializing a Receipt object.
     * The calculated price is passed as a parameter to the Receipt class constructor.
     * The created receipt is assigned to the Booking class attribute/global variable.
     * @return The receipt assigned to the booking.
     */
    public Receipt createReceipt(){
        this.calculatePrice();
        this.receipt=new Receipt(price);
        return this.receipt;
    }

    /**
     * This method adds a service to the booking.
     * @param s The service to add.
     */
    public void addService(Service s){
        allService.add(s);
    }

    /**
     * This method deletes a service from the booking.
     * @param s The service to delete.
     */
    public void deleteService(Service s){
        allService.remove(s);
    }

    /**
     * This method displays all existing services for the booking.
     */
    public void displayService(){
        for (int i=0; i<allService.size();i++) {
            System.out.println(allService.get(i));
            Stylist st=allService.get(i).getStylist();
            System.out.println(st);
            System.out.println("__________________");
        }
        System.out.println( createReceipt());
    }

    /**
     * This method updates the date of the reservation for services in the booking.
     * @param d The updated date for the reservation.
     */
    public void updateDate(Date d){
        for (int i = 0; i <allService.size(); i++) {
            if(allService.get(i).getDate().equals(d))
                allService.get(i).setDate(d);
        }
    }

    /**
     * This method updates the time of the reservation for services in the booking.
     * @param t The updated time for the reservation.
     */
    public void updateTime(Time t){
        for (int i = 0; i <allService.size(); i++) {
            if(allService.get(i).getTime().equals(t)){
                allService.get(i).setTime(t);
            }
        }
    }

    /**
     * This method checks the availability for a specific date and time.
     * @param d The date to check for availability.
     * @param t The time to check for availability.
     * @return True if the slot is available, otherwise false.
     */
    public boolean checkAvailability(Date d, Time t){
        if(this.date.equals(d)&&this.time.equals(t)){
            return false;
        }else{
            return true;
        }
    }

    /**
     * This method calculates the total price for all services in the booking.
     * Implements the calculatePrice() method defined in the BookingManagement interface.
     */
    @Override
    public void calculatePrice() {
        double total=0;
        for (int i=0; i<allService.size();i++) {
            Service ser=allService.get(i);
            total+=ser.getPrice();
        }
        this.price=total;
    }

    /**
     * Generates a string representation of the booking.
     * @return A string representation of the booking details, including customer information and
     * date and time of the appointment.
     */
    @Override
    public String toString() {
        return "Booking:\nCustomer info:\n" + customer +"\nDate and time:\n" + date + "\t" + time ;
    }
}//Booking class

/**
 * SalonBooking manages salon reservations and customer interactions within a beauty salon.
 * Customers can make, modify, view, and review their reservations through this program.
 * The main method handles user interaction and reservation management.
 * This program integrates bookings, customers, stylists, services, dates, times, receipts, and reviews.
 *
 * Description of Operations:
 * - Make a Reservation: Customers can book appointments for various salon services.
 * - Display Reservation: Customers can view, update, delete, and review existing reservations.
 */
public class SalonBooking {

    /**
     * The main method of the SalonBooking class manages user interactions and reservation operations.
     * It facilitates making, displaying, updating, and reviewing reservations within the beauty salon.
     * @param args The array of String arguments passed to the program (not utilized in this implementation).
     */
    public static void main(String[] args) {
        // Initializes a scanner object to handle user input
        Scanner in = new Scanner(System.in);

        // This Arraylist should hold all booking instances made by customers
        ArrayList<Booking> allBooking = new ArrayList<>();

        // Instantiates Stylist objects to enable user selection later on
        Stylist stylistCnD = new Stylist("Ameera", "0508245322", "h8393", new Hair());
        Stylist stylistS = new Stylist("Amal", "0508250329", "h8093", new Hair());
        Stylist stylistN = new Stylist("Nora", "0558355249", "h8003", new Hair());

        Stylist stylistSp = new Stylist("Fatima", "0589440729", "f1234", new Face());
        Stylist stylistNo = new Stylist("Jana", "0527232320", "f74862", new Face());
        Stylist stylistB = new Stylist("Tala", "0527534890", "f0862", new Face());

        Stylist stylistNor = new Stylist("Lamis", "0508670329", "n8083", new Nails());
        Stylist stylistSpe = new Stylist("Sara", "0508250423", "n8693", new Nails());

        // Instantiates Service objects for face, hair, and nails
        // Using the concept of polymorphism, we plan on casting these objects later in order to use the subclass methods
        Service face= new Face();
        Service hair = new Hair();
        Service nails=new Nails();

        // Declares a Customer object for later use in the program
        Customer customer ;

        /*
         * Here, an integer is created to store the customer's choice of salon services.
         * The while loop continues until the customer chooses to exit (chooses a number above 2).
         */
        int choice = 0;
        while (choice <= 2) {
            System.out.println("Welcome to GLOW Beauty Salon!!\n"
                    + "Here is where Glamour, Luxury, Opulence, and Wonder converge to create an unparalleled beauty experience.\n"
                    + "Step into a realm where each visit transcends expectations, where indulgence meets sophistication.\n"
                    + "Our expert team crafts personalized services tailored to elevate your natural radiance,\n"
                    + "ensuring every moment at GLOW Beauty Salon is a journey of elegance and enchantment.\n\n"
                    + "To start, please press the number of the operation you want to perform:\n"
                    + "(1) Make a reservation\n"
                    + "(2) Display a reservation\n"
                    + "Note that entering any other number will cause the program to exit!");
            choice = in.nextInt(); // User input is stored in the 'choice' variable.
            // Switch statement to handle user's choice
            switch (choice) {

                /*
                 * Case 1: Make a reservation
                 * Gathering customer information for reservation creation. This information will be passed
                 * to the customer object we declared previously.
                 */
                case 1:
                    System.out.println("Please enter your info:");
                    System.out.println("Full name:");
                    in.nextLine(); // Clears the input buffer (gets rid of \n in the previous input)
                    String name = in.nextLine();

                    System.out.println("Phone number: *kindly, make sure it is 10 numbers :)*");
                    String phone = in.next();
                    // Validate phone number format
                    // Error handling: this part makes sure the runtime error will not exit the program
                    while(phone.length()!=10){
                        System.err.println("Invalid Phone Number! Try again!");
                        phone = in.next();
                    }

                    System.out.println("CreditCard number: *kindly, make sure it is all integer, and 16 numbers :)*");
                    String ccNo = in.next();
                    // Validate credit card number format
                    // Error handling: this part makes sure the runtime error will not exit the program
                    while(ccNo.length()!=16){
                        System.err.println("Invalid Credit Card number! Try again!");
                        ccNo = in.next();
                    }
                    customer = new Customer(name, phone,ccNo);

                    // Gathering reservation date
                    System.out.println("Enter the day, month and year, respectively: (kindly, leave a space between each of them)");
                    int day = in.nextInt();
                    int month = in.nextInt();
                    int year = in.nextInt();
                    Date date = new Date(day, month, year);
                    // Check for a valid date
                    while(!date.check()){
                        day = in.nextInt();
                        month = in.nextInt();
                        year = in.nextInt();
                        date = new Date(day, month, year);
                    }

                    // Gathering reservation time
                    System.out.println("Enter the hour(in 24 system) and minutes, respectively: (kindly, leave a space between the hour and minutes)"
                            +"\nNote: Our opening hours are from 10 to 22");
                    int hour = in.nextInt();
                    int minute = in.nextInt();
                    Time time = new Time(hour, minute);
                    // Check for a valid time
                    while(!time.check()){
                        hour = in.nextInt();
                        minute = in.nextInt();
                        time = new Time(hour, minute);
                    }

                    // Check availability for the selected date and time
                    for (int i=0; i<allBooking.size(); i++) {
                        if (allBooking.get(i).checkAvailability(date, time)) {
                            System.out.println("The time you picked is available :)!");
                        } else {
                            System.err.println("Sorry! The time you picked is not available!");
                        }
                    }

                    // Inner switch and loop for choosing services
                    int ser = 0;
                    while (ser <= 8) {
                        // Service selection options for the user
                        System.out.println("Choose the type of service you want:\n"
                                + "(1) Hair service\n"
                                + "(2) Face service\n"
                                + "(3) Nails service\n");
                        ser = in.nextInt(); // User input for service selection
                        switch (ser) {
                            // Cases for different service selections...
                            /*
                             * In case 1: Hair Service.
                             * All hairstylists with services and prices will be printed for the user to choose.
                             * The user will be asked about the hair length that will determine the final price of the service.
                             */
                            case 1:
                                System.out.println("Choose the stylist: (just type the name of the stylist you want)\n"
                                        + "Ameera: haircuts & color specialist, prices range from 430SAR to 470SAR\n"
                                        + "Amal: special hair styling (weddings and important events), prices range from 280SAR to 320SAR\n"
                                        + "Nora: normal hair styling (daily styles and small parties), prices range from 180SAR to 220SAR");
                                String name1 = in.next();

                                System.out.println("Which one of these describes your hair length best?\n"
                                        + "(1) Short hair\n"
                                        + "(2) Mid-length hair\n"
                                        + "(3) Long hair");
                                int l = in.nextInt();

                                if (stylistCnD.getName().equalsIgnoreCase(name1)) {
                                    hair = new Hair(date, time, stylistCnD, 3, l);
                                    ((Hair) hair).setStyle(3);
                                    hair.calculatePrice();
                                    System.out.println("The price for this service is: "+hair.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistCnD);
                                    allBooking.add(new Booking(customer, stylistCnD, date, time));

                                } else if (stylistS.getName().equalsIgnoreCase(name1)) {
                                    hair = new Hair(date, time, stylistS, 1, l);
                                    ((Hair) hair).setStyle(1);
                                    hair.calculatePrice();
                                    System.out.println("The price for this service is: "+hair.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistS);
                                    allBooking.add(new Booking(customer, stylistS, date, time));

                                } else if (stylistN.getName().equalsIgnoreCase(name1)) {
                                    hair = new Hair(date, time, stylistN, 2, l);
                                    ((Hair) hair).setStyle(2);
                                    hair.calculatePrice();
                                    System.out.println("The price for this service is: "+hair.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistN);
                                    allBooking.add(new Booking(customer, stylistN, date, time));
                                } else {
                                    System.out.println("Invalid Input! No such stylist! Sorry, you'll have to try again!");
                                }

                                System.out.println("Are there any more services you want? (please answer with yes or no only)");
                                String yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ser=9;
                                }
                                break;
                            // End of case 1 in inner switch

                            /*
                             * In case 2: Face Service.
                             * All makeup artists with services and prices will be printed for the user to choose.
                             */
                            case 2:
                                System.out.println("Choose the stylist: (just type the name of the stylist you want)\n" +
                                        " Tala: bridal makeup, prices range from 300SAR to 350SAR\n" +
                                        " Fatima: special makeup, prices range from 200SAR to 250SAR\n" +
                                        " Jana: normal makeup, prices range from 150SAR to 200SAR");
                                name1 = in.next();

                                System.out.println("What color of makeup do you want to wear? (if you haven't decided yet just write 'none')");
                                in.nextLine(); // Clears the input buffer (gets rid of \n in the previous input)
                                String color = in.nextLine();

                                System.out.println("Do you need a skincare service as well? note that it will cost more (please answer with yes or no only)");
                                yon = in.next();
                                boolean p; // Will be passed to setSkinCare
                                if (yon.equalsIgnoreCase("yes")) {
                                    p=true;
                                }else{
                                    p=false;
                                }

                                if (stylistB.getName().equalsIgnoreCase(name1)) {
                                    face = new Face(date, time, stylistB, 3, color);
                                    ((Face) face).setMakeupType(3);
                                    ((Face) face).setSkinCare(p);
                                    face.calculatePrice();
                                    System.out.println("The price for this service is: "+face.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistB);
                                    allBooking.add(new Booking(customer, stylistB, date, time));

                                } else if (stylistSp.getName().equalsIgnoreCase(name1)) {
                                    face = new Face(date, time, stylistSp, 1, color);
                                    ((Face) face).setMakeupType(1);
                                    ((Face) face).setSkinCare(p);
                                    face.calculatePrice();
                                    System.out.println("The price for this service is: "+face.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistSp);
                                    allBooking.add(new Booking(customer, stylistSp, date, time));

                                } else if (stylistNo.getName().equalsIgnoreCase(name1)) {
                                    face = new Face(date, time, stylistNo, 2, color);
                                    ((Face) face).setMakeupType(2);
                                    ((Face) face).setSkinCare(p);
                                    face.calculatePrice();
                                    System.out.println("The price for this service is: "+face.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistNo);
                                    allBooking.add(new Booking(customer, stylistNo, date, time));
                                } else {
                                    System.out.println("Invalid Input! No such Stylist! Sorry, you'll have to try again!");
                                }

                                System.out.println("Are there any more services you want? (please answer with yes or no only)");
                                yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ser=9;
                                }
                                break;
                            // End of case 2 in inner switch

                            /*
                             * In case 3: Nails Service.
                             * All stylists of nails with services and prices will be printed for the user to choose.
                             */
                            case 3:
                                System.out.println("Choose the stylist: (type the name of the stylist you want)\n" +
                                        "Sara: manicure & pedicure, price is 70SAR\n" +
                                        "Lamis: manicure only, price is 20SAR");
                                name1 = in.next();

                                System.out.println("What color of nail polish do you want? (if you haven't decided yet just write 'none')");
                                in.nextLine(); // Clears the input buffer (gets rid of \n in the previous input)
                                color = in.nextLine();

                                System.out.println("What is the shape that you want? (if you haven't decided yet just write 'none')");
                                String shape = in.nextLine();

                                if (stylistSpe.getName().equalsIgnoreCase(name1)) {
                                    nails = new Nails(date, time, stylistSpe, shape, color);
                                    ((Nails)nails).setPedicure(true);
                                    ((Nails) nails).calculatePrice();
                                    System.out.println("The price for this service is: "+nails.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistSpe);
                                    allBooking.add(new Booking(customer, stylistSpe, date, time));

                                } else if (stylistNor.getName().equalsIgnoreCase(name1)) {
                                    nails = new Nails(date, time, stylistNor, shape, color);
                                    ((Nails)nails).setPedicure(false);
                                    ((Nails) nails).calculatePrice();
                                    System.out.println("The price for this service is: "+nails.getPrice());
                                    System.out.println("Your stylist's info:\n" + stylistNor);
                                    allBooking.add(new Booking(customer, stylistNor, date, time));
                                } else {
                                    System.out.println("Invalid Input! No such stylist! Sorry, you'll have to try again!");
                                }

                                System.out.println("Are there any more services you want? (please answer with yes or no only)");
                                yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ser=9;
                                }
                                break;
                            // End of case 3 in inner switch

                            default:
                                System.err.println("Invalid input! There is no case with this character!");
                        }

                        allBooking.get(allBooking.size()-1).addService(hair);
                        allBooking.get(allBooking.size()-1).addService(face);
                        allBooking.get(allBooking.size()-1).addService(nails);
                    } // Closing curly braces for the inner while loop and switch statement
                break; // break the case 1 of outer switch statement

                /*
                 * Case 2 of the outer switch: Display a reservation
                 * Operations requiring an existing reservation.
                 * Prompt user for their phone number and check if it exists in the system.
                 * If it exists, the inner loop and switch statement will be entered. Otherwise, exit.
                 */
                case 2:
                    System.out.println("Please write your phone number:");
                    in.nextLine(); // Clears the input buffer (gets rid of \n in the previous input)
                    phone = in.nextLine();
                    Booking  b=new Booking();

                    // Check if the phone number exists in the system
                    for (int i = 0; i < allBooking.size(); i++) {
                        if (allBooking.get(i).getCustomer().getPhoneNumber().equals(phone)) {
                            b=allBooking.get(i);
                        }else{
                            System.err.println("Sorry! The phone number you entered is not in our system :(");
                            System.exit(0);
                        }
                    }
                    System.out.println(b);

                    // Inner switch in case 2 for various operations on an existing reservation.
                    int ch=0;
                    while(ch<=4){
                        System.out.println("What else do you want to do with this reservation?\n" +
                                "(1) Update date and time\n" +
                                "(2) Delete reservation\n" +
                                "(3) Display my services and receipt\n" +
                                "(4) Leave a review\n" +
                                "(5) Exit");
                        choice = in.nextInt(); // User input for operation selection
                        switch (choice) {
                            // Cases for different operations on the reservation...
                            /*
                             * Case 1 in inner switch for updating time and date
                             */
                            case 1:
                                System.out.println("Enter the new day, month and year of your reservation, respectively: (kindly, leave a space between each of them)");
                                day = in.nextInt();
                                month = in.nextInt();
                                year = in.nextInt();
                                Date d1 = new Date(day, month, year);
                                while(!d1.check()){
                                    day = in.nextInt();
                                    month = in.nextInt();
                                    year = in.nextInt();
                                    d1 = new Date(day, month, year);
                                }


                                System.out.println("Enter the new hour(in 24 system) and minutes of your reservation, respectively: (kindly, leave a space between the hour and minutes)"
                                        +"\nNote: Our opening hours are from 10 to 22");
                                hour = in.nextInt();
                                minute = in.nextInt();
                                Time t1 = new Time(hour, minute);
                                while(!t1.check()){
                                    hour = in.nextInt();
                                    minute = in.nextInt();
                                    t1 = new Time(hour,minute);
                                }

                                for (int j = 0; j < allBooking.size(); j++) {
                                    if (b.checkAvailability(d1, t1)) {
                                        b.updateDate(d1);
                                        b.updateTime(t1);
                                    }else{
                                        System.err.println("Sorry! The time you picked is not available!");
                                    }
                                }
                                allBooking.add(b);
                                System.out.println("Your date/time has been updated!");
                                System.out.println("Are there any more operations you want to perform? (please answer with yes or no only)");
                                String yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ch=6;
                                    choice=3;
                                }
                                break;
                            // End of case 1 in inner switch

                            /*
                             * Case 2 in inner switch for deleting reservation
                             */
                            case 2:
                                allBooking.remove(b);
                                System.out.println("Your reservation has been deleted");
                                System.out.println("Are there any more operations you want to perform? (please answer with yes or no only)");
                                yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ch=6;
                                    choice=3;
                                }
                                break;
                            // End of case 2 in inner switch

                            /*
                             * Case 3 in inner switch for displaying services and receipt
                             */
                            case 3:
                                b.displayService();
                                System.out.println("Payed using Credit Card ending in: "+b.getCustomer().getCreditCardNo());
                                System.out.println("Are there any more operations you want to perform? (please answer with yes or no only)");
                                yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ch=6;
                                    choice=3;
                                }
                                break;
                            // End of case 3 in inner switch

                            /*
                             * Case 4 in inner switch for writing a review
                             */
                            case 4:
                                System.out.println("Did you like our services? (kindly answer with yes or no only.)");
                                String e = in.next();
                                boolean evaluation = false;
                                if (e.equalsIgnoreCase("yes")) {
                                    evaluation = true;
                                    System.out.println("Thank you for your input.\nWe are glad you liked it here and we hope to see you again!");
                                } else {
                                    evaluation = false;
                                    System.out.println("Thank you for your input.\nWe are sorry you didn't like our services. Please leave a note to help us improve!");
                                }
                                System.out.println("If you have any notes please leave them here, if not just type 'No notes'");
                                in.nextLine(); // Clears the input buffer (gets rid of \n in the previous input)
                                String notes = in.nextLine();
                                Review r1 = new Review(evaluation, notes, b.getCustomer(), b.getStylist());
                                b.setReview(r1);
                                System.out.println("__________________");
                                System.out.println(r1);
                                System.out.println("__________________");
                                System.out.println("Are there any more operations you want to perform? (please answer with yes or no only)");
                                yon = in.next();
                                if (yon.equalsIgnoreCase("yes")) {
                                    continue;
                                }else{
                                    ch=6;
                                    choice=3;
                                }
                                break;
                            // End of case 4 in inner switch

                            /*
                             * Case 5 in inner switch for exiting the program
                             */
                            case 5:
                                ch=6;
                                choice=3;
                                break;
                            // End of case 5 in inner switch

                            default:
                                System.err.println("Invalid input! There is no case with this character!");
                        }
                        if(b==null) {
                            System.out.println("Sorry! The phone number you entered is not in our system :(");
                        }
                    } // Closing curly braces for the inner while loop and switch statement

                // The default statement for the outer switch
                default:
                    System.out.println("Invalid input! Exiting the program...");
                    System.exit(0);
                    break;
            }
        } // Closing curly braces for the outer while loop and switch statement
        System.out.println("Your request have been processed.\nThank you for choosing Beauty Salon. Have a nice day!");
    } // Closing the main method
}//SalonBooking class (main)
