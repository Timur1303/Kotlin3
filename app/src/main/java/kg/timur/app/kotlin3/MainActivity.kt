package kg.timur.app.kotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import androidx.fragment.app.Fragment
import kg.timur.app.kotlin3.adapter.PagerAdapter
import kg.timur.app.kotlin3.fragments.FirstFragment
import kg.timur.app.kotlin3.fragments.SecondFragment
import kg.timur.app.kotlin3.fragments.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var menuItem: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuAdapter = PagerAdapter(initFragments(), supportFragmentManager, lifecycle)
        mainViewPager.adapter = menuAdapter

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homeFragment ->{
                    mainViewPager.currentItem = 0
                }
                R.id.resultFragment ->{
                    mainViewPager.currentItem = 1
                }
                R.id.favFragment ->{
                    mainViewPager.currentItem = 2
                }
            }
            true
        }

        mainViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })
    }

    private fun initFragments(): ArrayList<Fragment>{
        return arrayListOf(
            FirstFragment.newInstance(),
            SecondFragment.newInstance(),
            ThirdFragment.newInstance()
        )
    }

}