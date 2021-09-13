package com.example.apibottomsheetdialog

//"strSport": "Soccer",
//"strFormat": "TeamvsTeam",
//"strSportThumb": "https://www.thesportsdb.com/images/sports/soccer.jpg",

data class MainModel(val result: ArrayList<Sports>) {

    data class Sports (val strSport: String, val strFormat: String, val strSportThumb: String)

}