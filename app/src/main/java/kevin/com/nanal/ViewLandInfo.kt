package kevin.com.nanal

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Package com.hc.studyview
 * Created by HuaChao on 2016/6/3.
 */
class ViewLandInfo : View {

    private var defalutSize: Int = 0

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        //第二个参数就是我们在styles.xml文件中的<declare-styleable>标签
        //即属性集合的标签，在R文件中名称为R.styleable+name
        val a = context.obtainStyledAttributes(attrs, R.styleable.MyView)
        //第一个参数为属性集合里面的属性，R文件名称：R.styleable+属性集合名称+下划线+属性名称
        //第二个参数为，如果没有设置这个属性，则设置的默认的值
        defalutSize = a.getDimensionPixelSize(R.styleable.MyView_default_size, 100)
        //最后记得将TypedArray对象回收
        a.recycle()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        //第二个参数就是我们在styles.xml文件中的<declare-styleable>标签
        //即属性集合的标签，在R文件中名称为R.styleable+name
        val a = context.obtainStyledAttributes(attrs, R.styleable.MyView)
        //第一个参数为属性集合里面的属性，R文件名称：R.styleable+属性集合名称+下划线+属性名称
        //第二个参数为，如果没有设置这个属性，则设置的默认的值
        defalutSize = a.getDimensionPixelSize(R.styleable.MyView_default_size, 100)
        //最后记得将TypedArray对象回收
        a.recycle()
    }



    private fun getMySize(defaultSize: Int, measureSpec: Int): Int {
        var mySize = defaultSize

        val mode = View.MeasureSpec.getMode(measureSpec)
        val size = View.MeasureSpec.getSize(measureSpec)

        when (mode) {
            View.MeasureSpec.UNSPECIFIED -> {//如果没有指定大小，就设置为默认大小
                mySize = defaultSize
            }
            View.MeasureSpec.AT_MOST -> {//如果测量模式是最大取值为size
                //我们将大小取最大值,你也可以取其他值
                mySize = size
            }
            View.MeasureSpec.EXACTLY -> {//如果是固定的大小，那就不要去改变它
                mySize = size
            }
        }
        return mySize
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        var width = getMySize(defalutSize, widthMeasureSpec)
        var height = getMySize(defalutSize, heightMeasureSpec)

        if (width < height) {
            height = width
        } else {
            width = height
        }

        setMeasuredDimension(width, height)
    }

    override fun onDraw(canvas: Canvas) {
        //调用父View的onDraw函数，因为View这个类帮我们实现了一些
        // 基本的而绘制功能，比如绘制背景颜色、背景图片等
        super.onDraw(canvas)
        val r = measuredWidth / 2//也可以是getMeasuredHeight()/2,本例中我们已经将宽高设置相等了
        //圆心的横坐标为当前的View的左边起始位置+半径
        val centerX = left + r
        //圆心的纵坐标为当前的View的顶部起始位置+半径
        val centerY = top + r

        val paint = Paint()
        paint.color = Color.GREEN
        //开始绘制
        canvas.drawCircle(centerX.toFloat(), centerY.toFloat(), r.toFloat(), paint)
    }
}