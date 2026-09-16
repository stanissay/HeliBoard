package helium314.keyboard.keyboard

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet

class WearKeyboardView(
    context: Context,
    attrs: AttributeSet? = null
) : KeyboardView(context, attrs) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.BLACK)

        paint.color = Color.WHITE
        paint.textSize = 32f

        canvas.drawText("WEAR TEST", 20f, 50f, paint)
    }
}
