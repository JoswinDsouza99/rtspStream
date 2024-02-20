package com.camera.ipcam.rtspstream;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoStreamController {
    public String startStream() {
        try(FFmpegFrameGrabber grabber = new FFmpegFrameGrabber("rtsp://192.168.1.7:8080/h264.sdp")) {
            grabber.start();
            Frame frame = grabber.grab();
            return "stream started";
        } catch (Exception e) {
            return "Error in streaming: " + e.getMessage();
        }
    }
}
