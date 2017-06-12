package com.example.n9262.news_demo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.example.n9262.news_demo.R;
import com.example.n9262.news_demo.data.CommentData;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * Created by n9262 on 2017/6/11.
 */
public class ReadActivity extends AppCompatActivity {
    private WebView newsWebView;
    private String url;
    private String newsKey;
    private String newsTitle;
    public static   final  String URL_EXTRA = "URL_EXTRA";
    public static   final  String KEY_EXTRA = "KEY_EXTRA";
    public static   final  String TITLE_EXTRA = "TITLE_EXTRA";
    private EditText edtComment;
    private Button btnComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        newsWebView = (WebView) findViewById(R.id.news_webview);
        url = getIntent().getStringExtra(URL_EXTRA);
        newsKey = getIntent().getStringExtra(KEY_EXTRA);
        newsTitle = getIntent().getStringExtra(TITLE_EXTRA);

        if(url != null && url.length()>0){
            newsWebView.loadUrl(url);
        }

        ininCommentViews();
    }

    private void ininCommentViews() {
        edtComment = (EditText) findViewById(R.id.edt_comment);
        btnComment = (Button) findViewById(R.id.btn_comment);

        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                BmobUser user = BmobUser.getCurrentUser();
//                if(user == null){
//                    startActivity(new Intent(ReadActivity.this, LoginActivity.class));
//                    return;
//                }
//                String phone = BmobUser.getCurrentUser().getMobilePhoneNumber();

                String phone = "18888888888";
                String content = edtComment.getText().toString();
                CommentData data = new CommentData();
                data.setContent(content);
                data.setNewsKey(newsKey);
                data.setNewsTitle(newsTitle);
                data.setPhone(phone);
                data.save(new SaveListener<String>() {
                    @Override
                    public void done(String s, BmobException e) {
                        if(e == null){
                            Log.e("AAA", "save comment success");
                        }
                    }
                });
            }
        });
    }
}
