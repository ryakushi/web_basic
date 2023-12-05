package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JapaneseServlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException , IOException{
		
		//コンテンツタイプの指定
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("日本語を表示するServlet!");
		
	}
}
