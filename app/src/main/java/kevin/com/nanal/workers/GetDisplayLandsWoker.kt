package kevin.com.nanal.workers

import androidx.work.Worker

class GetDisplayLandsWoker: Worker() {

    override fun doWork(): Result {

      return  Result.SUCCESS
    }
}