package kataBank;

import org.jbehave.core.steps.ParameterConverters;

import java.util.Date;

public class DateCreator {

    public static Date date(String dateString) {
        ParameterConverters.DateConverter dateConverter = new ParameterConverters.DateConverter();
        Date date = (Date) dateConverter.convertValue(dateString, Date.class);
        return date;
    }

}
