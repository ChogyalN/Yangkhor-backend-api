package com.yangkhor.yangkhorbackend.announcement;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String summary;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
