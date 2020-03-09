package com.gorcyn.sqldelight.upgrade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gorcyn.sqldelight.upgrade.data.Item
import com.gorcyn.sqldelight.upgrade.data.Local
import com.gorcyn.sqldelight.upgrade.data.sampleDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Local.setup(this)

        val item = Item.Impl("ID", "name", "value")
        sampleDatabase.itemQueries.upsert(item)

        val found = sampleDatabase.itemQueries.selectById("ID").executeAsOne()
        Log.d("FOUND", "${found.name}: ${found.value}")
    }
}
