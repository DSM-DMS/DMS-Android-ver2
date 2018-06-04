package teamdms.dms_ver2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tabSelected () {
        when(tabLayout.selectedTabPosition) {
                0->Util.showToast(this, "Meal")
                1->Util.showToast(this, "apply")
                2->Util.showToast(this, "notice")
                3->Util.showToast(this, "myPage")
        }
    }
}
