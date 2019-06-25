# ViewPractice

Implements ViewDataModel and LiveData

class MainViewModel(app: Application): AndroidViewModel(app) {

    val headline = MutableLiveData<String>()
    init {
        Log.i("Practice", "view created")
        headline.value = "Yo! Yo!"
    }
}
