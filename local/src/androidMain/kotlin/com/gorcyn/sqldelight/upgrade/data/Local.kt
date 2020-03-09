package com.gorcyn.sqldelight.upgrade.data

import android.content.Context

actual object Local {
    fun setup(context: Context) {
        SampleSqlDriver.createDriver(context)
    }
}
