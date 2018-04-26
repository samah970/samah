package com.samahm.guestbook.service;

import com.samahm.guestbook.domin.GuestBookEntry;
import com.samahm.guestbook.domin.GuestBookEntryRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GuestBookService {
    @Autowired

    private GuestBookEntryRepositry guestBookEntryRepository;

    public List <GuestBookEntry> findAllEntries(){
        return this.guestBookEntryRepository.findAll();

    }
    public GuestBookEntry findGuestBookEntryById (Integer id) {
        return this.guestBookEntryRepository.findGuestBookEntryById (id);
    }


    public List <GuestBookEntry> findGuestBookEntryByUser (String user) {
        return this.guestBookEntryRepository.findGuestBookEntryByUser (user);
    }
    public void deleteGuestBookEntryById (Integer id) {
        this.guestBookEntryRepository.delete (id);
    }

    public void save (GuestBookEntry newEntry) {
        this.guestBookEntryRepository.save (newEntry);
    }

    public GuestBookEntry findOne (Integer id) {
        return this.guestBookEntryRepository.findOne (id);
    }
}