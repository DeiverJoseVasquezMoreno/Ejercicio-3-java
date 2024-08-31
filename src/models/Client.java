package src.models;

import src.enums.ActivityType;

public class Client {
    private String code;
    private String name;
    private String address;
    private String phone;
    private String contactPerson;
    private ActivityType activityType; // Can be "fashion", "advertising", or "cinema"

    public Client() {}

    public Client(
        String code,
        String name,
        String address,
        String phone,
        String contactPerson
    ) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.contactPerson = contactPerson;
        this.activityType = ActivityType.FASHION;
    }

    public Client(
        String code,
        String name,
        String address,
        String phone,
        String contactPerson,
        ActivityType activityType
    ) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.contactPerson = contactPerson;
        this.activityType = activityType;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public ActivityType getActivityType() {
        return this.activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
}
