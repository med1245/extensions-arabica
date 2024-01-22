package com.animezid
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class animezidPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(animezid())
    }
}