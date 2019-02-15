package com.blogspot.yourfavoritekaisar.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 1 supaya javascript dari webnya dapat di gunakan di aplikasi
        layoutwebView.settings.javaScriptEnabled

        layoutwebView.loadUrl("https://jabe.web.id/")


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_web_view, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when(item?.itemId){
        R.id.web1 -> {
            layoutwebView.loadUrl("https://jabe.web.id/")
            true
        }
        R.id.web2 -> {
            layoutwebView.loadUrl("https://jabe.web.id/team-2.html")
            true
        }
        R.id.Web3 -> {
            layoutwebView.loadUrl("https://jabe.web.id/team-4.html")
            true
        }
        else ->{
            super.onOptionsItemSelected(item)
        }
    }
}
