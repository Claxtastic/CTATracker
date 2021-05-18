package net.thomasclaxton.ctatracker

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import net.thomasclaxton.ctatracker.adapter.ETAAdapter
import net.thomasclaxton.ctatracker.adapter.LineAdapter
import net.thomasclaxton.ctatracker.databinding.ActivityMainBinding
import net.thomasclaxton.ctatracker.response.TrainTrackerResponse

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

  private lateinit var mainActivityBinding: ActivityMainBinding
  private lateinit var lineAdapter: LineAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)

    setContentView(mainActivityBinding.root)
    makeRequest()
    createLineRecyclerView()
  }

  private fun createLineRecyclerView() {
    lineAdapter = LineAdapter { line ->
      AlertDialog.Builder(this)
        .setTitle("Choose direction")
        .setPositiveButton(line.direction1, null)
        .setNegativeButton(line.direction2, null)
      .show()
    }

    lineAdapter.lines = TrainConstants.lines

    with(mainActivityBinding.rvLineList) {
      layoutManager = LinearLayoutManager(applicationContext)
      adapter = lineAdapter
    }
  }

  private fun makeRequest() {
//    val stationId = TrainConstants.redStations["Fullerton"]
//    val cta = RetroFitBuilder.build(CTA::class.java)
//    val response = cta.getArrivalsForStation(BuildConfig.ApiKey, stationId!!)
//
//    response.enqueue(object : Callback<TrainTrackerResponse> {
//      override fun onResponse(call: Call<TrainTrackerResponse>, response: Response<TrainTrackerResponse>) {
//        etaAdapter.refreshEtas(response.body()!!.data!!.eta)
//      }
//
//      override fun onFailure(call: Call<TrainTrackerResponse>, t: Throwable) {
//        print(t.message)
//      }
//    })
  }
}
