package com.relativitas.maven.plugins;
import java.text.MessageFormat;

/**
*
* @author treym
*
*/
public final class I18n {

    /**
* @see java.text.MessageFormat
* @param fmt
* @param args
* @return
*/
    public static String format(final String fmt, final Object... args) {
        return MessageFormat.format(fmt, args);
    }

    /**
* prevent direct instance
*/
    private I18n() {
    }
}