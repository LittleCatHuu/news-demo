package com.example.n9262.news_demo.data;

import cn.bmob.v3.BmobObject;

/**
 * Created by n9262 on 2017/6/12.
 */
public class CommentData extends BmobObject {
    private String phone;
    private String content;
    private String newsKey;
    private String newsTitle;
    private boolean isDel;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewsKey() {
        return newsKey;
    }

    public void setNewsKey(String newsKey) {
        this.newsKey = newsKey;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
}