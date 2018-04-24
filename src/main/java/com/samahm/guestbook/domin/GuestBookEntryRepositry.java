package com.samahm.guestbook.domin;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GuestBookEntryRepositry extends CrudRepository <GuestBookEntry, Integer> {
    @Override
    List <GuestBookEntry> findAll ();
    GuestBookEntry findGuestBookEntryById (Integer id);
    List<GuestBookEntry> findGuestBookEntryByUser (String user);
}
