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


}
