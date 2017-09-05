package com.front.Service.serviceImpl;

import com.front.Service.parkingService;
import com.front.dao.parkingDao;
import com.front.entity.parking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class parkingServiceImpl implements parkingService {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    parkingDao parkingdao;

    public List<parking> getThreeMeter(BigDecimal longti,BigDecimal lati) {




        List<parking> SixMeterparkingList=parkingdao.queryBycondition(longti,lati);
        List<parking> threeMeterList=new ArrayList<parking>();


        BigDecimal num=new BigDecimal("0.01");
        for(int i=0;i<SixMeterparkingList.size();i++){
            parking p=SixMeterparkingList.get(i);
            if(p.getLatitude().add(num).compareTo(lati)==1
               &&p.getLatitude().subtract(num).compareTo(lati)==-1
               &&p.getLongitude().add(num).compareTo(longti)==1
               &&p.getLongitude().subtract(num).compareTo(longti)==-1
               ){
                threeMeterList.add(p);
            }

        }
        return threeMeterList;
    }
}