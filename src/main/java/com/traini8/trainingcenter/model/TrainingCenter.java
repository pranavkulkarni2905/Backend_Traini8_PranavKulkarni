package com.traini8.trainingcenter.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "training_centers")
public class TrainingCenter {

    @Id
    private String id;

    @NotBlank(message = "Center Name is required")
    @Size(max = 40, message = "Center Name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center Code is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @NotNull(message = "Address is required")
    private Address address;

    @Min(value = 1, message = "Student Capacity must be at least 1")
    private int studentCapacity;

    private List<String> coursesOffered;

    private long createdOn;  // Epoch timestamp

    @Email(message = "Invalid Email Format")
    private String contactEmail;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone Number must be exactly 10 digits")
    @NotBlank(message = "Contact Phone is required")
    private String contactPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotBlank(message = "Center Name is required") @Size(max = 40, message = "Center Name must be less than 40 characters") String getCenterName() {
        return centerName;
    }

    public void setCenterName(@NotBlank(message = "Center Name is required") @Size(max = 40, message = "Center Name must be less than 40 characters") String centerName) {
        this.centerName = centerName;
    }

    public @NotBlank(message = "Center Code is required") @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be exactly 12 alphanumeric characters") String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(@NotBlank(message = "Center Code is required") @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be exactly 12 alphanumeric characters") String centerCode) {
        this.centerCode = centerCode;
    }

    public @NotNull(message = "Address is required") Address getAddress() {
        return address;
    }

    public void setAddress(@NotNull(message = "Address is required") Address address) {
        this.address = address;
    }

    @Min(value = 1, message = "Student Capacity must be at least 1")
    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(@Min(value = 1, message = "Student Capacity must be at least 1") int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public @Email(message = "Invalid Email Format") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email(message = "Invalid Email Format") String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public @Pattern(regexp = "^[0-9]{10}$", message = "Phone Number must be exactly 10 digits") @NotBlank(message = "Contact Phone is required") String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(@Pattern(regexp = "^[0-9]{10}$", message = "Phone Number must be exactly 10 digits") @NotBlank(message = "Contact Phone is required") String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
