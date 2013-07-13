package com.example.wu_mball;

import java.io.IOException;

import android.media.MediaRecorder;
import android.os.Environment;

/**
 * @author <a href="http://www.benmccann.com">Ben McCann</a>
 */
public class AudioRecorder {

	final MediaRecorder recorder = new MediaRecorder();
	final String path;

	/**
	 * Creates a new audio recording at the given path (relative to root of SD
	 * card).
	 */
	public AudioRecorder(String path) {
		this.path = sanitizePath(path);
	}

	private String sanitizePath(String path) {
		if (!path.startsWith("/")) {
			path = "/" + path;
		}
		if (!path.contains(".")) {
			path += ".3gp";
		}
		return Environment.getExternalStorageDirectory().getAbsolutePath()
				+ path;
	}

	/**
	 * Starts a new recording.
	 */
	public void start() throws IOException {
		recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
		recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
		//recorder.setOutputFile(path);
		recorder.prepare();
		recorder.start();
	}

	/**
	 * Stops a recording that has been previously started.
	 */
	public void stop() throws IOException {
		recorder.stop();
		recorder.release();
	}

}
