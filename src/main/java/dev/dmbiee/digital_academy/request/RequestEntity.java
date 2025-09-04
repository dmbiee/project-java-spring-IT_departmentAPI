package dev.dmbiee.digital_academy.request;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long request_id;
    private LocalDate request_date;
    private long topic_id;
    private String description;

    public RequestEntity() {
    }

    public RequestEntity(long request_id, LocalDate request_date, long topic_id, String description) {

        this.request_id = request_id;
        this.request_date = request_date;
        this.topic_id = topic_id;
        this.description = description;
    }

    public long getRequest_id() {
        return request_id;
    }

    public void setRequest_id(long request_id) {
        this.request_id = request_id;
    }

    public LocalDate getRequest_date() {
        return request_date;
    }

    public void setRequest_date(LocalDate request_date) {
        this.request_date = request_date;
    }

    public long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(long topic_id) {
        this.topic_id = topic_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
