package kr.or.ddit.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress 클래스 ==> IP주소를 다루기 위한 클래스
		
		//www.naver.com의 IP정보 가져오기
		InetAddress ipTest = InetAddress.getByName("www.nate.com");
		
		System.out.println("hostName : "+ ipTest.getHostName());
		System.out.println("hostAddress : "+ ipTest.getHostAddress());
		System.out.println("toString : "+ ipTest.toString());
		System.out.println();
		
		//자신의 컴퓨터의 IP정보 가져오기
		InetAddress localIp = InetAddress.getLocalHost();
		System.out.println("hostName : " + localIp.getHostName());
		System.out.println("hostAddress : "+ localIp.getHostAddress());
		System.out.println();
		
		//IP주소가 여러개인 호스트의 정보 가져오기
		InetAddress[] ipArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ip : ipArr) {
			System.out.println(ip.toString());
		}
	}

}
