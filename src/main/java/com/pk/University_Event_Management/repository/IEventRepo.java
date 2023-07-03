package com.pk.University_Event_Management.repository;


import com.pk.University_Event_Management.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepo extends CrudRepository<Event, Long> {


}
