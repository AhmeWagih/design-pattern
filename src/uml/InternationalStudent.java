package uml;

public class InternationalStudent extends Student{
    private String countryOfOrigin;
    private String visaStatus;

    public InternationalStudent(int studentId, String name, int age, String visaStatus, String countryOfOrigin) {
        super(studentId, name, age);
        this.visaStatus = visaStatus;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getVisaStatus() {
        return visaStatus;
    }
}
