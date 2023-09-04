package com.test.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//webServlet 요청한 이름(value)
//클래스 1개와 jsp파일 1개와 일치
//처리 가능한 방법은 2가지 doGet, doPost
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    //생명주기 - 서블렛을 사용전부터 사용후까지 전과정
    private String message;
    //서블렛을 실행하기 전에 초기설정
    public void init() {
        message = "Hello World!";
    }
    
    //하나의 요청은 doGet, doPost
    //request(요청)-브라우저로 전달받은 내용, response(응답)-브라우저에 내용을 전달할 때
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //응답할 형식이 text/html형식
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter(); //웹브라우저에 출력
        out.println("<html><body>"); //문서시작
        out.println("<h1>" + message + "</h1>"); //헤드라인 massage에 저장된 내용을 출력
        out.println("</body></html>"); //문서끝
    }
    // 서블렛을 종료시 처리하는 메서드
    public void destroy() {
    }
}