package com.hht.wms.core.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil
{
  public static final String ISO_DATE_FORMAT = "dd-MMM-yyyy";
  public static final String ISO_DATE_FORMAT_CROSSBAR = "yyyy-MM-dd";
  public static final String ISO_TIME_FORMAT = "HH:mm:ss";
  public static final String ISO_TIME_WITH_MILLISECOND_FORMAT = "HH:mm:ss.SSS";
  public static final String ISO_DATETIME_FORMAT = "dd-MMM-yyyy HH:mm:ss";
  public static final String ISO_DATETIME_WITH_MILLISECOND_FORMAT = "dd-MMM-yyyy HH:mm:ss.SSS";
  public static final String ISO_DATETIME_WITH_SECOND_FORMAT = "yyyy-MM-dd HH:mm:ss";
  public static final String ISO_SHORT_DATE_FORMAT = "dd-MMM-yy";
  public static final String AMR_FULL_DATETIME_FORMAT = "yyyy/MM/dd HH:mm:ss.SSS";
  public static final String FULL_DATETIME_FORMAT = "yyyy/MM/dd HH:mm:ss";
  public static final String AMR_NOMAL_DATE_FORMAT = "yyyy/MM/dd";
  public static final String AMR_SHORT_DATE_FORMAT = "yyyy/MM";
  public static final String AMR_DATE_WITHOUT_SLASH_FORMAT = "yyyyMMdd";
  public static final String AMR_ARS_DATE_FORMAT = "yyyyMMdd";
  
  public static void main(String[] args) {
	System.out.println(DateUtil.getNowTime(DateUtil.ISO_DATE_FORMAT_CROSSBAR));
  }

  public static String getNowTime()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
    Calendar c = Calendar.getInstance();
    c.setTime(new Date());
    return sdf.format(c.getTime());
  }

  public static String getNowTime(String format)
  {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    Calendar c = Calendar.getInstance();
    c.setTime(new Date());
    return sdf.format(c.getTime());
  }

  public static String getToday(String sFormat) {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
    GregorianCalendar gc = new GregorianCalendar();
    gc.setTime(date);
    String s1 = sdf.format(gc.getTime());
    return s1;
  }

  public static String getToday() {
    return getToday("yyyy/MM/dd");
  }

  public static String getYesterday() throws ParseException {
    return getRelativeDate(getToday(), 0, 0, -1);
  }

  public static String getFillInDate(String s)
  {
    String sFillDate = "";
    switch (s.length())
    {
    case 7:
      sFillDate = s.substring(0, 4) + " 年 " + s.substring(5) + " 月";
      break;
    case 10:
      sFillDate = s.substring(0, 4) + " 年 " + s.substring(5, 7) + " 月 " + s.substring(8) + " 日 ";
    }

    return sFillDate;
  }

  public static String getRelativeDate(Date date, int iYear, int iMonth, int iDate, String sFormat)
  {
    SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
    GregorianCalendar gc = new GregorianCalendar();

    gc.setTime(date);

    gc.add(1, iYear);
    gc.add(2, iMonth);
    gc.add(5, iDate);

    return sdf.format(gc.getTime());
  }

  public static String getRelativeDate(String sDate, int iYear, int iMonth, int iDate, String sFormat)
    throws ParseException
  {
    if (sDate == null) return null;
    Date date = parseString2Date(sDate, "yyyy/MM/dd");
    return getRelativeDate(date, iYear, iMonth, iDate, sFormat);
  }

  public static String getRelativeDate(Date date, int iYear, int iMonth, int iDate) {
    return getRelativeDate(date, iYear, iMonth, iDate, "yyyy/MM/dd");
  }

  public static String getRelativeDate(String sDate, int iYear, int iMonth, int iDate) throws ParseException
  {
    return getRelativeDate(sDate, iYear, iMonth, iDate, "yyyy/MM/dd");
  }

  public static String getRelativeMonth(Date date, int iYear, int iMonth, String s) {
    return getRelativeDate(date, iYear, iMonth, 0, s);
  }

  public static String getRelativeMonth(String sDate, int iYear, int iMonth, String s) throws ParseException
  {
    return getRelativeDate(sDate, iYear, iMonth, 0, s);
  }

  public static String getRelativeMonth(Date date, int iYear, int iMonth) {
    return getRelativeDate(date, iYear, iMonth, 0, "yyyy/MM");
  }

  public static String getRelativeMonth(String sDate, int iYear, int iMonth) throws ParseException {
    return getRelativeDate(sDate, iYear, iMonth, 0, "yyyy/MM");
  }

  public static boolean monthEnd(String sEndDate)
    throws ParseException
  {
    String sTommorow = getRelativeDate(sEndDate, 0, 0, 1);
    if (sTommorow == null) return false;

    return (sTommorow.substring(8, 10).equals("01"));
  }

  public static String formatDate(String sDate)
  {
    if (sDate.length() == 8)
      sDate = sDate.substring(0, 4) + '/' + sDate.substring(4, 6) + '/' + sDate.substring(6);
    return sDate;
  }

  public static Date parseString2Date(String datestring) throws ParseException
  {
    return parseString2Date(datestring, "yyyy/MM/dd");
  }

  public static Date parseString2Date(String datestring, String format)
    throws ParseException
  {
    if (datestring == null) return null;

    String sDate = "";
    if (datestring.length() == 7)
      sDate = datestring + "/01";
    else
      sDate = datestring;

    Date date = new SimpleDateFormat(format).parse(sDate);
    return date;
  }



  public static String getMonthEnd(String date, String format)
    throws ParseException
  {
    if (date == null) return date;
    String sDate = date.substring(0, 7) + "/01";
    return getRelativeDate(sDate, 0, 1, -1, format);
  }

  public static String getMonthEnd(String date)
    throws ParseException
  {
    return getMonthEnd(date, "yyyy/MM/dd");
  }

  public static int getDateOfWeek(String dateString, String format)
    throws ParseException
  {
    Date date = parseString2Date(dateString);
    GregorianCalendar gc = new GregorianCalendar();
    gc.setTime(date);
    int iWeekFiled = gc.get(7);
    return iWeekFiled;
  }

  public static int getDateOfWeek(String date) throws ParseException {
    return getDateOfWeek(date, "yyyy/MM/dd");
  }

  public static int compareDate(String dateA, String dateB, String format)
  {
    if ((dateA == null) || (dateA.length() == 0) || (dateB == null) || (dateB.length() == 0))
      return -1;

    double diffDays = 0D;
    Date dateOne = null;
    Date dateTwo = null;
    try {
      dateOne = parseString2Date(dateA, format);
      dateTwo = parseString2Date(dateB, format);
      double diffMs = dateOne.getTime() - dateTwo.getTime();
      diffDays = diffMs / 86400000.0D;
    } catch (ParseException pe) {
      diffDays = -1.0D;

    }
    return new Double(diffDays).intValue();
  }
