package com.gorcyn.sqldelight.upgrade.data

val sampleDatabase: SampleDatabase by lazy {
    SampleDatabase.invoke(driver = SampleSqlDriver.driver!!)
}
