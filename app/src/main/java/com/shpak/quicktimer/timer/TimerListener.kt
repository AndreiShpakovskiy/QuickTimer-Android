package com.shpak.quicktimer.timer

interface TimerListener {
    fun onTick(leftTimeMillis: Long)
    fun onTimeOver()
}