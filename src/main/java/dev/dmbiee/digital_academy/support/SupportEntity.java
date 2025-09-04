package dev.dmbiee.digital_academy.support;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "supports")
public class SupportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long support_id;
    private long request_id;
    private long support_user_id;
    private LocalDate support_date;

    public SupportEntity() {
    }

    public SupportEntity(long support_id, long request_id, long support_user_id, LocalDate support_date) {
        this.support_id = support_id;
        this.request_id = request_id;
        this.support_user_id = support_user_id;
        this.support_date = support_date;
    }

    public long getSupport_id() {
        return support_id;
    }

    public void setSupport_id(long support_id) {
        this.support_id = support_id;
    }

    public long getRequest_id() {
        return request_id;
    }

    public void setRequest_id(long request_id) {
        this.request_id = request_id;
    }

    public long getSupport_user_id() {
        return support_user_id;
    }

    public void setSupport_user_id(long support_user_id) {
        this.support_user_id = support_user_id;
    }

    public LocalDate getSupport_date() {
        return support_date;
    }

    public void setSupport_date(LocalDate support_date) {
        this.support_date = support_date;
    }
}
