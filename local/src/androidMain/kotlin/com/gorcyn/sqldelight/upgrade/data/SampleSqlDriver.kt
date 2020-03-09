package com.gorcyn.sqldelight.upgrade.data

import android.content.Context

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

internal actual object SampleSqlDriver {
    actual var driver: SqlDriver? = null

    fun createDriver(context: Context) {
        driver = AndroidSqliteDriver(SampleDatabase.Schema, context, "MindDatabase.db")
    }
}
