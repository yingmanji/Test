package com.front.Service;

import com.front.entity.parking;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

public interface parkingService {
    //返回3公里内的停车场数据
    List<parking> getThreeMeter(BigDecimal longti, BigDecimal lati);
}