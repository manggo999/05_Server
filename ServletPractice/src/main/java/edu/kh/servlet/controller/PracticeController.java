package edu.kh.servlet.controller;

// Controller : 요청에 따라 어떤 Service를 호출할지 "제어"하고,
//              어떻게 응답을 할 지 "제어"하는 역할 

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/* 
 * HttpServlet
 * - http 프로토콜 서비스를 지원하는 추상 클래스
 * -> 상속(extends) 받아서 사용
 *
 * - 해당 클래스를 상속 받았다고 해서 
 *   클라이언트의 요청을 받아서 처리할 수 있는 
 *   진짜 servlet이 된 것이 아니다!!
 *  따로 더 해줘야 한다.
 *  
 *  [Servlet 등록 절차]
 * 1. web.xml 에 직접 작성하기
 *
 * 2. @WebServlet() 어노테이션을 이용하는 방법
 *
 *
 */

@WebServlet("/signUp")
public class PracticeController extends HttpServlet {
	
	@Override
	protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// HttpServletRequest
		// - 클라이언트 요청 시 생성되는 객체
		// - 요청 시 전달된 데이터,
		//   요청한 클라이언트 정보,
		//   유연한 요청 처리를 하기 위한 객체를 제공함
		
		// HttpServletResponse
		// - 클라이언트 요청 시 생성되는 객체
		// - 서버가 클라이언트에게 응답하기 위한 방법을 제공함
		//  서버 -> 클라이언트로 연결된 출력용 스트림 제공(PrintWriter)
		
		// 서버가 해야할 행동
		
		// 요청 시 입력된 아이디, 비밀번호, 비번확인, 이름, 나이를 전달 받아오기
		
		// Parameter : 매개변수 == 다른곳의 값을 전달 받아올 때 사용
		
		// req.getParameter("name 속성값");
		// -> 요청 시 전달된 데이터 중
		// name 속성값이 일치하는 데이터의 value를 얻어와
		// String 형태로 반환
		// !!!! HTML에서 얻어오는 모든 값은 String !!!!
		String inputId = req.getParameter("inputId");
		String inputPw = req.getParameter("inputPw");
		String inputPwCheck = req.getParameter("inputPwCheck");
		String inputName = req.getParameter("inputName");
		String inputAge = req.getParameter("inputAge");
		
		System.out.println(inputId);
		System.out.println(inputPw);
		System.out.println(inputPwCheck);
		System.out.println(inputName);
		System.out.println(inputAge);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/signup_result.jsp");
		
		dispatcher.forward(req, resp);
		
		
	}
	
	
	

}
