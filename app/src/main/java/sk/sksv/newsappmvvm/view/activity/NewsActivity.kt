package sk.sksv.newsappmvvm.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sk.sksv.newsappmvvm.R

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}