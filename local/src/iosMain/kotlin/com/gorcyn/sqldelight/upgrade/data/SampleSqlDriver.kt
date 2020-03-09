package com.gorcyn.sqldelight.upgrade.data

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

internal actual object SampleSqlDriver {
    actual var driver: SqlDriver? = NativeSqliteDriver(SampleDatabase.Schema, "MindDatabase.db")
}
