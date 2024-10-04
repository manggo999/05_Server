package edu.kh.todolist.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable {
	                            // 직렬화
	private String title; // 제목
	private String detail; // 상세내용

}
