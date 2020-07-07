package info.manxi.cv;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Size;

import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imwrite;
import static org.bytedeco.opencv.global.opencv_imgproc.INTER_LINEAR;
import static org.bytedeco.opencv.global.opencv_imgproc.resize;

/**
 * desc
 *
 * @author sheldon 80752866
 * @project javaCpp
 * @since 2020/7/6
 */
public class ResizeImg {
    public static void main(String[] args) {
        Mat imread = imread("/Users/sheldon/Pictures/5.jpg");
        Mat dst = new Mat();
        resize(imread, dst, new Size(), 0.5, 0.5, INTER_LINEAR);
        imwrite("/Users/sheldon/Pictures/4.jpg", dst);
    }
}
