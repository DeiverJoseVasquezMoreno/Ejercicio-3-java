package src.models;

public class CastingAgent {
    private String employeeNumber;
    private String dni;
    private String name;
    private String address;

    public CastingAgent(String employeeNumber, String dni, String name, String address) {
        this.employeeNumber = employeeNumber;
        this.dni = dni;
        this.name = name;
        this.address = address;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
}
