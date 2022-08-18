package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable {
    private int id;
    private Nurse nurse;
    private patient patient;
    private Date date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public model.patient getPatient() {
        return patient;
    }

    public void setPatient(model.patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void shedule(Date date, String time) {

    }
}
