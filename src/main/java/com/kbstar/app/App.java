package com.kbstar.app;

import com.kbstar.frame.TV;
import com.kbstar.tv.*;

public class App {
    public static void main(String args[]){
        TV tv = new LTV();
//        TV tv = new STV();
        tv.turnOn();
    }
}

// 이렇게 interface를 구상해두면, TV가 늦게 만들어지더라도 앱을 미리 만들어둘 수 있음.
