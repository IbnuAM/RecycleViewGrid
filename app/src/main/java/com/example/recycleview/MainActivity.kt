package com.example.recycleview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val kontakList: ArrayList<KontakModel> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kontakList.add(
            KontakModel(
                "Udin",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon1
                )
            )
        )

        kontakList.add(
            KontakModel(
                "Parno",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon1
                )
            )
        )

        kontakList.add(
            KontakModel(
                "Bambang",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon2
                )
            )
        )

        kontakList.add(
            KontakModel(
                "Cahyo",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon2
                )
            )
        )

        kontakList.add(
            KontakModel(
                "Kartika",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon3
                )
            )
        )

        kontakList.add(
            KontakModel(
                "Dona",
                BitmapFactory.decodeResource(
                    resources, R.drawable.icon3
                )
            )
        )

        layoutManager = GridLayoutManager(this, 3)
        rvKontakList.layoutManager = layoutManager
        rvKontakList.adapter = RecyclerViewAdapter(this, kontakList)
    }
}