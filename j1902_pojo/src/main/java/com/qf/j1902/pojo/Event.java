package com.qf.j1902.pojo;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/07/23
*/
@Data
public class Event {
    /**
	* 
	*/
    private Integer eventId;

    /**
	* 
	*/
    private String eventTitle;

    /**
	* 
	*/
    private String eventContect;

    /**
	* 
	*/
    private Date startTime;

    /**
	* 
	*/
    private Date endTime;

    /**
	* 
	*/
    private String eventPhoto;
}