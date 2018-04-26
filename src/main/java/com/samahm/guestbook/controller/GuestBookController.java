package com.samahm.guestbook.controller;

import com.samahm.guestbook.domin.GuestBookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.samahm.guestbook.service.GuestBookService;

import java.util.List;


@RequestMapping ("/api")
@RestController
public class GuestBookController {

    @Autowired
    private GuestBookService guestBookService;

    @GetMapping("/")
    public List<GuestBookEntry> getAll() {
        return guestBookService.findAllEntries();
    }


    @GetMapping("/comments")
    public List<GuestBookEntry> getAllComments() {
        return guestBookService.findAllEntries();
    }


    @GetMapping("/comment/{id}")
    public GuestBookEntry findGuestBookEntryById(@PathVariable("id") Integer id) {
        return this.guestBookService.findGuestBookEntryById(id);
    }

    @DeleteMapping("/comment/{id}")
    public void deleteGuestBookEntryById(@PathVariable("id") Integer id) {
        this.guestBookService.deleteGuestBookEntryById(id);
    }

    @GetMapping("/user/{user}")
    public List<GuestBookEntry> findGuestBookEntryByUser(@PathVariable("user") String user) {
        return this.guestBookService.findGuestBookEntryByUser(user);
    }

    @PostMapping("/add")
    public void addComment(@RequestBody GuestBookEntry guestBookEntry) {
        this.guestBookService.save(guestBookEntry);
    }

    @PostMapping("/update")
    public void updateComment(@RequestBody GuestBookEntry guestBookEntry) {
        this.guestBookService.save(guestBookEntry);
    }
}