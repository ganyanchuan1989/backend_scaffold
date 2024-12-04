package com.gxz.backend.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class MyUtils {
    public static String generateCode(String prefix){
        String rStr = getRandomStr(3);
        String dateStr= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHH:mm:ss.SSS"));
        String ret = dateStr + rStr;
        return ret;
    }

    public static String getRandomStr(int len){
        Random r = new Random();
        double start = Math.pow(10, len);
        int ret = (int) (start + r.nextDouble() * start);
        return Integer.toString(ret);
    }


    public static List<Double> getRealSalary(double salary, int leave){
        // 事假扣除
        Double leaveMoney = salary / 22 *  leave;
        // 公积金
        Double providentFundMoney = salary * 0.07 ;
        // 社保
        Double socialSecurity = salary * 0.08;
        // 需要扣税工资
        Double needTaxSalary = salary - leaveMoney - providentFundMoney - socialSecurity;
        // 个税
        Double taxMoney = kouShui(needTaxSalary);
        // 真实工资
        Double realSalary = salary - leaveMoney - providentFundMoney - socialSecurity - taxMoney;

        List<Double> list = new ArrayList<>();
        list.add(leaveMoney);
        list.add(providentFundMoney);
        list.add(socialSecurity);
        list.add(taxMoney);
        list.add(realSalary);
        return list;
    }

    public static Double kouShui(double salary) {
        if(salary <= 5000) {
            return 0.0;
        }

        Double need = salary - 5000;
        if(need <= 3000) {
            return need * 0.03;
        } else if(need >3000 && need <= 12000){
            return (need * 0.1) - 210;
        } else if(need >12000 && need <= 25000) {
            return (need * 0.2) - 1410;
        } else if(need > 25000 && need <= 35000){
            return (need * 0.25) - 2660;
        } else if(need > 35000 && need <= 55000){
            return (need * 0.35) - 2660;
        } else if( need > 55000 && need <= 80000){
            return (need * 0.45) - 2660;
        } else if(need > 80000){
            return need * 0.45 - 15160;
        }
        return 0.0;
    }

    public static String getLastDayOfMonth(int year,int month)
    {
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
        return lastDayOfMonth;
    }
}
