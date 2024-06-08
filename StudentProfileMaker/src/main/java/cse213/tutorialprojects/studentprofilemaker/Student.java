package cse213.tutorialprojects.studentprofilemaker;

public class Student {
    public String firstname;
    public String lastname;
    public String email;
    public String gender;
    public String nationality;
    public String dob;

    public Student(String firstname, String lastname, String email, String gender, String nationality, String dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.nationality = nationality;
        this.dob = dob;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dob='" + dob + '\'' +
                '}' + "\n";
    }
}
