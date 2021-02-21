package com.rj.bd;
/**
 * @desc 使用hutool工具的日期工具
 * @author rjx
 */
import java.util.Date;

import cn.hutool.core.date.DateUtil;

public class Data{
	public static void main(String[] args) {
		String dateTime1 = "2020-02-18 20:10";
		String dateTime2 = "2021-02-18";
		String dateTime3 = "10:10:45";
		String dateTime4 = "2018-02-18 10:23";

		// 将不同的格式转换为Date对象 格式：yyyy-MM-dd HH:mm:ss
		Date date1 = DateUtil.parse(dateTime1);
		System.out.println("date1:" + date1.toString());
		Date date2 = DateUtil.parse(dateTime2);
		System.out.println("date2:" + date2.toString());
		Date date3 = DateUtil.parse(dateTime3);
		System.out.println("date3:" + date3.toString());
		Date date4 = DateUtil.parse(dateTime4);
		System.out.println("date4:" + date4.toString());

		// 使用DateUtil.parse(String,String):Date 转换为指定格式的Date对象
		Date date5 = DateUtil.parse(dateTime1, "yyyy-MM-dd");
		System.out.println("date5:" + date5.toString());
	}
}

