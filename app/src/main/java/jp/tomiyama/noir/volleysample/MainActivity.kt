package jp.tomiyama.noir.volleysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageRequester.setImageFromUrl(
            product_image,
            "https://www.shinchosha.co.jp/images_v2/book/cover/102501/102501_l.jpg"
        )
    }
}
