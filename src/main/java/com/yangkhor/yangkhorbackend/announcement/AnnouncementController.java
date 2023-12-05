package com.yangkhor.yangkhorbackend.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @PostMapping("/addAnnouncement")
    private Announcement addAnnouncement(Announcement announcement){
        return announcementService.addAnnouncement(announcement);
    }

    @GetMapping("/getAnnouncement")
    private List<Announcement> getAnnouncement(){
        return announcementService.getAnnouncement();
    }
}
