package com.somepackage.mvnsample.services;

import org.apache.commons.lang3.StringUtils;

public class MyService {

    public String trimWithPrefix(String prefix, String value) {
        // class "TestPrefix" can't be found.

        String trimmedValue = StringUtils.trim(value);
        return prefix + ": " + trimmedValue;
    }
}
