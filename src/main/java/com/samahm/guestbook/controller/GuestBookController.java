package com.samahm.guestbook.controller;

import com.samahm.guestbook.domin.GuestBookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.samahm.guestbook.service.GuestBookService;

import java.util.List;

@RestController
public class GuestBookController {

    @Autowired
    private GuestBookService guestBookService;




    @GetMapping("/comments")


    public List<GuestBookEntry> getAllComments () {
        return guestBookService.findAllEntries ();
    }
}
