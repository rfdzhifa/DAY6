package com.example.recyclerview_rifdahinasnazhifah_29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_rifdahinasnazhifah_29.Fragment.homefragment
import com.example.recyclerview_rifdahinasnazhifah_29.Fragment.musicfragment
import com.example.recyclerview_rifdahinasnazhifah_29.Fragment.profilefragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        //fragment
        val homeFragment = homefragment()
        val musicFragment = musicfragment()
        val profileFragment = profilefragment()

        makeCurrentFragment(homeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottomnav)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.music -> makeCurrentFragment(musicFragment)
                R.id.profile -> makeCurrentFragment(profileFragment)
            }
            true
        }

        //isi recyclerview
        val memberlist = listOf<DAY6>(
            DAY6(
                R.drawable.outoftheblue,
                "문득",
                "2021-09-27"
            ),
            DAY6(
                R.drawable.eternal,
                "Eternal",
                "2021-09-06"
            ),
            DAY6(
                R.drawable.rightthroughme,
                "Right Through Me",
                "2021-07-05"
            ),
            DAY6(
                R.drawable.negentropy,
                "The Book of Us : Negentropy",
                "2021-04-19"
            ),
            DAY6(
                R.drawable.gluon,
                "The Book of Us : Gluon",
                "2020-08-31"
            ),
            DAY6(
                R.drawable.thedemon,
                "The Book of Us : The Demon",
                "2020-05-11"
            ),
            DAY6(
                R.drawable.entropy,
                "The Book of Us : Entropy",
                "2019-10-22"
            ),
            DAY6(
                R.drawable.gravity,
                "The Book of Us : Gravity",
                "2019-07-15"
            ),
            DAY6(
                R.drawable.rememberus,
                "Remember Us : Youth 2",
                "2018-12-10"
            ),
            DAY6(
                R.drawable.beautifulfeeling,
                "Beautiful Feeling",
                "2018-09-10"
            ),
            DAY6(
                R.drawable.shootme,
                "Shoot Me : Youth 1",
                "2018-06-26"
            ),
            DAY6(
                R.drawable.moonrise,
                "MOONRISE",
                "2017-12-06"
            ),
            DAY6(
                R.drawable.november,
                "Every DAY6 November",
                "2017-11-06"
            ),
            DAY6(
                R.drawable.october,
                "Every DAY6 October",
                "2017-09-29"
            ),
            DAY6(
                R.drawable.september,
                "Every DAY6 September",
                "2017-09-06"
            ),
            DAY6(
                R.drawable.august,
                "Every DAY6 August",
                "2017-08-07"
            ),
            DAY6(
                R.drawable.july,
                "Every DAY6 July",
                "2017-07-06"
            ),
            DAY6(
                R.drawable.sunrise,
                "Sunrise",
                "2017-06-07"
            ),
            DAY6(
                R.drawable.may,
                "Every DAY6 May",
                "2017-05-08"
            ),
            DAY6(
                R.drawable.april,
                "Every DAY6 April",
                "2017-04-06"
            ),
            DAY6(
                R.drawable.march,
                "Every DAY6 March",
                "2017-03-06"
            ),
            DAY6(
                R.drawable.february,
                "Every DAY6 February",
                "2017-02-06"
            ),
            DAY6(
                R.drawable.january,
                "Every DAY6 January",
                "2017-01-06"
            ),
            DAY6(
                R.drawable.daydream,
                "DAYDREAM",
                "2016-03-30"
            ),
            DAY6(
                R.drawable.theday,
                "The Day",
                "2015-09-07"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.memberlist)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter(this, memberlist) {
            val intent = Intent(this, DetailDiscography::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }

    //fragment
    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}
