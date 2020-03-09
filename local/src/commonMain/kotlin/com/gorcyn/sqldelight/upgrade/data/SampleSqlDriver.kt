package com.gorcyn.sqldelight.upgrade.data

import com.squareup.sqldelight.db.SqlDriver

internal expect object SampleSqlDriver {
    var driver: SqlDriver?
}
