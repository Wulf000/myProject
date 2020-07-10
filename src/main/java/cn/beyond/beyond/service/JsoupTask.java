package cn.beyond.beyond.service;

import java.beans.Encoder;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JsoupTask {

	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> loginCookie() throws Exception{
		/**
		 * 首页登陆
		 */
		/*String urlLogin = "http://10.253.129.127:12001/api-ucenter/user/login";
		Connection connectLogin = Jsoup.connect(urlLogin).timeout(5000);
		//请求参数
		Map<String,String> requestParam = new HashMap<>();
		requestParam.put("loginName", "admin");
		requestParam.put("loginPwd", "123456");
		
		//发送post请求
		//模拟浏览器header
		Map<String,String> headerParam = new HashMap<>();
		headerParam.put("Accept", "application/json");
		headerParam.put("Accept-Encoding", "gzip, deflate");
		headerParam.put("Accept-Language", "zh-CN,zh;q=0.9");
		headerParam.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
		connectLogin.headers(headerParam);
		connectLogin.data(requestParam);
		log.info("{}", JSONObject.toJSONString(connectLogin.request().data()));
		log.info("{}", JSONObject.toJSONString(connectLogin.request().headers()));
		connectLogin.post();
		//cookie
		log.info("{}", JSONObject.toJSONString(connectLogin.response()));*/
		
		
		
		
		String urlLogin = "https://www.baidu.com/s?ie=UTF-8&wd=Java定时任务";
		Connection connectLogin = Jsoup.connect(urlLogin).timeout(5000);
		
		//发送post请求
		//模拟浏览器header
		Map<String,String> headerParam = new HashMap<>();
		headerParam.put("Accept", "application/json");
		headerParam.put("Accept-Encoding", "gzip, deflate");
		headerParam.put("Accept-Language", "zh-CN,zh;q=0.9");
		headerParam.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36");
		connectLogin.headers(headerParam);
		log.info("{}", JSONObject.toJSONString(connectLogin.request().data()));
		log.info("{}", JSONObject.toJSONString(connectLogin.request().headers()));
		Document document = connectLogin.get();
		Elements elements = document.select("a");
		for (Element element : elements) {
			String attr = element.attr("href");
			log.info(attr);
		}
		String attr = document.select("a").attr("href");
		log.info(attr);
		//cookie
		log.info("{}", JSONObject.toJSONString(connectLogin.response()));
		
		
		return headerParam;
		
		
		
	}
}
