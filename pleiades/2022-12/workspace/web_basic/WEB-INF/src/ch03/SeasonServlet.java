package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SeasonServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//自作クラスのオブジェクト化
		Season season = new Season();
		//		季節名の取得
		String seasonName = season.getSeason();
		
		//画面の出力
		PrintWriter out = response.getWriter();
		out.println("Season is " + seasonName);
	}

}
