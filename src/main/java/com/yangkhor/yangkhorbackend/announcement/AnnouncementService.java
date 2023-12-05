package com.yangkhor.yangkhorbackend.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {

    @Autowired
    public AnnouncementRepository repository;

    public Announcement addAnnouncement(Announcement announcement){
       return repository.save(announcement);
    }

    public List<Announcement> getAnnouncement(){
        return repository.findAll();
    }
}
