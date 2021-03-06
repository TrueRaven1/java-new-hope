package model1.enums;

public enum CourseName {
    QA1("Manual testing"),
    QA2("Automation testing"),
    QA3("Advansed testing"),
    JAVA("Web project development"),
    WEB("Front-end basics");

    private String name;

    CourseName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
