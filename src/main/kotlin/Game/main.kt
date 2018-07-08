package Game

import org.newdawn.slick.AppGameContainer
import org.newdawn.slick.SlickException
import java.util.logging.Level
import java.util.logging.Logger
import kotlin.math.pow
import kotlin.math.sqrt

fun inside(x1: Float, x2: Float, y1: Float, y2: Float): Boolean {
    return when {
        y1 in x1..x2 -> true
        y2 in x1..x2 -> true
        x1 in y1..y2 -> true
        else -> false
    }
}

fun distance(x1:Float, y1:Float, x2:Float, y2:Float):Float{
    return(sqrt((x1 - x2).pow(2) + (y1 - y2).pow(2)))
}

fun main(args: Array<String>) {
    try {
        val appgc: AppGameContainer
        appgc = AppGameContainer(SimpleSlickGame("Simple Slick Game"))
        //appgc.setDisplayMode(640, 480, true)
        //appgc.setDisplayMode(450, 480, false)
        appgc.setShowFPS(false)
        appgc.setDisplayMode(1366, 768, true)
        //appgc.setDisplayMode(1920, 1080, true)
        appgc.start()
    } catch (ex: SlickException) {
        Logger.getLogger(SimpleSlickGame::class.java.name).log(Level.SEVERE, null, ex)
    }
}