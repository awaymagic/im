package com.tuling.tim.common.util;

import com.tuling.tim.common.exception.TIMException;
import com.tuling.tim.common.pojo.RouteInfo;
import com.tuling.tim.common.enums.StatusEnum;

/**
 *
 * @since JDK 1.8
 */
public class RouteInfoParseUtil {

    public static RouteInfo parse(String info){
        try {
            String[] serverInfo = info.split(":");
            RouteInfo routeInfo =  new RouteInfo(serverInfo[0], Integer.parseInt(serverInfo[1]),Integer.parseInt(serverInfo[2])) ;
            return routeInfo ;
        }catch (Exception e){
            throw new TIMException(StatusEnum.VALIDATION_FAIL) ;
        }
    }
}
