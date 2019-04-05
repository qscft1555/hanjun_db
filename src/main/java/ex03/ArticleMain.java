package ex03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", org.jacob.book.chap03.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", org.jacob.book.chap03.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}