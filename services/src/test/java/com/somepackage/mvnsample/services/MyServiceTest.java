package com.somepackage.mvnsample.services;

import com.somepackage.mvnsample.testutils.TestPrefix;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void test() {
        String testPrefix = TestPrefix.SOME_PREFIX;
        String untrimmedValue = "   untrimmed value    ";

        MyService service = new MyService();

        String result = service.trimWithPrefix(testPrefix, untrimmedValue);
        Assert.assertEquals(result, testPrefix + ": " + StringUtils.trim(untrimmedValue));
    }
}
