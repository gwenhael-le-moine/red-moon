package com.jmstudios.redmoon.receiver

import android.annotation.TargetApi
import android.service.quicksettings.TileService

import com.jmstudios.redmoon.activity.ShortcutToggleActivity

/**
 * Created by cj on 12/01/17.
 */

@TargetApi(24)
class TileReciever : TileService() {
    override fun onClick() {
        super.onClick()

        ShortcutToggleActivity.toggleAndFinish()
    }
}
