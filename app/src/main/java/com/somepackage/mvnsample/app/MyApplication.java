package com.somepackage.mvnsample.app;

import com.somepackage.mvnsample.services.MyService;
import org.apache.commons.lang3.StringUtils;

public class MyApplication {

    public static void main(String[] args) {
        // Ermoeglicht durch die Dependency auf "mvnsample-services"
        MyService service = new MyService();
        String result = service.trimWithPrefix("byService", "   is this trimmed?    ");
        System.out.println(result);

        // Zeigt, dass die compile-Dependencies von "services" auch hier verfuegbar sind.
        String myTrimmedValue = StringUtils.trim("   I can trim on my own too!   ");
        System.out.println(myTrimmedValue);
    }
}
