package com.project.teamproject.controller;

import com.project.teamproject.createForm.CalendarCreateForm;
import com.project.teamproject.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@RequestMapping("/calendar")
public class CalendarController {

    private final CalendarService calendarService;

    @GetMapping("/")
    public String calendar() { return "calendar"; }

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
        return "redirect:/calendar";
    }

}
