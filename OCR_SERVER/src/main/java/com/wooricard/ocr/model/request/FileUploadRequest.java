package com.wooricard.ocr.model.request;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadRequest {
	
	/**
	 * 요청 채널
	 * 01 - 학생증, 02 - 심사챗봇, 03 - 비대면 즉시심사
	 */
	private String requestChannel;
	
	/**
	 * 이미지 구분
	 * 01 - 신분증, 02 - 서류, 03 - 증명사진
	 */
	private String imageType;
	
	/**
	 * 이미지 순번(요청 순번)
	 * 001, 002, ...
	 */
	private String imageSeq;
	
	/**
	 * ECCNO or 임시키
	 */
	private String dataKey;
	
	/**
	 * 이미지 파일
	 */
	private List<MultipartFile> files;

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImageSeq() {
		return imageSeq;
	}

	public void setImageSeq(String imageSeq) {
		this.imageSeq = imageSeq;
	}

	public String getDataKey() {
		return dataKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcrProxyRequest [");
		if (requestChannel != null) {
			builder.append("requestChannel=");
			builder.append(requestChannel);
			builder.append(", ");
		}
		if (imageType != null) {
			builder.append("imageType=");
			builder.append(imageType);
			builder.append(", ");
		}
		if (imageSeq != null) {
			builder.append("imageSeq=");
			builder.append(imageSeq);
			builder.append(", ");
		}
		if (dataKey != null) {
			builder.append("dataKey=");
			builder.append(dataKey);
			builder.append(", ");
		}
		if (files != null) {
			builder.append("filesCount=");
			builder.append(files.size());
		}
		builder.append("]");
		return builder.toString();
	}

}
