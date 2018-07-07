package com.shx;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎！", "小A", new Date());
        Notice notice2 = new Notice(2, "你好！", "小B", new Date());
        Notice notice3 = new Notice(3, "再见！", "小C", new Date());

        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);
        noticeList.remove(1);
        

        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(((Notice)(noticeList.get(i))).getTitle());
        }
    }
}
