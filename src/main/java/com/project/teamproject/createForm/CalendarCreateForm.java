package com.project.teamproject.createForm;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Getter
@Setter
public class CalendarCreateForm {

    @Size(max = 10)
    private String id;

    @NotEmpty
    @Size(max = 10)
    private String medicine;

    @NotNull
//    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startdate;

    @NotNull
//    @JsonFormat(pattern="yyyy-MM-dd")
    private Date finishdate;

    private boolean detail1;

    private boolean detail2;

    private boolean detail3;

    private boolean detail4;

    private boolean detail5;

    private String memo;
}
