package net.epic.domain;


import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name="email")
@Data
public class emailDTO {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="from_email")
    private String from;
    @Column(name="to_email")
    private String to;
    @Column(name="mag_body")
    private String mag_body;


    @Column(name="created_date")
     private Date created_date;
    @Column(name="created_time")
     private Date created_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getCreated_date(Date date_out) {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getMag_body() {
        return mag_body;
    }

    public void setMag_body(String mag_body) {
        this.mag_body = mag_body;
    }
}
