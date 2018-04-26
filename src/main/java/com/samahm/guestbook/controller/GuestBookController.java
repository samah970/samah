package com.samahm.guestbook.controller;

import com.samahm.guestbook.domin.GuestBookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.samahm.guestbook.service.GuestBookService;

import java.util.List;
<<<<<<< HEAD
@RequestMapping ("/api")
=======


>>>>>>> 0d6d3764ed105654bfba32ffe9772691d895e601
@RestController
public class GuestBookController {


    @Autowired
    private GuestBookService guestBookService;

<<<<<<< HEAD
    @GetMapping ("/comments")
    public List <GuestBookEntry> getAllComments () {
        return guestBookService.findAllEntries ();
=======
    @GetMapping("/comments")
    public List <GuestBookEntry> testMapping() {
        return guestBookService.findAllEntries();
>>>>>>> 0d6d3764ed105654bfba32ffe9772691d895e601
    }

    @GetMapping ("/comment/{id}")
    public GuestBookEntry findGuestBookEntryById (@PathVariable("id") Integer id) {
        return this.guestBookService.findGuestBookEntryById (id);
    }
    @DeleteMapping("/comment/{id}")
    public void deleteGuestBookEntryById (@PathVariable ("id") Integer id) {
        this.guestBookService.deleteGuestBookEntryById (id);
    }

    @GetMapping ("/user/{user}")
    public List <GuestBookEntry> findGuestBookEntryByUser (@PathVariable ("user") String user) {
        return this.guestBookService.findGuestBookEntryByUser (user);
    }
<<<<<<< HEAD

    @PostMapping ("/add")
=======
    @PostMapping("/add")
>>>>>>> 0d6d3764ed105654bfba32ffe9772691d895e601
    public void addComment (@RequestBody GuestBookEntry guestBookEntry) {
        this.guestBookService.save (guestBookEntry);
    }

    @PostMapping ("/update")
    public void updateComment (@RequestBody GuestBookEntry guestBookEntry) {
        this.guestBookService.save (guestBookEntry);
    }
<<<<<<< HEAD

=======
>>>>>>> 0d6d3764ed105654bfba32ffe9772691d895e601
}