/**
 * 
 * @param timeA
 * @param timeB
 * @param format
 * @return
 * @throws Exception 
 */
  
public static int compareMs(String timeA, String timeB, String format) throws Exception{
  if ((timeA == null) || (timeA.length() == 0) || (timeB == null) || (timeB.length() == 0))
    return -1;

  double diffMs = 0D;
  Date dateOne = null;
  Date dateTwo = null;
  try {
    dateOne = parseString2Date(timeA, format);
    dateTwo = parseString2Date(timeB, format);
    diffMs = dateOne.getTime() - dateTwo.getTime();
  } catch (ParseException pe) {
	  diffMs = -1.0D;

    throw pe;
  }

    return new Double(diffMs).intValue();
  }

  public static int compareDate(String dateA, String dateB) {
    return compareDate(dateA, dateB, "yyyy/MM/dd");
  }



  public static Calendar getCalendar(String date) throws ParseException
  {
    return getCalendar(date, "yyyy/MM/dd");
  }

  public static Calendar getCalendar(String date, String format) throws ParseException
  {
    Calendar cal = Calendar.getInstance();
    cal.setTime(parseString2Date(date, format));
    return cal;
  }
  public static String parseDateToString(Date date,String sFormat) {
    SimpleDateFormat sdf = new SimpleDateFormat(sFormat);
    GregorianCalendar gc = new GregorianCalendar();
    gc.setTime(date);
    String s1 = sdf.format(gc.getTime());
    return s1;
  }
  
  /**
   *  加减天数 by cql
   * 
   * @date:2016年4月10日下午5:00:44
   * @param date
   * @param dateIndex
   * @return
   */
  public static String addDays(Date date , int dateIndex , String dateFormat){
      if(null==date){
          throw new IllegalArgumentException("The date must not be null");
      }
      Calendar c = Calendar.getInstance();
      c.setTime(date);
      c.add(Calendar.DATE, dateIndex);
      return new SimpleDateFormat(dateFormat).format(c.getTime());
  }

  /**
   * 在原日期的基础上加减小时数
   * @param date
   * @param i
   * @return
   */
  public static Date addHourOfDate(Date date,int i){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.add(Calendar.HOUR_OF_DAY, i);
    Date newDate = c.getTime();
    return newDate;
  }

  /**
   * 在原日期的基础上加减分钟数
   * @param date
   * @param i
   * @return
   */
  public static Date addMinuteOfDate(Date date,int i){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.add(Calendar.MINUTE, i);
    Date newDate = c.getTime();
    return newDate;
  }
  
}