package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardAttachVO {
	private String uuid;
	private String uploadPath;
	private String fileName;
	private boolean fileType;
	
	private Long bno;
}
