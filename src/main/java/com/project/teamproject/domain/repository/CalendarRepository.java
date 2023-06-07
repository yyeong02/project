package com.project.teamproject.domain.repository;

import com.project.teamproject.domain.entity.CalendarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<CalendarEntity, String> {
}
