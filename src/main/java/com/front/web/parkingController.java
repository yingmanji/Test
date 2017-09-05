package com.front.web;

import com.front.Service.parkingService;
import com.front.dao.parkingDao;
import com.front.dto.Result;
import com.front.entity.parking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Controller
public class parkingController {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private parkingDao parkingdao;
    @Autowired
    private parkingService parkingservice;

    @RequestMapping(value = "/{nowlongitude}/{nowlatitude}/list",method = RequestMethod.GET)
    @ResponseBody
    public Result<List<parking>> list(@PathVariable("nowlongitude") BigDecimal nowlongitude,
                                      @PathVariable("nowlatitude") BigDecimal nowlatitude
                                      ,HttpServletResponse response  ){
        /*String longtitude="";
        String latitude="";
        Cookie cookieLongtitude=new Cookie("longtitude",longtitude);
        Cookie cookieLatitude=new Cookie("latitude",latitude);
        cookieLatitude.setMaxAge(60);
        cookieLongtitude.setMaxAge(60);*/

        try {
            List<parking> parkingList =parkingdao.queryBycondition(nowlongitude,nowlatitude);
            /*for(int i=0;i<parkingList.size();i++){

            }
            response.addCookie(cookieLongtitude);
            response.addCookie(cookieLatitude);*/
            return new Result<List<parking>>(true,parkingList);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return new Result<List<parking>>(false,e.getMessage());
        }

    }
    @ResponseBody
    @RequestMapping("/{parkingId}/parkingdetail")
    public Result<parking> parkingdetail(@PathVariable("parkingId") long parkingId){
        try{
            parking park=parkingdao.queryById(parkingId);
            return new Result<parking>(true,park);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return new Result<parking>(false,e.getMessage());
        }
    }

}