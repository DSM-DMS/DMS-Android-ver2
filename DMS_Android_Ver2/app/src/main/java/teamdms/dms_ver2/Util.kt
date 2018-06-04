package teamdms.dms_ver2

import android.content.Context
import android.widget.Toast

object Util {

    fun showToast (context : Context, massage : String) {
        Toast.makeText(context,massage,Toast.LENGTH_SHORT).show()
    }
}