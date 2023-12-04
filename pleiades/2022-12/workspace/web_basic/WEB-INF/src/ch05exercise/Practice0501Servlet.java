package ch05exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice0501Servlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //コンテンツタイプの指定
		response.setContentType("text/html; charset=utf-8");
		
      //画面の出力
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Practice0501Servlet</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("JSP/サーブレット基礎<br>");
		out.println("初めてのプログラム作成問題です。<br>");
		out.println("がんばってください。<br>");
		out.println("</BODY>");
		out.println("</HTML>");

	}
}
