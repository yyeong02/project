package com.project.teamproject.service;

import com.project.teamproject.domain.entity.CalendarEntity;
import com.project.teamproject.domain.repository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


@RequiredArgsConstructor
@Service
public class CalendarService {

    private final CalendarRepository calendarRepository;

    public CalendarEntity create(String id, String medicine, Date startdate, Date finishdate, boolean detail1, boolean detail2, boolean detail3, boolean detail4, boolean detail5, String memo){
        CalendarEntity cal = new CalendarEntity();
        cal.setId(id);
        cal.setMedicine(medicine);
        cal.setStartdate(startdate);
        cal.setFinishdate(finishdate);
        cal.setDetail1(detail1);
        cal.setDetail2(detail2);
        cal.setDetail3(detail3);
        cal.setDetail4(detail4);
        cal.setDetail5(detail5);
        cal.setMemo(memo);
        this.calendarRepository.save(cal);
        return cal;
    }

}
