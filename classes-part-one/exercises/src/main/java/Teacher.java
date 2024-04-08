public class Teacher {
//Fields
    private String firstName;
    private String lastName;
    public String subject;
    public double yearsTeaching;

//setters
public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public void setSubject(String subject) {
    this.subject = subject;
}
public void setYearsTeaching(double yearsTeaching) {
    this.yearsTeaching = yearsTeaching;
}

//getters

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getSubject() {
    return subject;
}

public double getYearsTeaching() {
    return yearsTeaching;
}

}
