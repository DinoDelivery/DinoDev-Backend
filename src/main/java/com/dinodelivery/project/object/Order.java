package com.dinodelivery.project.object;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "price")
    private int price;

    @Column(name = "card_payment")
    private boolean cardPayment;

    @Column(name = "delivery_date")
    private String deliveryDate;

    @Column(name = "address")
    private String address;

    @Column(name = "is_complete")
    private boolean isComplete;

    @Column(name = "client_phone_number")
    private boolean clientPhoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCardPayment() {
        return cardPayment;
    }

    public void setCardPayment(boolean cardPayment) {
        this.cardPayment = cardPayment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public boolean isClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(boolean clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }
}
