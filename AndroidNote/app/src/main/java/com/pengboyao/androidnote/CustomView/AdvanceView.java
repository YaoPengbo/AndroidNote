package com.pengboyao.androidnote.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * @类名:
 * @作者: bobbyyyao
 * @时间: 2016/11/9  9:51
 * @功能描述:
 */
public class AdvanceView extends View{

    private Paint mPaint = new Paint();
    private int mWidth;
    private int mHeight;
    private Context mContext;

    public AdvanceView(Context context) {
        this(context, null, 0);
    }

    public AdvanceView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AdvanceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initPaint();
    }

    private void initPaint(){
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5f);
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /**
         * canvas
         */
//        canvas.drawColor(Color.BLUE);
//
//        canvas.drawPoint(200, 200, mPaint);
//        canvas.drawPoints(new float[]{          //绘制一组点，坐标位置由float数组指定
//                500,500,
//                500,600,
//                500,700
//        },mPaint);

//        canvas.drawLine(300, 300, 500, 600,  mPaint);
//        canvas.drawLines(new float[]{
//                100, 200, 200, 200,
//                100, 300, 200, 300
//        }, mPaint);

//        canvas.drawRect(100, 100, 500, 400, mPaint);
//
//        Rect rect = new Rect(100, 100, 500, 400);
//        canvas.drawRect(rect, mPaint);

//        RectF rectF = new RectF(100, 100, 500, 400);
//        canvas.drawRect(rectF, mPaint);

//        RectF rectF = new RectF(100,100,600,400);
//        canvas.drawRoundRect(rectF,300,200,mPaint);

//        canvas.drawRoundRect(100,100,800,400,30,30,mPaint);

//        RectF rectF = new RectF(100,100,300,400);
//        canvas.drawOval(rectF,mPaint);

//        canvas.drawOval(100,100,800,400,mPaint);

//        canvas.drawCircle(200, 200, 200, mPaint);

//        RectF rectF = new RectF(100, 100, 400, 400);
//
//        mPaint.setColor(Color.BLUE);
//        canvas.drawArc(rectF, 0, 90, false, mPaint);
//
//        mPaint.setColor(Color.GREEN);
//        canvas.drawArc(rectF, 90, 200, false, mPaint);
//
//        mPaint.setColor(Color.RED);
//        canvas.drawArc(rectF, 290, 70, false, mPaint);

//        // 将坐标系原点移动到画布正中心
//        canvas.translate(mWidth / 2, mHeight / 2);
//
//        RectF rect = new RectF(0,-100,100,0);   // 矩形区域
//
//        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
//        canvas.drawRect(rect,mPaint);
//
//        canvas.scale(0.5f,0.5f);                // 画布缩放
//
//        mPaint.setColor(Color.BLUE);            // 绘制蓝色矩形
//        canvas.drawRect(rect,mPaint);

//        // 将坐标系原点移动到画布正中心
//        canvas.translate(mWidth / 2, mHeight / 2);
//
//        RectF rect = new RectF(0,-100,100,0);   // 矩形区域
//
//        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
//        canvas.drawRect(rect,mPaint);
//
//        canvas.scale(0.5f,0.5f,100,0);          // 画布缩放  <-- 缩放中心向右偏移了200个单位
//
//        mPaint.setColor(Color.BLUE);            // 绘制蓝色矩形
//        canvas.drawRect(rect,mPaint);

        // 将坐标系原点移动到画布正中心
//        canvas.translate(mWidth / 2, mHeight / 2);
//        RectF rect = new RectF(-200,-200,200,200);   // 矩形区域
//        for (int i=0; i<=30; i++)
//        {
//            canvas.scale(0.9f,0.9f);
//            canvas.drawRect(rect,mPaint);
//        }

//        canvas.translate(mWidth/2, mHeight/2);
//        RectF rectF = new RectF(0, -100, 100, 0);
//        mPaint.setColor(Color.BLACK);
//        canvas.drawRect(rectF, mPaint);
//        canvas.rotate(180);
//        canvas.drawRect(rectF, mPaint);

        // 将坐标系原点移动到画布正中心
//        canvas.translate(mWidth / 2, mHeight / 2);
//        canvas.drawCircle(0,0,100,mPaint);          // 绘制两个圆形
//        canvas.drawCircle(0,0,200,mPaint);
//        for (int i=0; i<=360; i+=10){               // 绘制圆形之间的连接线
//            canvas.drawLine(0,200,0,100,mPaint);
//            canvas.rotate(10);
//        }

//        Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.ic_launcher);
//        canvas.drawBitmap(bitmap, new Matrix(), new Paint());
//
//        // 将画布坐标系移动到画布中央
//        canvas.translate(mWidth/2,mHeight/2);
//        // 指定图片绘制区域(左上角的四分之一)
//        Rect src = new Rect(0,0,bitmap.getWidth()/2,bitmap.getHeight()/2);
//        // 指定图片在屏幕上显示的区域
//        Rect dst = new Rect(0,0,100,200);
//        // 绘制图片
//        canvas.drawBitmap(bitmap,src,dst,null);

        Paint textPaint = new Paint();          // 创建画笔
        textPaint.setColor(Color.BLACK);        // 设置颜色
        textPaint.setStyle(Paint.Style.FILL);   // 设置样式
        textPaint.setTextSize(50);              // 设置字体大小

//        // 文本(要绘制的内容)
//        String str = "ABCDEFG";
//        // 参数分别为 (文本 基线x 基线y 画笔)
//        canvas.drawText(str,200,500,textPaint);

