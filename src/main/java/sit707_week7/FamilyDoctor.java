package sit707_week7;

import java.util.Objects;

public class FamilyDoctor {

    private String doctorEmail = "mydoctor@gmail.com";

    // Getters and setters for the fields if needed

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FamilyDoctor that = (FamilyDoctor) obj;
        return Objects.equals(doctorEmail, that.doctorEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorEmail);
    }
}
