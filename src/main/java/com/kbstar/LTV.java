package com.kbstar;

public class LTV {
    public void turnon(){
        System.out.println("LTV Turn On");
    }
    public void turnoff(){
        System.out.println("LTV Turn Off");
    }
}
//일부러 메서드명을 소문자로만 써봄. 그래도 문제가 없다. 소문자로 앱에서 메서드를 호출하면 되긴되지만.
// 표준이 없어서 혼돈을 야기하고, 수정을 더 많이 하게 되는 문제.
// STV를 사용하다가 LTV를 사용하는 경우, 모든 코드를 다 까서 수정해야하는 것이 가장 큰 문제.
// 표준화가 되어 있다면, STV -> LTV로 바꾸면 끝날 일임.
// 코드가 많아지고 복잡해질수록 표준화가 안 되어있으면 수정이 어렵고 불가능해짐


