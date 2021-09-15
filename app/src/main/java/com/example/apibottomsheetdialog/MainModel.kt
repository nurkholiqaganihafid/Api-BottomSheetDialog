package com.example.apibottomsheetdialog

//"strSport": "Soccer",
//"strFormat": "TeamvsTeam",
//"strSportThumb": "https://www.thesportsdb.com/images/sports/soccer.jpg",

data class MainModel(val result: ArrayList<Result>) {

    data class Result (val id: Int, val title: String, val image: String)

}