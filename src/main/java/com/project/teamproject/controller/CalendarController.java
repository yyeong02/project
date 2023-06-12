package com.project.teamproject.controller;

import com.project.teamproject.createForm.CalendarCreateForm;
import com.project.teamproject.domain.entity.CalendarEntity;
import com.project.teamproject.domain.repository.CalendarRepository;
import com.project.teamproject.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/calendar")
public class CalendarController {

    private final CalendarService calendarService;
    private final CalendarRepository calendarRepository;

//    @GetMapping("/")
//    public String calendar() {
//        return "calendar";
//    }

    @GetMapping("/")
    public String calendar(Model model, Date date) {
        List<CalendarEntity> medicines = new ArrayList<>();

        Date newDate = date;

        System.out.println("lol");
        System.out.println(date);
        System.out.println(newDate);
        System.out.println(newDate==date);

        medicines = calendarRepository.findAll();

        model.addAttribute("medicines",medicines);
        model.addAttribute("newDate",newDate);
        return "calendar";
    }

    @GetMapping("/add")
    public String addCalendar(CalendarCreateForm calendarCreateForm) { return "addCalendar"; }

    @PostMapping("/add")
    public String addCalendar(@Valid CalendarCreateForm calendarCreateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("-------------------------------------오류 발생");
            return "addCalendar";
        }
        try{
            calendarService.create(calendarCreateForm.getMedicine(), calendarCreateForm.getStartdate(), calendarCreateForm.getFinishdate(), calendarCreateForm.isDetail1(), calendarCreateForm.isDetail2(), calendarCreateForm.isDetail3(), calendarCreateForm.isDetail4(), calendarCreateForm.isDetail5(), calendarCreateForm.getMemo());
        } catch (DataIntegrityViolationException e){
            e.printStackTrace();
            bindingResult.reject("addFailed","This user is already existed");
            return "addCalendar";
        } catch (Exception e){
            e.printStackTrace();
            bindingResult.reject("addFailed",e.getMessage());
            return "addCalendar";
        }
        return "redirect:/calendar/";
    }

}
