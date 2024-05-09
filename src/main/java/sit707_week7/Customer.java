package sit707_week7;

import java.util.Objects;

public class Customer {

    private String firstName = "Siddharth";
    private String lastName = "Topra";
    private String email = "s222469478@deakin.edu.au";

    // Getters and setters for the fields if needed

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
