package com.practice;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "2018-09-18T17:29:10.371+05:30";
//		str = new StringBuilder(str).deleteCharAt(str.length() - 3).toString();
//		System.out.println("Date string :: " + str);
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//
//		try {
//			Date date = (Date) formatter.parse(str);
//			System.out.println("Date string :: " + date.toString());
//
//			SimpleDateFormat formatterNew = new SimpleDateFormat("MMM dd");
//
//			System.out.println("Date string :: " + formatterNew.format(date));
//
//			SimpleDateFormat formatterNew1 = new SimpleDateFormat("dd MMM");
//			System.out.println("Date string :: " + formatterNew1.format(date));
//
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

        Boolean temp = true;

		if(null != temp) {
            System.out.println("Formated cur :: "+getFormatedCurrency("1234567"));
        }


	}
	
	public static String getFormatedCurrency(String currency) {
        String formatedValue = "";
        String[] temp;
        double amount;
        DecimalFormat df;
        try {
            if (currency != null && !"".equals(currency)) {
                amount = Double.parseDouble(currency);
                df = new DecimalFormat("##########0.00");
                temp = df.format(amount).split("\\.");
                formatedValue = getFormatedCurrency2(temp[0]) + "." + temp[1];
            }
        } catch (Exception e) {
            // TODO: handle exception
            formatedValue = "0.00";
        }
        return formatedValue;
    }

    public static String getFormatedCurrency2(String currency) {
        String amount;
        long amountln = Long.parseLong(currency);
        int i = 0;
        int lenght = 0;
        amount = Long.toString(amountln);
        lenght = amount.length();
        StringBuffer Amountbuf = new StringBuffer(amount);
        if (amountln > 999) {
            for (i = lenght; i > 0; i = i - 2) {
                if (i == lenght) {
                    i = i - 3;
                    Amountbuf = Amountbuf.insert(i, ",");
                } else {
                    Amountbuf = Amountbuf.insert(i, ",");
                }
            }
        }
        amount = Amountbuf.toString();
        return amount;
    }

}
