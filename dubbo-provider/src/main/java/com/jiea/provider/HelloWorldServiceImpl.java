package com.jiea.provider;

import com.jiea.api.remote.HelloWorldService;
import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    private static int count = 0;

    public String getName() {
        System.out.println("被调用次数" + ++count);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello World";
    }
}
