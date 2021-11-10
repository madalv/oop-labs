package lab6;

import java.util.Date;

public class Patient extends Person {
    protected String id;
    protected Integer age;
    protected Date accepted;
    protected History sickness;
    protected String[] prescriptions;
    protected String[] allergies;
    protected String[] specialReqs;
}
