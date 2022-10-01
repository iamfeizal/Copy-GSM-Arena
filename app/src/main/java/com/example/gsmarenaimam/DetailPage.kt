package com.example.gsmarenaimam

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailPage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Smartphone"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvOverview: TextView = findViewById(R.id.tv_set_overview)
        val tvRate: TextView = findViewById(R.id.tv_item_rate)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg: Int = intent.getIntExtra(EXTRA_PHOTO,0)
        val tOverview = intent.getStringExtra(EXTRA_OVERVIEW)
        val tRate = intent.getStringExtra(EXTRA_RATE)



        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvOverview.text = tOverview
        tvRate.text = tRate

        val btnShare: Button = findViewById(R.id.action_share)
        btnShare.setOnClickListener(this)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_RATE = "extra_rate"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.action_share -> {
                val gitt = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/iamfeizal"))
                startActivity(gitt)
            }
        }
    }
}