//        String str = "SLOOP";
//        canvas.drawPosText(str,new float[]{
//                100,100,    // 第一个字符位置
//                200,200,    // 第二个字符位置
//                300,300,    // ...
//                400,400,
//                500,500
//        },textPaint);


        /**
         * Path
         */
//        canvas.translate(mWidth/2, mHeight/2);
//        Path path = new Path();
//        path.lineTo(100, 100);
////        path.moveTo(50, 150);
////        path.setLastPoint(50, 150);
//        path.lineTo(100, 0);
//        path.close();
//        canvas.drawPath(path, mPaint);

//        canvas.translate(mWidth / 2, mHeight / 2);  // 移动坐标系到屏幕中心
//        Path path = new Path();
//        path.addRect(-200,-200,200,200, Path.Direction.CW);
//        path.setLastPoint(-100,100);                // <-- 重置最后一个点的位置
//        canvas.drawPath(path,mPaint);

//        canvas.translate(mWidth / 2, mHeight / 2);  // 移动坐标系到屏幕中心
//        canvas.scale(1,-1);                         // <-- 注意 翻转y坐标轴
//        Path path = new Path();
//        Path src = new Path();
//        path.addRect(-200,-200,200,200, Path.Direction.CW);
//        src.addCircle(0,0,100, Path.Direction.CW);
//        path.addPath(src,0,200);
//        canvas.drawPath(path,mPaint);

//        canvas.translate(mWidth / 2, mHeight / 2);  // 移动坐标系到屏幕中心
//        canvas.scale(1,-1);                         // <-- 注意 翻转y坐标轴
//        Path path = new Path();
//        path.lineTo(100,100);
//        RectF oval = new RectF(0,0,300,300);
//        path.addArc(oval,0,270);
//// path.arcTo(oval,0,270,true);             // <-- 和上面一句作用等价
//        canvas.drawPath(path,mPaint);

//        canvas.translate(mWidth / 2, mHeight / 2);  // 移动坐标系到屏幕中心
//        canvas.scale(1,-1);                         // <-- 注意 翻转y坐标轴
//        Path path = new Path();
//        path.lineTo(100,100);
//        RectF oval = new RectF(0,0,300,300);
//        path.arcTo(oval,0,270);
//// path.arcTo(oval,0,270,false);             // <-- 和上面一句作用等价
//        canvas.drawPath(path,mPaint);

//        Path path = new Path();
////        Log.e("1",path.isEmpty()+"");
////        path.lineTo(100,100);
////        Log.e("2",path.isEmpty()+"");
//        path.lineTo(0,400);
//        path.lineTo(400,400);
//        path.lineTo(400,0);
//        path.lineTo(0,0);
//        RectF rect = new RectF();
//        boolean b = path.isRect(rect);
//        Log.e("Rect","isRect:"+b+"| left:"+rect.left+"| top:"+rect.top+"| right:"+rect.right+"| bottom:"+rect.bottom);

//        canvas.translate(mWidth / 2, mHeight / 2);  // 移动坐标系到屏幕中心
//        canvas.scale(1,-1);                         // <-- 注意 翻转y坐标轴
//        Path path = new Path();                     // path中添加一个圆形(圆心在坐标原点)
//        path.addCircle(0,0,100, Path.Direction.CW);
//        Path dst = new Path();                      // dst中添加一个矩形
//        dst.addRect(-200,-200,200,200, Path.Direction.CW);
//        path.offset(300,0,dst);                     // 平移
//        canvas.drawPath(path,mPaint);               // 绘制path
//        mPaint.setColor(Color.BLUE);                // 更改画笔颜色
//        canvas.drawPath(dst,mPaint);                // 绘制dst

        /**
         * PathMeasure
         */
/*        canvas.translate(mWidth/2, mHeight/2);
        Path path = new Path();
        path.lineTo(0,200);
        path.lineTo(200,200);
        path.lineTo(200,0);
        PathMeasure measure1 = new PathMeasure(path,false);
        PathMeasure measure2 = new PathMeasure(path,true);
        Log.e("TAG", "forceClosed=false---->"+measure1.getLength());
        Log.e("TAG", "forceClosed=true----->"+measure2.getLength());
        canvas.drawPath(path,mPaint);*/

/*        canvas.translate(mWidth / 2, mWidth / 2);          // 平移坐标系
        Path path = new Path();                                     // 创建Path并添加了一个矩形
        path.addRect(-200, -200, 200, 200, Path.Direction.CW);
        Path dst = new Path();                                      // 创建用于存储截取后内容的 Path
        PathMeasure measure = new PathMeasure(path, false);         // 将 Path 与 PathMeasure 关联
        // 截取一部分存入dst中，并使用 moveTo 保持截取得到的 Path 第一个点的位置不变
        measure.getSegment(200, 600, dst, true);
        canvas.drawPath(dst, mPaint);                        // 绘制 dst*/

/*        canvas.translate(mWidth / 2, mHeight / 2);      // 平移坐标系
        Path path = new Path();
        path.addRect(-100, -100, 100, 100, Path.Direction.CW);
        path.addRect(-150, -150, 150, 150, Path.Direction.CW);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float len1 = pathMeasure.getLength();
        pathMeasure.nextContour();
        float len2 = pathMeasure.getLength();
        Log.i("LEN","len1="+len1);                              // 输出两条路径的长度
        Log.i("LEN","len2="+len2);*/

    }
}
